package com.github.joffryferrater.storeservice.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author Joffry Ferrater
 *
 */
@Entity
@Table(name="stores")
public class Store {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long  id;
	@JsonProperty("Store")
	private String storeName;
	@JsonProperty("Branch")
	private String branchName;
	@JsonProperty("Location")
	private String location;
	// TO DO: Implement store type
	
	public Store() {
		super();
	}
	
	public Store(String storeName, String branchName, String location) {
		this();
		this.storeName = storeName;
		this.branchName = branchName;
		this.location = location;
	}
	

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getStoreName() {
		return storeName;
	}
	
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	
	public String getBranchName() {
		return branchName;
	}
	
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
