package test;

import linearEquation.LinearEquation;
import squareEquation.SquareEquation;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// con new con xai ham rieng của cha, rieng cua con.
		// va neu 2 ham giong nhau gia cha va con thi xai ham cua con.
		SquareEquation s = new SquareEquation();
		s.input();
		s.solve();
		s.f(2,3);
		s.getA();
		s.getB();
		s.getC();
		s.f1(1,2);
		s.f1(1,2,3);
		s.f2(1, 2, 3); 
		//tính đa hình
		//cha new con, di vao xai ca ham cua cha
		//nhung khi 2 ham giong nhau thi chay qua thuc hien body cua con
		LinearEquation ll = new SquareEquation();
		ll.input();// di vao cha sau do chay qua thuc hien con.
		ll.solve();
		ll.getB();
		ll.getC();
		ll.setB(2);
		ll.setC(2);
		ll.f(1,2);
		ll.f1(1,2,3)
	}

}
