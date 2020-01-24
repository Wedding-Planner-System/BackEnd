package com.weddingplanner.daos;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.weddingplanner.pojos.Vendor;

@Repository
public class VendorDaoImpl  implements IVendorDao{
	
	@PersistenceContext
	private EntityManager mgr;
	
	public VendorDaoImpl() 
	{
		System.out.println("in Vendor dao");
	
	}
	
	
	@Override
	public Vendor saveVendorDetails(Vendor v) {
		// TODO Auto-generated method stub
		
		mgr.unwrap(Session.class).persist(v);//persistent
		return v;
	}


	@Override
	public List<Vendor> getAllVendors() {
		String jpql = "select v from Vendor v where v.status=:st";
		return mgr.unwrap(Session.class).
				createQuery(jpql, Vendor.class).setParameter("st", "1").getResultList();
	}


	@Override
	public Vendor getVendorByEmail(String email) {
		// TODO Auto-generated method stub
		String jpql="select v from Vendor v where v.email=:em";
		try
		{
			System.out.println("test");
		return mgr.unwrap(Session.class).createQuery(jpql, Vendor.class).setParameter("em", email).getSingleResult();
	
		}
		catch(Exception e)
		{
			System.out.println("test1");
			return null;
		}
	}


	


	@Override
	public Vendor getVendorDetails(int id) {
		// TODO Auto-generated method stub
		return mgr.unwrap(Session.class).get(Vendor.class, id);
	}


	@Override
	public Vendor updateVendorDetails(Vendor v) {
		// TODO Auto-generated method stub
		System.out.println("in update");
		 mgr.unwrap(Session.class).update(v);
		 return v;
	}
}
