package com.weddingplanner.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weddingplanner.daos.IEventDao;
import com.weddingplanner.pojos.Event;

@Service
@Transactional
public class EventService implements IEventService {
	
	@Autowired
	private IEventDao dao;
	
	@Override
	public String addEvent(Event e)
	{
		
		return dao.bookEvent(e);
	}
	
	@Override
	public List<Event> getAllEvents(){
		
		return dao.getAllEvents();
	}

	@Override
	public Event getEventById(int id) {
		return dao.getEventById(id);
		
	}

	@Override
	public Event updateEvent(Event e) {
		return dao.updateEvent(e);
	}
	

}
