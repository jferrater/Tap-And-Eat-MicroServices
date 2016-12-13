package com.github.joffryferrater.foodtrayservice.repository;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @author Joffry Ferrater
 *
 */
@FeignClient("ITEM-SERVICE")
public interface ItemServiceRepository {

	@RequestMapping(method=RequestMethod.GET, value="/items/{id}")
	Item findItem(@PathVariable("id") Long id);
}
