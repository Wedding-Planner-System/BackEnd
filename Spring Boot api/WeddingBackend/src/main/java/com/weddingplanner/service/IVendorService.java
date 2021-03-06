package com.weddingplanner.service;

import java.util.List;

import com.weddingplanner.pojos.Vendor;

public interface IVendorService
{

	public Vendor saveVendorDetails(Vendor v);
	
	public List<Vendor> getAllVendors();
	
	public Vendor getVendorByEmail(String Email);
	
	public Vendor getVendorById(int id);
	
	public Vendor updateVendorDetails(Vendor v);
	
}
