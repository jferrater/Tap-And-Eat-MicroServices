package com.github.joffryferrater.itemservice;

import java.util.ArrayList;
import java.util.List;

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
		List<Item> items = new ArrayList<Item>();
		Item item1 = new Item("BUR01", "Burger");
		Item item2 = new Item("SPAG01", "Spaghetti");
		Item item3 = new Item("CHI01", "Crispy Chicken");
		Item item4 = new Item("BEEF01", "Beef Stick");
		Item item5 = new Item("BBQ01", "Pork Barbecue");
		Item item6 = new Item("BBQ02", "Chicken Barbecue");
		Item item7 = new Item("SFT01", "Nestea");
		Item item8 = new Item("SFT02", "Coco Cola");
		Item item9 = new Item("DES01", "Sandy Ice Cream");
		items.add(item1);
		items.add(item2);
		items.add(item3);
		items.add(item4);
		items.add(item5);
		items.add(item6);
		items.add(item7);
		items.add(item8);
		items.add(item9);
		items.forEach(item -> itemRepository.save(item));
	}
}
