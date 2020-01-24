/*
 * purpose: tbl_Events
 *  author: Bushra S
 *  Date: 18-01-2020
 */

package com.weddingplanner.pojos;

import java.util.Arrays;
import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cache;

import ch.qos.logback.core.subst.Token.Type;

@Entity
@Table(name = "tbl_Events")
public class Event {
//fn ln cont ema
	private String userFirstName;
	private String userLastName;
	private String userEmail;
	private String userContactNumber;
	private Integer eventId;
	private Date createdDate;
	private int serviceId;
	private String paymentStatus;
	private double amount;
	private String eventStatus;
	private Date fromDate;
	private Date toDate;
	private Date lastModifiedDate;
	private String status;
	private byte[] eventImage;

	// default constructor
	public Event() {
		super();
		System.out.println("Testing Purpose in Event");
	}
	//para ctor except eventId
	public Event(String userFirstName, String userLastName, String userEmail, String userContactNumber,
			Date createdDate, int serviceId, String paymentStatus, double amount, String eventStatus, Date fromDate,
			Date toDate, Date lastModifiedDate, String status, byte[] eventImage) {
		super();
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userEmail = userEmail;
		this.userContactNumber = userContactNumber;
		this.createdDate = createdDate;
		this.serviceId = serviceId;
		this.paymentStatus = paymentStatus;
		this.amount = amount;
		this.eventStatus = eventStatus;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.lastModifiedDate = lastModifiedDate;
		this.status = status;
		this.eventImage = eventImage;
	}
	
	
	
	//parameterized constructor with all attributes
	
	public Event(String userFirstName, String userLastName, String userEmail, String userContactNumber, Integer eventId,
			Date createdDate, int serviceId, String paymentStatus, double amount, String eventStatus, Date fromDate,
			Date toDate, Date lastModifiedDate, String status, byte[] eventImage) {
		super();
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userEmail = userEmail;
		this.userContactNumber = userContactNumber;
		this.eventId = eventId;
		this.createdDate = createdDate;
		this.serviceId = serviceId;
		this.paymentStatus = paymentStatus;
		this.amount = amount;
		this.eventStatus = eventStatus;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.lastModifiedDate = lastModifiedDate;
		this.status = status;
		this.eventImage = eventImage;
	}
	
	//All getters and setters
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getEventId() {
		return eventId;
	}

	
	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}

	@Temporal(TemporalType.TIMESTAMP)

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public int getServiceId() {
		return serviceId;
	}

	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getEventStatus() {
		return eventStatus;
	}

	public void setEventStatus(String eventStatus) {
		this.eventStatus = eventStatus;
	}

	@Temporal(TemporalType.TIMESTAMP)
	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Lob
	public byte[] getEventImage() {
		return eventImage;
	}

	public void setEventImage(byte[] eventImage) {
		this.eventImage = eventImage;
	}
	
	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserContactNumber() {
		return userContactNumber;
	}
	public void setUserContactNumber(String userContactNumber) {
		this.userContactNumber = userContactNumber;
	}
	@Override
	public String toString() {
		return "Event [userFirstName=" + userFirstName + ", userLastName=" + userLastName + ", userEmail=" + userEmail
				+ ", userContactNumber=" + userContactNumber + ", eventId=" + eventId + ", createdDate=" + createdDate
				+ ", serviceId=" + serviceId + ", paymentStatus=" + paymentStatus + ", amount=" + amount
				+ ", eventStatus=" + eventStatus + ", fromDate=" + fromDate + ", toDate=" + toDate
				+ ", lastModifiedDate=" + lastModifiedDate + ", status=" + status + ", eventImage="
				+ Arrays.toString(eventImage) + "]";
	}

	

}
