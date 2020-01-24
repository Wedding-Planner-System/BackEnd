/*
 * purpose: tbl_ContactUs
 *  author: Poonam K
 *  Date: 16-01-2020
 */
package com.weddingplanner.pojos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "tbl_ContactUs")
public class ContactUs 
{
	//id Name Email Message
	private Integer id;
	private String name,email,message;
	private Date createdDate;
	
	public ContactUs() 
	{
		System.out.println("in ContactUs Default constructor");
	}
	
	
	
	public ContactUs(Integer id, String name, String email, String message, Date createdDate) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.message = message;
		this.createdDate = createdDate;
	}

	

	public ContactUs(String name, String email, String message, Date createdDate) {
		super();
		this.name = name;
		this.email = email;
		this.message = message;
		this.createdDate = createdDate;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}


	@Column(length = 250)
	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getCreatedDate() {
		return createdDate;
	}



	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}



		

}
