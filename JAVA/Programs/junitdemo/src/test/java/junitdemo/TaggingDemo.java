package junitdemo;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class TaggingDemo {

	@Test
	@Tag("First")
	void test1() {
		System.out.println("This is first part of test-1");
	}
	
	@Test
	@Order(2)
	@Tag("First")
	void test2() {
		System.out.println("This is second part of test-1");
	}

	
	@Test
	@Tag("Second")
	void test3() {
		System.out.println("This is first part of test-2");
	}

	@Test
	@Tag("Second")
	void test4() {
		System.out.println("This is second part of test-2");
	}

	@Test
	@Tag("Third")
	@Order(1)
	void test5() {
		System.out.println("This is first part of test-3");
	}


}
