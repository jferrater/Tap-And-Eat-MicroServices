package com.github.joffryferrater.itemservice.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * 
 * @author Joffry Ferrater
 *
 */
@Entity
@Table(name = "items")
@Data
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
		this();
		this.itemCode = itemCode;
		this.name = name;
	}
	
}

