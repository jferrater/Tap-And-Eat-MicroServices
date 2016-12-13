package com.github.joffryferrater.foodtrayservice.repository;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author Joffry Ferrater
 *
 */
public class Item {

	@JsonProperty("Item Code")
	private String itemCode;
	@JsonProperty("Name")
	private String name;
	
	public Item() {
		super();
	}
	
	public Item(String itemCode, String name) {
		this.name = name;
		this.itemCode = itemCode;
	}
	
	public String getName() {
		return name;
	}

	public String getItemCode() {
		return itemCode;
	}
}
