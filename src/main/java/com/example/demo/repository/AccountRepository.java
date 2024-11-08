package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Accounts;

public interface AccountRepository extends JpaRepository<Accounts, Integer>{

}
