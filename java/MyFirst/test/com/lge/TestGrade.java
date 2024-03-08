package com.lge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestGrade {
	
	@Test
	void testLevel_EP() {
		Grade g = new Grade();
		Assertions.assertEquals("A", g.evaluate(67));
		Assertions.assertEquals("B", g.evaluate(55));
		Assertions.assertEquals("C", g.evaluate(40));
		Assertions.assertEquals("D", g.evaluate(20));
		Assertions.assertEquals("error", g.evaluate(80));
		Assertions.assertEquals("error", g.evaluate(-10));
	}
	
	@Test
	void testLevel_BVA() {
		Grade g = new Grade();
		Assertions.assertEquals("error", g.evaluate(-1));
		Assertions.assertEquals("D", g.evaluate(0));
		Assertions.assertEquals("D", g.evaluate(1));
		Assertions.assertEquals("D", g.evaluate(29));
		Assertions.assertEquals("C", g.evaluate(30));
		Assertions.assertEquals("C", g.evaluate(31));
		Assertions.assertEquals("C", g.evaluate(49));
		Assertions.assertEquals("B", g.evaluate(50));
		Assertions.assertEquals("B", g.evaluate(51));
		Assertions.assertEquals("B", g.evaluate(64));
		Assertions.assertEquals("A", g.evaluate(65));
		Assertions.assertEquals("A", g.evaluate(66));
		Assertions.assertEquals("A", g.evaluate(69));
		Assertions.assertEquals("A", g.evaluate(70));
		Assertions.assertEquals("error", g.evaluate(71));
		
	}
}
