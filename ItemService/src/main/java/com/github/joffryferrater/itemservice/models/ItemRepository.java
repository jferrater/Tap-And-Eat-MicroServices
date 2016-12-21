package com.github.joffryferrater.itemservice.models;


import java.util.List;

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
	
	List<Item> findByName(@Param("name") String name);
}
