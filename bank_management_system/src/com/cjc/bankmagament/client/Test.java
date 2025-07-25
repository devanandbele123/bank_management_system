package com.cjc.bankmagament.client;

import java.util.Random;
import java.util.Scanner;

import com.cjc.bankmagament.service.Sbi;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Sbi sbi = new Sbi();
		
		Random random = new Random();
		int otp = random.nextInt(10000,99999);
		System.out.println(otp);
		

		do {
			System.out.println("Enter 1 for create account\n" + "Enter 2 for Display Details\n"
					+ "Enter 3 for withdraw amount\n" + "Enter 4 for deposit amount\n" + "Enter 5 for exit\n");

			int a = sc.nextInt();

			if (a == 1) {
				sbi.createAccount();
			} else if (a == 2) {
				sbi.displayDetails();
			} else if (a == 3) {
				sbi.withdrawAmount();
			} else if (a == 4) {
				sbi.depositAmount();
			} else if (a==5) {
				System.out.println("Thankyou");
				break;
			}else {
				System.out.println("Please Enter vald input");
			}

		} while (true);

	}

}
