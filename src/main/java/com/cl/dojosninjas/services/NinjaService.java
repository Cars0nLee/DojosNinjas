package com.cl.dojosninjas.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cl.dojosninjas.models.Ninja;
import com.cl.dojosninjas.repositories.NinjaRepo;

@Service
public class NinjaService {
	private final NinjaRepo ninjaRepo;
	
	public NinjaService(NinjaRepo ninjaRepo) {
		this.ninjaRepo = ninjaRepo;
	}
	
	///// Create Ninja
	public Ninja createNinja(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
	
	///// retrieves ninja
	public Ninja findNinja(Long id) {
		Optional<Ninja> ninja = ninjaRepo.findById(id);
		if(ninja.isPresent()) {
			return ninja.get();
		}
		else {
			return null;
		}
	}
}
