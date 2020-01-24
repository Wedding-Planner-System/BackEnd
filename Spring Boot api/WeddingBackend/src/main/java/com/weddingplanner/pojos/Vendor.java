package com.weddingplanner.pojos;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;;


@Entity
@Table(name = "tbl_Vendor")
public class Vendor 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer vendorId;
	
	private String firstName;
	
	private String lastName;
	private String email;

	@Column( length = 10)
	private int contactNo;
	
	@Embedded
	private Address address;
	private String serviceType;
	
	@Column(length = 1)
	private String status;
	private LocalDate createdDate;
	private LocalDate lastModifiedDate;
	
	public Vendor()
	{
		System.out.println("In Vendor Default constructor");
	}

	

	

	
	public Vendor(Integer venodrID, String firstName, String lastName, String email, int contactNo, Address address,
			String serviceType, String status, LocalDate createdDate, LocalDate lastModifiedDate) {
		super();
		this.vendorId = venodrID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.contactNo = contactNo;
		this.address = address;
		this.serviceType = serviceType;
		this.status = status;
		this.createdDate = createdDate;
		this.lastModifiedDate = lastModifiedDate;
	}






	public Vendor(String firstName, String lastName, String email, int contactNo, Address address, String serviceType,
			String status, LocalDate createdDate, LocalDate lastModifiedDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.contactNo = contactNo;
		this.address = address;
		this.serviceType = serviceType;
		this.status = status;
		this.createdDate = createdDate;
		this.lastModifiedDate = lastModifiedDate;
	}






	public String getStatus() {
		return status;
	}






	public void setStatus(String status) {
		this.status = status;
	}






	public Integer getVendorId() {
		return vendorId;
	}



	public void setVendorId(Integer venodrID) {
		this.vendorId = venodrID;
	}


	
	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	
	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	
	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public int getContactNo() {
		return contactNo;
	}



	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}


	
	public Address getAddress() {
		return address;
	}



	public void setAddress(Address addr) {
		this.address = addr;
	}



	public String getServiceType() {
		return serviceType;
	}



	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}



	public LocalDate getCreatedDate() {
		return createdDate;
	}



	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}



	public LocalDate getLastModifiedDate() {
		return lastModifiedDate;
	}



	public void setLastModifiedDate(LocalDate lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}






	@Override
	public String toString() {
		return "Vendor [venodrID=" + vendorId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", contactNo=" + contactNo + ", address=" + address + ", serviceType=" + serviceType
				+ ", status=" + status + ", createdDate=" + createdDate + ", lastModifiedDate=" + lastModifiedDate
				+ "]";
	}



	


	
	
	
	
}
