package junitdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	Calculator c;
	
	@BeforeAll
	public static void beforeAllMethod() {
		System.out.println("Before all methods ");
	}
	
	@AfterAll
	public static void aferAllMethod() {
		System.out.println("After all methods ");
	}
	
	@BeforeEach
	void beforeMethod() {
		c= new Calculator();
		System.out.println("Before Each is called..!");
	}
	
	@AfterEach
	void afterMethod() {
		c= null;
		System.out.println("After each is called..!");
	}

	@Test
	void whenBothArePositives() {
		//Calculator c = new Calculator();
		assertEquals(10,c.add(5, 5));
		System.out.println("inside the when both are positive method test");
	}
	
	@Test
	void whenFirstPostiveSecondZero() {
		//Calculator c = new Calculator();
		assertEquals(5,c.add(5, 0));
	}

	@Test
	void test3() {
		Calculator c = new Calculator();
		assertEquals(5,c.add(0, 5));
	}
	
	@Test
	void test4() {
		//Calculator c = new Calculator();
		assertEquals(0,c.add(0, 0));
	}
	
	@Test
	void test5() {
		Calculator c = new Calculator();
		assertEquals(-1,c.add(-1, 0));
	}

	@Test
	void test6() {
		//Calculator c = new Calculator();
		assertEquals(-4,c.add(-1, -3));
	}
	
	@Test
	void test7() {
		//Calculator c = new Calculator();
		assertEquals(2,c.add(-1, 3));
	}
	
	@Test
	void test8() {
		// c = new Calculator();
		assertEquals(7,c.add(10, -3));
	}


}
