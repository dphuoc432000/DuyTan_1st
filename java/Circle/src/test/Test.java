package test;

import circle.Circle;

public class Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
		c1.setR (5);
		System.out.println(c1.getR());
		System.out.println(c1.calArea());
		System.out.println(c1.calCirumference());
		Circle c2 = new Circle();
		c2.setR(3);
		System.out.println(c2.getR());
		System.out.println(c2.calArea());
		System.out.println(c2.calCirumference());
	}

}
