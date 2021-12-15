package com.bl;

public class AccountHolder {
	public static void main(String[] args) {
		System.out.println("==========Welcome======");
		SavingAccount saver1 = new SavingAccount(2000); //Object Creating
		SavingAccount saver2 = new SavingAccount(3000); 

		SavingAccount.modifyInterestRate(0.04);
		saver1.calculateMonthlyInterest(); // Calculating saving balance for saver 1
		System.out.println("First Month Interest For Saver 1 is $ " + saver1.getSavingBalance());
		saver2.calculateMonthlyInterest(); // Calculating saving balance for saver 2
		System.out.println("First Month Interest For Saver 2 is $" + saver2.getSavingBalance());

		System.out.println("========================================================");
		SavingAccount.modifyInterestRate(0.05);
		saver1.calculateMonthlyInterest(); // Calculating saving balance for saver 1
		System.out.println("First Month Interest For Saver 1 is $ " + saver1.getSavingBalance());
		saver2.calculateMonthlyInterest(); // Calculating saving balance for saver 2
		System.out.println("First Month Interest For Saver 2 is $ " + saver2.getSavingBalance());
	}
}
