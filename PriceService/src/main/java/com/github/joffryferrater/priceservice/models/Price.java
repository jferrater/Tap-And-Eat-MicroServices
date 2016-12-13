package com.github.joffryferrater.priceservice.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author Joffry Ferrater
 *
 */
@Entity
public class Price {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id;
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
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getItemCode() {
		return itemCode;
	}
	
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	
	public String getPrice() {
		return price;
	}
	
	public void setPrice(String price) {
		this.price = price;
	}
	
	
}
