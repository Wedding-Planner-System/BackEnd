/*
 * purpose: tbl_Events
 *  author: Bushra S
 *  Date: 19-01-2020
 */

package com.weddingplanner.pojos;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_Packages")
public class Package {

	private Integer packageId;
	private int vendorId;
	private String packageName;
	private double packageAmount;
	private byte[] packageImage;
	private String packageType;//catering or decoration



	public Package() {
		
		super();
		System.out.println("In Package def ctor");
	}



	public Package(int vendorId, String packageName, double packageAmount, byte[] packageImage, String packageType) {
		super();
		this.vendorId = vendorId;
		this.packageName = packageName;
		this.packageAmount = packageAmount;
		this.packageImage = packageImage;
		this.packageType = packageType;
	}

	


	public Package(Integer packageId, int vendorId, String packageName, double packageAmount, byte[] packageImage,
			String packageType) {
		super();
		this.packageId = packageId;
		this.vendorId = vendorId;
		this.packageName = packageName;
		this.packageAmount = packageAmount;
		this.packageImage = packageImage;
		this.packageType = packageType;
	}

 

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getPackageId() {
		return packageId;
	}

	public void setPackageId(Integer packageId) {
		this.packageId = packageId;
	}

	public int getVendorId() {
		return vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public double getPackageAmount() {
		return packageAmount;
	}

	public void setPackageAmount(double packageAmount) {
		this.packageAmount = packageAmount;
	}

	@Lob
	public byte[] getPackageImage() {
		return packageImage;
	}

	public void setPackageImage(byte[] packageImage) {
		this.packageImage = packageImage;
	}
	public String getPackageType() {
		return packageType;
	}



	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}



	@Override
	public String toString() {
		return "Package [packageId=" + packageId + ", vendorId=" + vendorId + ", packageName=" + packageName
				+ ", packageAmount=" + packageAmount + ", packageImage=" + Arrays.toString(packageImage)
				+ ", packageType=" + packageType + "]";
	}


}
