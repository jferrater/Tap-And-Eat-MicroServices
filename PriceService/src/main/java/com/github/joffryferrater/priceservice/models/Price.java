package com.github.joffryferrater.priceservice.models;

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
@Table (name="prices")
@Data
public class Price {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id;
	@JsonProperty("Item Code")
	private String itemCode;
	@JsonProperty("Price")
	private String price;

	public Price() {
		super();
	}
	
	public Price(String itemCode, String price) {
		this();
		this.itemCode = itemCode;
		this.price = price;
	}
}
