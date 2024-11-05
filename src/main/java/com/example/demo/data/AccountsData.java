package com.example.demo.data;

public class AccountsData {

	private int id;
	private String accountHolderName;
	private int accountHolderAge;
	private double balance;
	public AccountsData(int id, String accountHolderName, int accountHolderAge, double balance) {
		super();
		this.id = id;
		this.accountHolderName = accountHolderName;
		this.accountHolderAge = accountHolderAge;
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public int getAccountHolderAge() {
		return accountHolderAge;
	}
	public void setAccountHolderAge(int accountHolderAge) {
		this.accountHolderAge = accountHolderAge;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
