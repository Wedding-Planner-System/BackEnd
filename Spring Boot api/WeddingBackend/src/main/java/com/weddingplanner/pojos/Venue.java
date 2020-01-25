/*
 *  author: Poonam K
 *  Date: 16-01-2020
 */
package com.weddingplanner.pojos;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tbl_Venue")
public class Venue 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer venueId;
	private String venueName;
	@Embedded
	private Address address;
	private double lattitude,logitude;
	private int capacity;
	private double price;
	private String extra;
	@Lob
	private byte[] venueImage;
	private Date createdDate;
	private Date lastModifiedDate;
	
	//default constructor
	public Venue()
	{
		System.out.println("in Venue default constructor");
	}

	//paramterised construdtor
	public Venue(Integer venueId, String venueName, Address address, double lattitude, double logitude, int capacity,
			double price, String extra, byte[] venueImage, Date createdDate, Date lastModifiedDate) {
		super();
		this.venueId = venueId;
		this.venueName = venueName;
		this.address = address;
		this.lattitude = lattitude;
		this.logitude = logitude;
		this.capacity = capacity;
		this.price = price;
		this.extra = extra;
		this.venueImage = venueImage;
		this.createdDate = createdDate;
		this.lastModifiedDate = lastModifiedDate;
	}

	public Venue(String venueName, Address address, double lattitude, double logitude, int capacity, double price,
			String extra, byte[] venueImage, Date createdDate, Date lastModifiedDate) {
		super();
		this.venueName = venueName;
		this.address = address;
		this.lattitude = lattitude;
		this.logitude = logitude;
		this.capacity = capacity;
		this.price = price;
		this.extra = extra;
		this.venueImage = venueImage;
		this.createdDate = createdDate;
		this.lastModifiedDate = lastModifiedDate;
	}

	public Integer getVenueId() {
		return venueId;
	}

	public void setVenueId(Integer venueId) {
		this.venueId = venueId;
	}

	public String getVenueName() {
		return venueName;
	}

	public void setVenueName(String venueName) {
		this.venueName = venueName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public double getLattitude() {
		return lattitude;
	}

	public void setLattitude(double lattitude) {
		this.lattitude = lattitude;
	}

	public double getLogitude() {
		return logitude;
	}

	public void setLogitude(double logitude) {
		this.logitude = logitude;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getExtra() {
		return extra;
	}

	public void setExtra(String extra) {
		this.extra = extra;
	}

	public byte[] getVenueImage() {
		return venueImage;
	}

	public void setVenueImage(byte[] venueImage) {
		this.venueImage = venueImage;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	@Override
	public String toString() {
		return "Venue [venueId=" + venueId + ", venueName=" + venueName + ", address=" + address + ", lattitude="
				+ lattitude + ", logitude=" + logitude + ", capacity=" + capacity + ", price=" + price + ", extra="
				+ extra + ", venueImage=" + Arrays.toString(venueImage) + ", createdDate=" + createdDate
				+ ", lastModifiedDate=" + lastModifiedDate + "]";
	}
}
