package com.github.joffryferrater.foodtrayservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.joffryferrater.foodtrayservice.repository.Item;
import com.github.joffryferrater.foodtrayservice.repository.ItemServiceRepository;
import com.github.joffryferrater.foodtrayservice.repository.Price;
import com.github.joffryferrater.foodtrayservice.repository.PriceServiceRepository;
import com.github.joffryferrater.foodtrayservice.repository.TrayItem;

/**
 * 
 * @author Joffry Ferrater
 *
 */
@RestController
@RequestMapping("/api/foodtrays")
public class FoodTrayController {

	@Autowired
	ItemServiceRepository itemServiceRepository;
	@Autowired
	PriceServiceRepository priceServiceRepo;
	
	@RequestMapping("/{id}")
	public Item getItem(@PathVariable Long id) {
		Item item = itemServiceRepository.findItem(id);
		if(item == null) {
			System.out.println("Item not found");
		}
		return item;
	}
	
	@RequestMapping("/tray/{id}")
	public TrayItem getTrayItem(@PathVariable Long id) {
		Item item = itemServiceRepository.findItem(id);
		String itemCode = item.getItemCode();
		Price price = priceServiceRepo.findByItemCode(itemCode);
		TrayItem trayItem = new TrayItem(item, price);
		return trayItem;
	}
}
