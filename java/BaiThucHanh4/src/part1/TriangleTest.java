package part1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangleTest {

	@Test
	void test1() {
		Triangle t  = new Triangle(5, 4, 3);
		assertEquals(5,t.maxLength());
	}
	@Test
	void test2() {
		Triangle t  = new Triangle(4, 6, 3);
		assertEquals(6,t.maxLength());
	}
	@Test
	void test3() {
		Triangle t  = new Triangle(4, 4, 9);
		assertEquals(9,t.maxLength());
	}

}
