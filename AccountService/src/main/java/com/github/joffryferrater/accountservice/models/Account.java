package com.github.joffryferrater.accountservice.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author Joffry Ferrater
 *
 */
@Entity
@Table(name = "users")
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotNull
	@JsonProperty("Email")
	private String email;
	@JsonProperty("Username")
	private String username;

	@JsonIgnore
	private String password;
	@JsonIgnore
	private String confirmPassword;
	
	public Account(){
		super();
	}
	
	public Account(String email, String username, String password, String confirmPassword) {
		this();
		this.email = email;
		this.username = username;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getConfirmPassword() {
		return confirmPassword;
	}
	
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getUserName() {
		return username;
	}

	public void setUserName(String fullName) {
		this.username = fullName;
	}
	
	
}
