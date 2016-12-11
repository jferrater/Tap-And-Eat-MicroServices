package com.github.joffryferrater.priceservice.models;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * 
 * @author Joffry Ferrater
 * 
 */
@RepositoryRestResource (path="prices",  collectionResourceRel= "prices")
public interface PriceRepository extends CrudRepository<Price, Long> {

	Price findByTagName(String tagName);
}
