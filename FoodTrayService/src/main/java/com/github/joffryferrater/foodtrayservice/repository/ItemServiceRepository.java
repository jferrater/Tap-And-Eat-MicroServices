package com.github.joffryferrater.foodtrayservice.repository;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.github.joffryferrater.foodtrayservice.domain.Item;

/**
 * 
 * @author Joffry Ferrater
 *
 */
@FeignClient(value="ITEM-SERVICE", fallback=ItemServiceFallback.class)
public interface ItemServiceRepository {

	@RequestMapping(method=RequestMethod.GET, value="/items/search/findByItemCode?itemCode={itemCode}")
	Item findByItemCode(@PathVariable("itemCode") String itemCode);
}
