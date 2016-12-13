package com.github.joffryferrater.foodtrayservice.repository;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author Joffry Ferrater
 *
 */
public class Price {

	@JsonProperty("Item Code")
	private String itemCode;
	@JsonProperty("Price")
	private String price;
	
	public Price(){
		super();
	}
	
	public Price(String itemCode, String price) {
		this();
		this.itemCode = itemCode;
		this.price = price;
	}
	
	public String getItemCode() {
		return itemCode;
	}
	

	public String getPrice() {
		return price;
	}

}
