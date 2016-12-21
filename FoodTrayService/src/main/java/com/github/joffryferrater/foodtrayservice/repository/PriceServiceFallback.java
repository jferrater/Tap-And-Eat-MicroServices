package com.github.joffryferrater.foodtrayservice.repository;


/**
 * Fall back function if price service is not available.
 * 
 * @author Joffry Ferrater
 *
 */
public class PriceServiceFallback implements PriceServiceRepository {

	@Override
	public Price findByItemCode(String itemCode) {
		return new Price("", "");
	}

}
