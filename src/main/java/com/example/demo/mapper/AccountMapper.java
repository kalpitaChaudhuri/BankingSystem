package com.example.demo.mapper;

import com.example.demo.data.AccountsData;
import com.example.demo.entities.Accounts;

public class AccountMapper {

	public static Accounts maptoaccount(AccountsData accountsdata) {
		Accounts account = new Accounts(accountsdata.getId(), accountsdata.getAccountHolderName(), accountsdata.getAccountHolderAge(), accountsdata.getBalance());
		return account;
	}
	
	public static AccountsData maptoaccountdetails(Accounts acc) {
		AccountsData accountdata = new AccountsData(acc.getId(), acc.getAccountHolderName(), acc.getAccountHolderAge(), acc.getBalance());
		return accountdata;
	}
}
