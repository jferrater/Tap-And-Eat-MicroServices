package com.github.joffryferrater.itemservice.models;

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
public class Item {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
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
	
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public String getItemCode() {
		return itemCode;
	}

}

