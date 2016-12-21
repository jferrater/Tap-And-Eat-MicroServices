package com.github.joffryferrater.accountservice.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * 
 * @author Joffry Ferrater
 *
 */
@Entity
@Table(name = "users")
@Data
@RequiredArgsConstructor
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotNull
	@JsonProperty("Email")
	private final String email;
	@JsonProperty("First Name")
	private final String firstName;
	@JsonProperty("Last Name")
	private final String lastName;
	@JsonProperty("Country Code")
	private final String countryCode;
	@JsonProperty("Phone Number")
	private final String phoneNumber;

	@JsonIgnore
	private final String password;


}
