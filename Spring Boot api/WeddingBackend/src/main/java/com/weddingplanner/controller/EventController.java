package com.weddingplanner.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weddingplanner.pojos.Event;
import com.weddingplanner.service.IEventService;

@RestController
@RequestMapping("/event")
@CrossOrigin
public class EventController {
	
	@Autowired
	private IEventService svc;
	
	
//REST req handling method to insert Events	
	@PostMapping
	public ResponseEntity<?> bookEvent(@RequestBody Event e)
	{
		
		try
		{
			return new ResponseEntity<String>( svc.addEvent(e), HttpStatus.CREATED);
		}
		catch (RuntimeException ee) {
			ee.printStackTrace();
			return new ResponseEntity<String> (HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
	}
	
	
	// REST req handling method to get all Events
	@GetMapping
	public ResponseEntity<?> getAllEvents() {
		System.out.println("in gel all Events Controller");
		List<Event> allEvents = svc.getAllEvents();
		if (allEvents.size() == 0)
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
			return new ResponseEntity<List<Event>>(allEvents, HttpStatus.OK);
	}
	 
	
	
	 // REST req handling method to get emp dtls by id
	@GetMapping("/{eventId}")
	public ResponseEntity<?> getEventDetails(@PathVariable int eventId) {
		System.out.println("get emp dtls " + eventId);
		Event eventDetails = svc.getEventById(eventId);
		if (eventDetails == null)
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		return new ResponseEntity<Event>(eventDetails, HttpStatus.OK);
	}
	 
	

}
