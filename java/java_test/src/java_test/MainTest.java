package java_test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

class MainTest {
	
	@BeforeAll
	public static void first() {
		System.out.println("Before all");
	}
	
	@AfterAll
	public static void last() {
		System.out.println("After all");
	}
	
	@BeforeEach
	void setupTest() {
		System.out.println("Setup Test");
	}
	
	@AfterEach
	void after() {
		System.out.println("after");
	}
	
	@Test
	void test() {
		int a = 0;
		int b = 1;
		a += b;
		System.out.println(a);
//		assertEquals(a, 2);
		Assertions.assertEquals(1, a);
		
	}
	
	@Test
	void test2() {
		int a = 0;
		int b = 1;
		a += b;
		System.out.println(a);
		Assertions.assertEquals(2, a);
		
	}

}
