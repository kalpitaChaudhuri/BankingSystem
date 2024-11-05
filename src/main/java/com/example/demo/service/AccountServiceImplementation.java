package com.example.demo.service;

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

}
