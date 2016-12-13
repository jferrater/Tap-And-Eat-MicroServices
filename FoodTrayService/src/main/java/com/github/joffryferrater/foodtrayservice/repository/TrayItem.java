package com.github.joffryferrater.foodtrayservice.repository;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Joffry Ferrater
 *
 */
public class TrayItem {

	private Item item;
	private Price price;
	
	private String name;
	private String amount;
	
	private List<TrayItem> items = new ArrayList<TrayItem>();
	
	public TrayItem() {
		super();
	}
	
	public TrayItem(Item item, Price price) {
		this.name = item.getName();
		this.amount = price.getPrice();
	}
	
	public Price getPrice() {
		return price;
	}
	
	public Item getItem() {
		return item;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAmount() {
		return amount;
	}
	
	public void addTrayItem(TrayItem itemToAdd) {
		this.items.add(itemToAdd);
	}
	
	public List<TrayItem> getTrayItems() {
		return items;
	}
}
