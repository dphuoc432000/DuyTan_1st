package part1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
	Calculator c = new Calculator();
	
	//ADD
	@Test
	void test1_add() {
		assertEquals(7, c.add(3, 4));
	}
	@Test
	void test2_add() {
		assertEquals(3000000000.0, c.add(2000000000, 1000000000));
	}
	@Test
	void test3_add() {
		assertEquals(-3000000000.0, c.add(-2000000000, -1000000000));
	}
	
	//SUB
	@Test
	void test1_sub() {
		assertEquals(3, c.sub(9, 6));
	}
	@Test
	void test2_sub() {
		assertEquals(3000000000.0, c.sub(2000000000, -1000000000));
	}
	@Test
	void test3_sub() {
		assertEquals(-3000000000.0, c.sub(-2000000000, 1000000000));
	}
	
	//mul
	@Test
	void test1_mul() {
		assertEquals(2, c.mul(2,1));
	}
	@Test
	void test2_mul() {
		assertEquals(20000000000.0, c.mul(2000000000, 10));
	}
	@Test
	void test3_mul() {
		assertEquals(-20000000000.0, c.sub(-2000000000, 10));
	}
	
	//div
	@Test
	void test1_div() {
		assertEquals(5, c.div(25,5));
	}
	@Test
	void test2_div() {
		try {
			c.div(2, 0);
		} catch (Exception e) {
			fail("Error divide by zero");
		}
		
	}
	
	
}
