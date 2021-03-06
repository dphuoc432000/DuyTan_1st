package part2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Advance3Test {
	//FIBONACCI
//	Advance3 f = new Advance3();
//	@Test
//	void test1_fibonacci() {//n is less than 0
//		assertEquals(-1, f.fibonacci(-10));
//	}
//	@Test
//	void test2_fibonacci() {//n = 0
//		assertEquals(0, f.fibonacci(0));
//	}
//	@Test
//	void test3_fibonacci() {//n = 1
//		assertEquals(1, f.fibonacci(1));
//	}
//	@Test
//	void test4_fibonacci() {//n is greater than 1
//		assertEquals(8, f.fibonacci(6));
//	}
//	
	
	//IS PRIME NUMBER
	Advance3 p = new Advance3();
	@Test
	void test1_prime() {//n is less than 2
		assertEquals(false, p.isPrimeNumber(1));
	}
	@Test
	void test2_prime() {//n is equal 2
		assertTrue(true == p.isPrimeNumber(2));
	}
	@Test
	void test3_prime() {//n is greater than 2
		assertTrue(true == p.isPrimeNumber(11));
	}
	@Test
	void test4_prime() {// n is not prime number
		assertTrue(false == p.isPrimeNumber(10));
	}
}
