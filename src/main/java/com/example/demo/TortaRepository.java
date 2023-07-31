package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "tortas", path = "tortas")
public interface TortaRepository extends CrudRepository<Torta, Long> { 

}