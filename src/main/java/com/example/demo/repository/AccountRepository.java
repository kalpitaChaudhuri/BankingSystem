package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Accounts;

public interface AccountRepository extends JpaRepository<Accounts, Integer>{

	public List<Accounts> findByName(String name);
	public List<Accounts> findByAge(int age);
}
