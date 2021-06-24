package fraction;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FractionTest {
	Fraction f = new Fraction(3, 4);
	Fraction f2 = new Fraction(1,2);
	@Test
	void test() {
		f.plus(f2);
	}

}
