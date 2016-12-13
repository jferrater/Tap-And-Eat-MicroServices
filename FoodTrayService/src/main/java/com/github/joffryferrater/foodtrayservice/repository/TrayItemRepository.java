package com.github.joffryferrater.foodtrayservice.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="foodtrays")
public interface TrayItemRepository extends CrudRepository<TrayItem, Long>{

	public void addTrayItem(TrayItem trayItem);
	public List<TrayItem> Items();
	
}
