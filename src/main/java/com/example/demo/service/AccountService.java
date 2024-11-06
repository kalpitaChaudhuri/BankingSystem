package com.example.demo.service;

import java.util.List;

import com.example.demo.data.AccountsData;

public interface AccountService {
	
	AccountsData createAccount(AccountsData accountsdata);
	
	AccountsData getAccountByid(int id);
	
	AccountsData deposit(int id, double amount);
	
	AccountsData withdraw(int id, double amount);
	
	List<AccountsData> getAll();
	
	void deleteAccount(int id);
}
