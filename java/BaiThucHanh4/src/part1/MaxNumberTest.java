package part1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaxNumberTest {
	MaxNumber m = new MaxNumber();
	
	//MAX 3 
	@Test
	void test1_max3() {
		assertEquals(3, m.max3(3, 2, 0));
	}
	@Test
	void test2_max3() {
		assertEquals(6, m.max3(1,6,4));
	}
	@Test
	void test3_max3() {
		assertEquals(100, m.max3(50,25,100));
	}
	//MAX 2
	void test1_max2() {
		assertEquals(4, m.max2(4, 2));
	}
	@Test
	void test2_max2() {
		assertEquals(6, m.max2(1,6));
	}

}
