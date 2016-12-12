package com.github.joffryferrater.customerservice.models;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * 
 * @author Joffry Ferrater
 *
 */
@Transactional
@RepositoryRestResource(path="customers", collectionResourceRel="customers")
public interface CustomerRepository extends CrudRepository<Customer, Long>{

	Customer findById(Long id);
	
}
