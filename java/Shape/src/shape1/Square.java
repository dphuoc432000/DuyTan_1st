package square;

import java.util.Scanner;

import rectangle.Rectangle;

public class Square extends Rectangle{
	

	public Square() {
		super();
	}

	public Square(double edge) {
		super(edge,edge);
	}
	public void input()
	{
		Scanner kb = new Scanner (System.in);
		System.out.println("Enter edge: ");
		width = length = kb.nextDouble();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s = new Square();
		s.input();
		System.out.println(s.area());
		System.out.println(s.calCirumference());
	}

}
