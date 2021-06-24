
package part2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Advance1Test {
	
	//USCLN
	@Test
	void test1_USCLN() {// Test number1 is greater than number 2
		Advance1 a = new Advance1();
		assertEquals(25, a.USCLN(125, 75));
	}
	@Test
	void test2_USCLN() {// Test number2 is greater than number 1
		Advance1 a = new Advance1();
		assertEquals(5, a.USCLN(5, 25));
	}
	@Test
	void test3_USCLN() {// Test number2 equals number 1
		Advance1 a = new Advance1();
		assertEquals(100, a.USCLN(100, 100));
	}
	/*@Test
	void test4_USCLN() {// Test number1 = 0
		Advance1 a = new Advance1();
		assertEquals(100,a.USCLN(0,100));
		// Thầy xem giúp em cái này với ạ(code Advance1->USCLN). Em nhớ: nếu có
		// trường hợp 1 số khác 0 và 1 số = 0 thì UCLN là số khác 0
	}*/
	
	//BSCNN
	@Test
	void test1_BSCNN() {// Test number2 equals number 1
		Advance1 a = new Advance1();
		assertEquals(100, a.BSCNN(100, 100));
	}
	@Test
	void test2_BSCNN() {// Test number1 is greater than number 2
	Advance1 a = new Advance1();
		assertEquals(10, a.BSCNN(10,5));
	}
	@Test
	void test3_BSCNN() {// Test number2 is greater than number 1
		Advance1 a = new Advance1();
		assertEquals(100, a.BSCNN(5, 100));
	}
	/*@Test
	void test4_BSCNN() {// Test number1 = 0
		Advance1 a = new Advance1();
		assertEquals(0,a.BSCNN(0, 100));
		//USCLN lỗi nên BSCNN lỗi
	}*/
	
	//SUM
	Advance1 s = new Advance1();
	@Test
	void test1_sum() { // positive number
		assertEquals(23, s.sum(5765));
	}
	@Test
	void test2_sum() { // negative number
		assertEquals(-10, s.sum(-703));
	}
	
}
