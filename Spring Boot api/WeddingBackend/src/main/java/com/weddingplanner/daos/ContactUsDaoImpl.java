package com.weddingplanner.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.weddingplanner.pojos.ContactUs;
import com.weddingplanner.daos.IContactUsDao;
@Repository
public class ContactUsDaoImpl implements IContactUsDao{
	@PersistenceContext
	private EntityManager mgr;
	
	
	public ContactUsDaoImpl() {
		System.out.println("in contactusdaoimpl");
	}
	
	@Override
	public String saveContactUsDetails(ContactUs cs) {
		((EntityManager) mgr.unwrap(Session.class)).persist(cs);
		return "Your detais saved successfully! We will contact you soon...";
	}
	

	
}
