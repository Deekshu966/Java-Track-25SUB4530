package junitdemo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class DemoTestCase {

	@Test
	void test1() {
		assertTrue(10>5);
	}
	
	@Test
	void test2() {
		assertFalse(10<5);
	}
	
	@Test
	void test3() {
		assertNotNull(new Calculator());
	}
	
	@ParameterizedTest
	@ValueSource(ints = {2,4,7,10})
	void testEvenNumbers(int nos) {
		assertTrue(nos%2==0);
	}

}
