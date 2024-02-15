package com;

import java.util.Scanner;

public class ATM {
private BankAccount bankAccount;

public ATM(BankAccount bankAccount) {
	this.bankAccount = bankAccount;
}

public void displayMenu() {
	System.out.println("ATM Menu:");
	System.out.println("1. Check Balance");
	System.out.println("2. Deposit");
	System.out.println("3. withdraw");
	System.out.println("4. Exit");
}

public void performTransaction(int choice, Scanner scanner) {
	switch (choice) {
	case 1:
		System.out.println("Current balance: $"+bankAccount.getBalance());
		break;
	case 2:
		System.out.println("Enter Deposit amount:$");
		double depositeAmount=scanner.nextDouble();
		bankAccount.deposit(depositeAmount);
		break;
	case 3:
		System.out.println("Enter withdraw amount:$");
		double withdrawAmount=scanner.nextDouble();
		bankAccount.withdraw(withdrawAmount);
		break;
	case 4:
		System.out.println("Exiting Atm.Thank you!");
		scanner.close();
		System.exit(0);
		break;	
	default:
		System.out.println("Invalid choice.Please select a valid option.");;
	}
}
}
