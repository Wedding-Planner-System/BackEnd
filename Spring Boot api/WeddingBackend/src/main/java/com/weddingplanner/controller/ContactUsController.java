package com.weddingplanner.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.weddingplanner.pojos.ContactUs;
import com.weddingplanner.service.IContactUsService;

@RestController
@RequestMapping("/contactus")
@CrossOrigin
public class ContactUsController {

	
	@Autowired
	IContactUsService service;
	
	public ContactUsController() {
		System.out.println("in contact us controller");
	}
	@PostMapping
	public ResponseEntity<?> saveContactUsDetails(@RequestBody ContactUs cs
			) {
		System.out.println("in save contact us details " + cs.getMessage()); 
		
		try
		{ 
			return new ResponseEntity<String>( service.saveContactUsDetails(cs), HttpStatus.CREATED);
		}
		catch (RuntimeException e)
		{ 
			e.printStackTrace();
			return new ResponseEntity<String> (HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
}
