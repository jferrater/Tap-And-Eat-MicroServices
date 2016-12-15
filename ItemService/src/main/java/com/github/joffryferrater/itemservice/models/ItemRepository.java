package com.github.joffryferrater.itemservice.models;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * 
 * @author Joffry Ferrater
 *
 */
@RepositoryRestResource(path="items", collectionResourceRel="items")
public interface ItemRepository extends CrudRepository<Item, Long>{

	Item findByItemCode(@Param("itemCode")String itemCode);
	
	Item findByName(@Param("name") String name);
}
