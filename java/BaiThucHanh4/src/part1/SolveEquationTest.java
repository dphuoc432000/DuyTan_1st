package part1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolveEquationTest {

	SolveEquation s = new  SolveEquation();
	@Test
	void SolveEquation1()
	{
		assertEquals("Multi roots", s.linearEquation(0,0));
	}
	@Test
	void SolveEquation2()
	{
		assertEquals("No root", s.linearEquation(0,5));
	}
	@Test
	void SolveEquation3()
	{
		assertEquals("One root", s.linearEquation(2,5));
	}

}
