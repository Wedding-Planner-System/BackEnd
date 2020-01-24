package com.weddingplanner.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.weddingplanner.daos.IVendorDao;
import com.weddingplanner.pojos.Vendor;


@Service
@Transactional
public class VendorServiceImpl implements IVendorService
{
	@Autowired
	private IVendorDao dao;
	
	
	  public VendorServiceImpl() {
		// TODO Auto-generated constructor stub
		System.out.println("in vendor service ");
	}
	
	
	@Override
	public Vendor saveVendorDetails(Vendor v)
	{
		return dao.saveVendorDetails(v);
	}


	@Override
	public List<Vendor> getAllVendors() {
		
		return dao.getAllVendors();
	}


	@Override
	public Vendor getVendorByEmail(String Email) {
		// TODO Auto-generated method stub
		return dao.getVendorByEmail(Email);
	}


	@Override
	public Vendor getVendorById(int id) {
		// TODO Auto-generated method stub
		return dao.getVendorDetails(id);
	}


	@Override
	public Vendor updateVendorDetails(Vendor v) {
		// TODO Auto-generated method stub
		return dao.updateVendorDetails(v);
	}

}
