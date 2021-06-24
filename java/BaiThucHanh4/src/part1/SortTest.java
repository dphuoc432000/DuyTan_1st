package part1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SortTest {
	//A > B
	@Test
	void test1() {
		Sort s = new Sort(3,2);
		s.sortAsc();
		assertEquals(2, s.getNumber1());
		assertEquals(3, s.getNumber2());
	}
	@Test
	void test2() {
		Sort s = new Sort(1,2);
		s.sortAsc();
		assertEquals(1, s.getNumber1());
		assertEquals(2, s.getNumber2());
	}
	// A < B
	@Test
	void test3() {
		Sort s = new Sort(5,4);
		s.sortDesc();
		assertEquals(5, s.getNumber1());
		assertEquals(4, s.getNumber2());
	}
	@Test
	void test4() {
		Sort s = new Sort(6,7);
		s.sortDesc();
		assertEquals(7, s.getNumber1());
		assertEquals(6, s.getNumber2());
	}
}
