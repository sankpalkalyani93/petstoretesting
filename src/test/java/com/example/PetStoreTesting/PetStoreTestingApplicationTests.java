package com.example.PetStoreTesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PetStoreTestingApplicationTests {

	private Operations o = new Operations();
	
	@Test
	void testSumMethod() {
		// x = 7, y = 7
		int expectedResult = 14;
		int actualResult = o.getSum(7, 7);
		
		assertEquals(expectedResult, actualResult);
	}
}
