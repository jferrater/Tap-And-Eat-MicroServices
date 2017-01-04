package com.github.joffryferrater.customerservice.models;

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
@Table(name="customers")
@Data
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@JsonProperty("First Name")
	private String firstName;
	@JsonProperty("Last Name")
	private String lastName;
	@JsonProperty("Email")
	private String email;
	@JsonProperty("Phone")
	private String phone;
	@JsonProperty("Address Line 1")
	private String addressLine1;
	@JsonProperty("Address Line 2")
	private String addressLine2;
	@JsonProperty("City")
	private String city;
	@JsonProperty("State")
	private String state;
	@JsonProperty("Postal Code")
	private String postalCode;
	@JsonProperty("Country")
	private String country;
	
	public Customer() {
		super();
	}


}
