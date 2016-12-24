package com.github.joffryferrater.foodtrayservice.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author Joffry Ferrater
 *
 */
@lombok.Getter
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

}
