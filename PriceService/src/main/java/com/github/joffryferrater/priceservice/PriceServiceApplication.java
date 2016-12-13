package com.github.joffryferrater.priceservice;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.github.joffryferrater.priceservice.models.Price;
import com.github.joffryferrater.priceservice.models.PriceRepository;

@SpringBootApplication
@EnableDiscoveryClient
public class PriceServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PriceServiceApplication.class, args);
	}
	
	@Autowired
	PriceRepository priceRepo;
	
	@PostConstruct
	public void init() {
		Price price = new Price("BUR01", "150");
		priceRepo.save(price);
	}
}
