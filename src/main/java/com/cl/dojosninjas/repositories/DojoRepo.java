package com.cl.dojosninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cl.dojosninjas.models.Dojo;

public interface DojoRepo extends CrudRepository<Dojo, Long>{
	
	List<Dojo> findAll();
	
//	Optional<Dojo> findById(Long id);
//	
//	void deleteById(Long id);
}
