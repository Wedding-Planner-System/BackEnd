/*
 *  author: Poonam K
 *  Date: 16-01-2020
 */

package com.weddingplanner.pojos;

import javax.persistence.Embeddable;

@Embeddable
public class Address 
{	
	
	private String area,street,city,state,pinCode;	
	
	public Address()
	{
		System.out.println("in Address Default constructor");
	}


	public Address(String area, String streetNo, String city, String state, String pinCode) {
		super();
		System.out.println("in const");
		this.area = area;
		this.street = streetNo;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}


	@Override
	public String toString() {
		return "Address [area=" + area + ", street=" + street + ", city=" + city + ", state=" + state + ", pinCode="
				+ pinCode + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getPinCode() {
		return pinCode;
	}


	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	
	
	
	

}
