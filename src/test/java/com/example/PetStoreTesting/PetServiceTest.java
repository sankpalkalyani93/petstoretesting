package com.example.PetStoreTesting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class PetServiceTest {

	@Mock
	private PetRepository petRepository;

	@InjectMocks
	private PetService petService;
	
	@Test
	public void testGetPetById() {
		Pet mockPet = new Pet(1L, "seenu");
		when(petRepository.findById(1L)).thenReturn(Optional.of(mockPet));
		
		Pet result = petService.getPetById(1L);
		
		assertEquals("tyson", result.getName());
		
	}
}