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
	@JsonProperty("Tag Name")
	private String tagName;
	@JsonProperty("Price")
	private String price;
	
	public Price(){
		super();
	}
	
	public Price(String tagName, String price) {
		this();
		this.tagName = tagName;
		this.price = price;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getTagName() {
		return tagName;
	}
	
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}
	
	public String getPrice() {
		return price;
	}
	
	public void setPrice(String price) {
		this.price = price;
	}
	
	
}
