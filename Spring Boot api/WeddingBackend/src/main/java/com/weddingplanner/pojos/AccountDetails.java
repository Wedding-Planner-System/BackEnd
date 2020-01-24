/*
 * purpose: tbl_ContactUs
 *  author: Hitesh K
 *  Date: 16-01-2020
 */
package com.weddingplanner.pojos;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class AccountDetails {
	
	//tbl_AccountDetails
	//id Account_NO IFSC_Code Holder_Name Bank_Name Branch_Name MICR_Code
	private int id;
	private int accountNo;
	private String accountHolderName,bankName,branchName;
	private String ifscCode,micrCode;
	
	
	public AccountDetails() 
	{
		System.out.println("in AccountDetails Default constructor");
	}
	
	public AccountDetails(int id, int accountNo, String accountHolderName, String bankName, String branchName,
			String ifscCode, String micrCode) {
		super();
		this.id = id;
		this.accountNo = accountNo;
		this.accountHolderName = accountHolderName;
		this.bankName = bankName;
		this.branchName = branchName;
		this.ifscCode = ifscCode;
		this.micrCode = micrCode;
	}
	
	
	public AccountDetails(int accountNo, String accountHolderName, String bankName, String branchName, String ifscCode,
			String micrCode) {
		super();
		this.accountNo = accountNo;
		this.accountHolderName = accountHolderName;
		this.bankName = bankName;
		this.branchName = branchName;
		this.ifscCode = ifscCode;
		this.micrCode = micrCode;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public String getMicrCode() {
		return micrCode;
	}
	public void setMicrCode(String micrCode) {
		this.micrCode = micrCode;
	}
	
	
	
}
