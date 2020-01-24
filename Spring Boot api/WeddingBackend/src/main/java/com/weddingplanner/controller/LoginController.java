package com.weddingplanner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.weddingplanner.service.IUserService;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class LoginController 
{
	
	@Autowired
	IUserService service;
	
	public LoginController() {
		// TODO Auto-generated constructor stub
		System.out.println("in user controller");
	}
	
	@PostMapping
	public ResponseEntity<String> validateUser(@RequestParam String username,@RequestParam String password,@RequestParam(value="image",required=false) MultipartFile image) {
		System.out.println("in valudate iuser " + username + " " + password);
		String  a=service.validateUser(username, password);
		System.out.println(a);
	
		
		return new ResponseEntity<>(a, HttpStatus.OK);
	}

}