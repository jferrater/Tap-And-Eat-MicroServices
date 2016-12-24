package com.github.joffryferrater.foodtrayservice.domain;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 * @author Joffry Ferrater
 *
 */
@lombok.Getter
public class Item {

	@JsonProperty("Item Code")
	private String itemCode;
	@JsonProperty("Name")
	private String name;
	
	public Item() {
		super();
	}
	
	public Item(String itemCode, String name) {
		this.itemCode = itemCode;
		this.name = name;
	}
}
