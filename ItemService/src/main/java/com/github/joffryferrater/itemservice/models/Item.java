package com.github.joffryferrater.itemservice.models;

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
@Table(name = "items")
@Data
@RequiredArgsConstructor
public class Item {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@JsonProperty("Item Code")
	private final String itemCode;
	@JsonProperty("Name")
	private final String name;
	
}

