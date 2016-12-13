package com.github.joffryferrater.accountservice.models;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="accounts", collectionResourceRel="accounts")
public interface AccountRepository extends CrudRepository<Account, Long>{

	Account findByEmail(String email);

}