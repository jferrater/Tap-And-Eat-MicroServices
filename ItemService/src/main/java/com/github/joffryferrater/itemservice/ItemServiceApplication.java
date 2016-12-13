package com.github.joffryferrater.itemservice;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.github.joffryferrater.itemservice.models.Item;
import com.github.joffryferrater.itemservice.models.ItemRepository;

/**
 * 
 * @author Joffry Ferrater
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ItemServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemServiceApplication.class, args);
	}
	
	@Autowired
	ItemRepository itemRepository;
	
	@PostConstruct
	public void init() {
		Item item = new Item("BUR01", "burger");
		itemRepository.save(item);
	}
}
