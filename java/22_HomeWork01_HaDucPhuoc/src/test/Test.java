package test;

import linear.Linear;
import triangle.Triangle;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choose = 3;
		switch(choose)
		
		{
		
		case 1:
			
		Linear n1= new Linear();
		n1.setB(2);
		n1.setC(4);
		System.out.println(n1.solve());
		Linear n2= new Linear();
		n2.setB(4);
		n2.setC(2);
		System.out.println(n2.solve());
		break;
		
		case 2:
		
		Triangle t1 = new Triangle();
		t1.setA(3);
		t1.setB(4);
		t1.setC(5);
		if(t1.triangle() == true)
		{
			System.out.println("la tam giac.");
			t1.calArea();
			System.out.println(t1.calCirumference());
		}
		else 
			System.out.println("khong phai tam giac");
		break;
		default: System.out.println("choose only 1 to 2");
		}
	}

}
