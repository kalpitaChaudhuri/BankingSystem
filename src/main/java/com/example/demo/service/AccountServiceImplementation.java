package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.data.AccountsData;
import com.example.demo.entities.Accounts;
import com.example.demo.mapper.AccountMapper;
import com.example.demo.repository.AccountRepository;

@Component
public class AccountServiceImplementation implements AccountService{
	
	@Autowired
	AccountRepository accrepo;

	@Override
	public AccountsData createAccount(AccountsData accountsdata) {
		Accounts acc=AccountMapper.maptoaccount(accountsdata);
		Accounts datasaved=accrepo.save(acc);
		return AccountMapper.maptoaccountdetails(datasaved);
	}

	@Override
	public AccountsData getAccountByid(int id) {
		Accounts account=accrepo.findById(id).orElseThrow(() ->new  RuntimeException("id does not exists"));
		return AccountMapper.maptoaccountdetails(account);
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
