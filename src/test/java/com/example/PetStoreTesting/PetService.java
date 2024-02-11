package com.example.PetStoreTesting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PetService {

	@Autowired
	private PetRepository petRepository;
	
	public Pet getPetById(Long id) {
		return petRepository.findById(id).orElse(null);
	}
}
