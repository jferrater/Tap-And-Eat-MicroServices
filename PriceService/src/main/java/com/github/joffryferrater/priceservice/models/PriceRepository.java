package com.github.joffryferrater.priceservice.models;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 
 * @author Joffry Ferrater
 * 
 */
@RepositoryRestResource (path="prices",  collectionResourceRel= "prices")
public interface PriceRepository extends CrudRepository<Price, Long> {

	Price findByItemCode(@PathVariable("itemCode")String itemCode);
	
	Price findById(Long id);
}
