package com.cjc.bankmagament.service;
import com.cjc.bankmagament.model.Account;

import java.util.Scanner;

public class Sbi {
	
	Account ac;
	
	public void createAccount() {
		
	    ac = new Account();
		ac.setAccNo(8965);
		ac.setMobileNumber(4589658956l);
		ac.setName("abc");
		ac.setGender('m');
		ac.setAadharNumber(789568965896l);
		ac.setAddress("Pune");
		ac.setAccType("Saving");
		ac.setBalance(78000);	
		
	}
	
	public void displayDetails() {
		
		System.out.println("Account no:- " + ac.getAccNo());
		System.out.println("Mobile no:- " + ac.getMobileNumber());
		System.out.println("Account holder name:- " + ac.getName());
		System.out.println("Gender:- " + ac.getGender());
		System.out.println("Aadhar no:- " + ac.getAadharNumber());
		System.out.println("Address:- " + ac.getAddress());
		System.out.println("Account type:- " + ac.getAccType());
		System.out.println("Account balance:- " + ac.getBalance() + "\n");
		
	}
	
	public void withdrawAmount() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter amount wants to withdraw");
		int amount = sc.nextInt();
		
		int balance = ac.getBalance();
		
		if (amount < balance) {
			balance = balance - amount;
			System.out.println("Amount withdrawal successfully......!\n");
			System.out.println("Your current balance is :- " + balance + "\n");	
		}
		else {
			System.out.println("insufficient ballance.....!\n");
		}		
	}
	
	public void depositAmount() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter amount wants to deposit");
		int amount = sc.nextInt();
		
		int balance = ac.getBalance();
		
		balance = balance + amount;
		System.out.println("Amount deposit successfully......!\n");
		System.out.println("Your current balance is :- " + balance + "\n");	
			
	}
	
}
