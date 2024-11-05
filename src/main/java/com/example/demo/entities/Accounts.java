package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Accounts {

	@Id
	private int id;
	private String accountHolderName;
	private int accountHolderAge;
	private double balance;
	public Accounts() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Accounts(int id, String accountHolderName, int accountHolderAge, double balance) {
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
