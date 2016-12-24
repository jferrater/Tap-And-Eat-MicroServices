package com.github.joffryferrater.foodtrayservice.repository;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.github.joffryferrater.foodtrayservice.domain.Price;

/**
 * 
 * @author Joffry Ferrater
 *
 */
@FeignClient(value="PRICE-SERVICE", fallback=PriceServiceRepository.class)
public interface PriceServiceRepository {

	@RequestMapping(method=RequestMethod.GET, value="/prices/search/findByItemCode?itemCode={itemCode}")
	Price findByItemCode(@PathVariable("itemCode") String itemCode);
}
