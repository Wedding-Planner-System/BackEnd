package com.weddingplanner.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weddingplanner.daos.IAdminDao;
import com.weddingplanner.pojos.AdminLogin;

@Service
@Transactional
public class UserServiceImpl  implements IUserService
{
	
	@Autowired
	IAdminDao dao;
	
	public UserServiceImpl() {
		// TODO Auto-generated constructor stub
		System.out.println("in user service ");
	}

	@Override
	public String validateUser(String uname, String pwd) {
		// TODO Auto-generated method stub
		return dao.validateUser(uname, pwd);
	}

}
