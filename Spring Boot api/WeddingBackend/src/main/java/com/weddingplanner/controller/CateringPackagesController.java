package com.weddingplanner.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weddingplanner.pojos.Package;
import com.weddingplanner.service.IPackagesService;

@RestController
@RequestMapping("/cateringpackages")
@CrossOrigin
public class CateringPackagesController {

	@Autowired
	private IPackagesService service;
	
	@PostConstruct
	public void init() {
		System.out.println("in init " + service);
	}
		// REST request handling method to  get all CateringPackages.
		@GetMapping
		public ResponseEntity<?> getAllCateringPackages() 
		{
			System.out.println("in gel all cat pkgs");
			// invoke service layer method to get CatPkgdlist
			List<Package> allCateringPackages = service.getAllCateringPackages();
			if (allCateringPackages.size() == 0)
				return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
			return new ResponseEntity<List<Package>>(allCateringPackages, HttpStatus.OK);
		}


	}

