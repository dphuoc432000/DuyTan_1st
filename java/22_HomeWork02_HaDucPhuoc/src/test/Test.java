package test;

import next_day.NextDay;
import square.Square;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choose = 2;
		switch(choose)
		{
		case 1:
		NextDay n1 = new NextDay();
		n1.setY(1900);
		n1.setM(2);
		n1.setD(3);
		System.out.println(n1.getD());
		System.out.println(n1.getM());
		System.out.println(n1.getY());
		n1.nextDay();
		break;
		case 2:
		Square s1 = new Square();
		s1.setA(2);
		s1.setB(9);
		s1.setC(4);
		s1.solve();
		Square n2 = new Square();
		n2.setA(0);
		n2.setB(7);
		n2.setC(5);
		n2.solve();
		break;
		default: System.out.println("choose only is 1 to 2");
		}
	}

}
