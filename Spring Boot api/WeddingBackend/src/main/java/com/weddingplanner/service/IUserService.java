package com.weddingplanner.service;

import com.weddingplanner.pojos.AdminLogin;

public interface IUserService 
{

	String validateUser(String uname,String pwd);
}
