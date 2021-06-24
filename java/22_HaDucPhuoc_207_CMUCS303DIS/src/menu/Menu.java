package menu;

import equation.Equation;
import sum.Sum;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choose = 3;
		switch(choose)
		{
		case 1:
			Equation e1 = new Equation();
			e1.setA(1); 
			e1.setB(2);
			e1.setC(1);
			e1.solve();
			Equation e2 = new Equation();
			e2.setA(1); 
			e2.setB(2);
			e2.setC(3);
			e2.solve();
			Equation e3 = new Equation();
			e3.setA(1); 
			e3.setB(3);
			e3.setC(2);
			e3.solve();
			break;
		case 2:
			Sum s1 = new Sum();
			s1.setN(1234);
			System.out.println(s1.result());
			Sum s2 = new Sum();
			s2.setN(25347);
			System.out.println(s2.result());
			break;
		case 3:
			System.out.println("Exit");
			break;
		default :System.out.println( "choose only 1 to 3");
		}
	}

}
