package com.example.demo.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.data.AccountsData;
import com.example.demo.entities.Accounts;
import com.example.demo.mapper.AccountMapper;
import com.example.demo.repository.AccountRepository;
import com.example.demo.service.AccountService;

@Component
public class AccountServiceImplementation implements AccountService{
	
	@Autowired
	private AccountRepository accountrepository;

	@Override
	public AccountsData createAccount(AccountsData accountsdata) {
		Accounts acc=AccountMapper.maptoaccount(accountsdata);
		Accounts accsaved=accountrepository.save(acc);
		return AccountMapper.maptoaccountdetails(accsaved);
	}

	@Override
	public AccountsData getAccountById(int id) {
		Accounts account=accountrepository.findById(id).orElseThrow(() ->new  RuntimeException("id does not exists"));
		return AccountMapper.maptoaccountdetails(account);
	}

	@Override
	public AccountsData getAccountsByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountsData getAccountsByAge(int age) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountsData deposit(int id, double amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountsData withdraw(int id, double amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AccountsData> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAccount(int id) {
		// TODO Auto-generated method stub
		
	}
}
