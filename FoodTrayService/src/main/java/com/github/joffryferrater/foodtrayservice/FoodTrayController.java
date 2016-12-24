package com.github.joffryferrater.foodtrayservice;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.joffryferrater.foodtrayservice.domain.Item;
import com.github.joffryferrater.foodtrayservice.domain.Price;
import com.github.joffryferrater.foodtrayservice.domain.TrayItem;
import com.github.joffryferrater.foodtrayservice.repository.ItemServiceRepository;
import com.github.joffryferrater.foodtrayservice.repository.PriceServiceRepository;

/**
 * 
 * @author Joffry Ferrater
 *
 */
@RestController
@RequestMapping("/foodtrays")
public class FoodTrayController {

	@Autowired
	ItemServiceRepository itemServiceRepository;
	@Autowired
	PriceServiceRepository priceServiceRepo;
	
	private List<TrayItem> trayItems = new ArrayList<TrayItem>();
	
	@RequestMapping(value="/price/{itemCode}", method=RequestMethod.GET)
	public Price getPrice(@PathVariable("itemCode") String itemCode) {
		return priceServiceRepo.findByItemCode(itemCode);
	}
	
	@RequestMapping(value="/item/{itemCode}", method=RequestMethod.GET)
	public Item getItem(@PathVariable("itemCode") String itemCode) {
		return itemServiceRepository.findByItemCode(itemCode);
	}
	
	@RequestMapping(value="/{itemCode}", method=RequestMethod.GET)
	public TrayItem getTrayItem(@PathVariable("itemCode") String itemCode) {
		Item item = itemServiceRepository.findByItemCode(itemCode);
		Price price = priceServiceRepo.findByItemCode(itemCode);
		TrayItem trayItem = new TrayItem(item.getName(), price.getPrice());
		return trayItem;
	}
	
	@RequestMapping(value={"/", ""}, method=RequestMethod.POST)
	public List<TrayItem> addFoodTrayItem(TrayItem trayItem) {
		trayItems.add(trayItem);
		return trayItems;
	}
	
	@RequestMapping(value={"/", ""}, method=RequestMethod.GET)
	public List<TrayItem> getItems() {
		return trayItems;
	}
	
}
