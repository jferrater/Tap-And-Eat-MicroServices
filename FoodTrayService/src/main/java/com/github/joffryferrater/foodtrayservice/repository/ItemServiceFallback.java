package com.github.joffryferrater.foodtrayservice.repository;

import org.springframework.stereotype.Component;

/**
 * Fall back function if ItemService is not available.
 * 
 * @author Joffry Ferrater
 *
 */
@Component
public class ItemServiceFallback implements ItemServiceRepository {

	@Override
	public Item findByItemCode(String itemCode) {
		return new Item("", "");
	}

}
