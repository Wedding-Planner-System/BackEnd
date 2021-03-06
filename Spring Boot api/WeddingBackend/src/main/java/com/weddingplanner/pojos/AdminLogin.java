/*
 *  purpose: tbl_AdminSettings
 *  author: Poonam K
 *  Date: 16-01-2020
 */
package com.weddingplanner.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_AdminSettings")
public class AdminLogin 
{
	
	


	private Integer loginId;
	private String username,password;
	
	//defualt constructor
	public AdminLogin()
	{
		System.out.println("in adminLogin default constructor"); 
	}


	//parameterised Constructor
	public AdminLogin(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	@Id
	public Integer getLoginId() {
		return loginId;
	}


	public void setLoginId(Integer loginId) {
		this.loginId = loginId;
	}

	@Column(name = "username")
	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "AdminLogin [username=" + username + ", password=" + password + "]";
	}
	
	

}
