package com.weddingplanner.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weddingplanner.daos.IContactUsDao;
import com.weddingplanner.pojos.ContactUs;

@Service
@Transactional
public class ContactUsServiceImpl implements IContactUsService {

	@Autowired
	IContactUsDao dao;
	
	public ContactUsServiceImpl() {
		System.out.println("in ContactUsServiceImpl ctor");
	}
	@Override
	public String saveContactUsDetails(ContactUs cs) {
		// TODO Auto-generated method stub
		return dao.saveContactUsDetails(cs);
	}

}
