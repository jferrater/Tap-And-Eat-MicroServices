package com.github.joffryferrater.priceservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.joffryferrater.priceservice.models.Price;
import com.github.joffryferrater.priceservice.models.PriceRepository;

/**
 * 
 * @author Joffry Ferrater
 *
 */
@RestController
public class PriceController {

	@Autowired
	PriceRepository priceRepo;
	
	@RequestMapping("/{itemCode}")
	public Price getPrice(@PathVariable("itemCode") String itemCode) {
		return priceRepo.findByItemCode(itemCode);
	}
}
