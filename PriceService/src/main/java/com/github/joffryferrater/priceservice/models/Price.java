package com.github.joffryferrater.priceservice.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * 
 * @author Joffry Ferrater
 *
 */
@Entity
@Table (name="prices")
@Data
@RequiredArgsConstructor
public class Price {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id;
	@JsonProperty("Item Code")
	private final String itemCode;
	@JsonProperty("Price")
	private final String price;
	
	
}
