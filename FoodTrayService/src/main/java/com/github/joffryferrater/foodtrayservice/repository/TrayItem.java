package com.github.joffryferrater.foodtrayservice.repository;


import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author Joffry Ferrater
 *
 */
public class TrayItem {

	@JsonProperty("Name")
	private String name;
	@JsonProperty("Price")
	private String amount;
	

	public TrayItem() {
		super();
	}
	
	public TrayItem(String name, String amount) {
		this.name = name;
		this.amount = amount;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAmount() {
		return amount;
	}
	
}
