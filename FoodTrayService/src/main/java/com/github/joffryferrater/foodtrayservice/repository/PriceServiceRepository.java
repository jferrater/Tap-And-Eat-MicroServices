package com.github.joffryferrater.foodtrayservice.repository;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("PRICE-SERVICE")
public interface PriceServiceRepository {

	@RequestMapping(method=RequestMethod.GET, value="/prices/{itemCode}")
	Price findByItemCode(@PathVariable("itemCode") String itemCode);
}
