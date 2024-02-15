package com;

public class BankAccount {
private double balance;

public BankAccount(double initialBalance) {
	
	this.balance = initialBalance;
}
  
public double getBalance() {
	return balance;
	
}

public void deposit(double amount) {
	if (amount>0) {
		balance+=amount;
		System.out.println("Deposit of $"+amount+" successful. Current balance: $"+balance);
	} else {
      System.out.println("Invalid deposit amount.");
	}
}

public void withdraw(double amount) {
	if (amount>0 && amount<=balance) {
		balance-=amount;
		System.out.println("withdraw of $"+amount+" successful. Current balance: $"+balance);
	} else {
      System.out.println("Invalid withdraw  amount or insufficient balance.");
	}
}
}
