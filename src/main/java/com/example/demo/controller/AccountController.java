package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.AccountsData;
import com.example.demo.service.AccountService;

@RestController
@RequestMapping("/bankacc")
public class AccountController {

	@Autowired
	AccountService accountservice;
	
	@PostMapping("/save")
	public ResponseEntity<AccountsData> addaccount(@RequestBody AccountsData accountsdata) {
		//System.out.println("Triggered");
		return new ResponseEntity<AccountsData>(accountservice.createAccount(accountsdata), HttpStatus.CREATED);
	}
}
