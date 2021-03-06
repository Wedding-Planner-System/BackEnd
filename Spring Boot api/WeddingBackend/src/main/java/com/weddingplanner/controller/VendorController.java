package com.weddingplanner.controller;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.weddingplanner.pojos.Vendor;
import com.weddingplanner.service.IUserService;
import com.weddingplanner.service.IVendorService;

@RestController
@RequestMapping("/vendor")
@CrossOrigin
public class VendorController
{
	
	@Autowired
	private IVendorService service;
	

	public VendorController() {
		// TODO Auto-generated constructor stub
		System.out.println("in Vendor controller");
	}
	
	@PostMapping
	public ResponseEntity<?> saveVendorDetails(@RequestBody Vendor v) {
		
		try {
			
			System.out.println(v.getEmail());
			Vendor v1=service.getVendorByEmail(v.getEmail());
			//System.out.println(v1.toString());
			if(v1==null)
			{
			
				System.out.println("rtest");
			v.setCreatedDate(LocalDate.now());
			v.setLastModifiedDate(LocalDate.now());
			v.setStatus("1");
			return new ResponseEntity<Vendor>(service.saveVendorDetails(v),HttpStatus.CREATED);
			}
			else
			{
				System.out.println("svs");
				JSONObject obj=new JSONObject();
				obj.put("message","Email aready Exists");
				return new ResponseEntity<JSONObject>(obj,HttpStatus.OK);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("tetst2");
			return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
		} 
	}
	
	@GetMapping
	
	public ResponseEntity<?> getAllVendors()
	{
		List<Vendor> allVendor = service.getAllVendors();
		if(allVendor.size() == 0)
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<Vendor>>(allVendor,HttpStatus.OK);
			
	}
	
	@DeleteMapping("/{vendorId}")
	public ResponseEntity<Vendor> deleteVendor(@PathVariable int vendorId) {
		System.out.println("del vendor dtls " + vendorId);
		Vendor theVendor=service.getVendorById(vendorId);
		theVendor.setStatus("0");
		service.updateVendorDetails(theVendor);
        return new ResponseEntity<Vendor>(theVendor,HttpStatus.OK);

	}
	
	@GetMapping("/{vendorId}")
	public ResponseEntity<Vendor> getVendorById(@PathVariable int vendorId) {
		System.out.println("get vendor dtls " + vendorId);
		Vendor theVendor=service.getVendorById(vendorId);
        return new ResponseEntity<Vendor>(theVendor,HttpStatus.OK);

	}
	
	@PutMapping("/{vendorId}")
	public ResponseEntity<Vendor> updateVendorDetails(@RequestBody Vendor vendor) {
		System.out.println("update vendor dtls " + vendor.getFirstName());
		vendor.setStatus("1");
		Vendor theVendor=service.updateVendorDetails(vendor);
		
        return new ResponseEntity<Vendor>(theVendor,HttpStatus.OK);

	}
	 
}
