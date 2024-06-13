package br.com.dio.models;

public class TerminalAccount {
	private String name;
	private double balance;
	private int accountNumber = 0;
	private String agency;
	
	public TerminalAccount(String name, double balance, String agency, int accountNumber) {
		this.name = name;
		this.balance = balance;
		this.agency = agency;
		this.accountNumber = accountNumber;
	}
	
	public void deposit(double value) {
		this.balance += value;
	}
	
	public void withdraw(double value) {
		this.balance -= value;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAccountNumber() {
		return this.accountNumber;
	}
	
	public String getAgency() {
		return this.agency;
	}
	
}
