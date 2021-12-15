package com.bl;

public class SavingAccount {
	static double annualInterestRate;
	private double savingBalance;

	// initilizing the value of saving balance

	public SavingAccount(double savingBalance) {
		this.savingBalance = savingBalance;
	}

	public void setSavingBalance(double savingBalance) {
		this.savingBalance = savingBalance;
	}

	// calculating monthly interest
	public double calculateMonthlyInterest() {
		double annualInterest = (savingBalance * annualInterestRate / 12); // Calculating saving Balance
		savingBalance = savingBalance + annualInterest;
		return savingBalance;
	}

	// getting for saving balance
	public double getSavingBalance() {
		return savingBalance;
	}

	public static void modifyInterestRate(double annualInterestRate1) {
		annualInterestRate  = annualInterestRate1;
	}
}
