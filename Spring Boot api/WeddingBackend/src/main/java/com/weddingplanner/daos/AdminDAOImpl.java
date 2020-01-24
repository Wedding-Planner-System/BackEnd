package com.weddingplanner.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.weddingplanner.pojos.AdminLogin;

@Repository
public class AdminDAOImpl implements IAdminDao
{
	
	//@Autowired
	//SessionFactory sf;
	
	@PersistenceContext
	private EntityManager mgr;
	
	public AdminDAOImpl()
	{
		System.out.println("in user dao");
	}

	@Override
	public String validateUser(String uname, String pwd) {
		// TODO Auto-generated method stub
		
		AdminLogin alogin=null;
		String jpql="select a from AdminLogin a where a.username=:un and a.password=:pwd";
		try
		{
		alogin=mgr.unwrap(Session.class).createQuery(jpql,AdminLogin.class).setParameter("un", uname).setParameter("pwd", pwd).getSingleResult();
		return "Success";
		}
		catch(Exception e)
		{
			return "Failed";
		}
		
	}

}
