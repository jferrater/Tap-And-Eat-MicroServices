package com.github.joffryferrater.accountservice;


import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.github.joffryferrater.accountservice.models.Account;
import com.github.joffryferrater.accountservice.models.AccountRepository;

/**
 * 
 * @author Joffry Ferrater
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AccountServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountServiceApplication.class, args);
	}
	
	@Autowired
	AccountRepository accountRepo;
	
	@PostConstruct
	public void init() {
		Account account = new Account("joffry.ferrater@gmail.com", "jmferrater",
				"123", "123");
		
		accountRepo.save(account);
	}
	
}
