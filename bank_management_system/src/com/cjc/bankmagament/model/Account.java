package com.cjc.bankmagament.model;

public class Account {

	private int accNo;
	private long mobileNumber;
	private String name;
	private char gender;
	private long aadharNumber;
	private String address;
	private String accType;
	private int balance;

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getAccNo() {
		return accNo;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public String getName() {
		return name;
	}

	public char getGender() {
		return gender;
	}

	public long getAadharNumber() {
		return aadharNumber;
	}

	public String getAddress() {
		return address;
	}

	public String getAccType() {
		return accType;
	}

	public int getBalance() {
		return balance;
	}

}
