package com.github.joffryferrater.storeservice.models;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * 
 * @author Joffry Ferrater
 *
 */
@Transactional
@RepositoryRestResource(path="stores", collectionResourceRel="stores")
public interface StoreRepository extends CrudRepository<Store, Long>{

	Store findByStoreName(String storeName);
}
