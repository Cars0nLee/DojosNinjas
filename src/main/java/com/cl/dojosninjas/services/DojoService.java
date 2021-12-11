package com.cl.dojosninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cl.dojosninjas.models.Dojo;
import com.cl.dojosninjas.repositories.DojoRepo;

@Service
public class DojoService {
	private final DojoRepo dojoRepo;
	
	public DojoService(DojoRepo dojoRepo) {
		this.dojoRepo = dojoRepo;
	}
	
	///// Create Dojo
	public Dojo create(Dojo dojo) {
		return dojoRepo.save(dojo);
	}
	
	///// Find All
	public List<Dojo> allDojos() {
		return dojoRepo.findAll();
	}
	
	///// Find by id
	public Dojo findDojo(Long id) {
		Optional<Dojo> dojo = dojoRepo.findById(id);
		if(dojo.isPresent()) {
			return dojo.get();
		}
		else {
			return null;
		}
	}
}
