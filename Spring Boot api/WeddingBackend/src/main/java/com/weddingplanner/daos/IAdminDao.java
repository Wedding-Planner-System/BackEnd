package com.weddingplanner.daos;

import com.weddingplanner.pojos.AdminLogin;

public interface IAdminDao 
{

	String validateUser(String uname,String pwd);
}
