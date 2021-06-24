package squareEquation;

import java.util.Scanner;

import linearEquation.LinearEquation;

public class SquareEquation extends LinearEquation {
	private double a;

	public SquareEquation(double a, double b , double c) {
		super(b,c);
		this.a = a;
	}

	public SquareEquation() {
		super();
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}
	@Override
	public void input()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a: ");
		this.setA(kb.nextDouble());
		super.input();
	}
	@Override
	public void solve()
	{
		int delta =  (int) (Math.pow(b, 2) - 4 * a * c);
		if(a == 0)
			super.solve();
		else 
		{
			if(delta == 0)
				System.out.println("ROOF: " + -b/(2*a));
			else if(delta < 0)
				System.out.println("NO ROOF.");
			else
			{
				System.out.println("ROOF 1: " + (-b * b  + Math.sqrt(delta)) / (2 * a) );		
				System.out.println("ROOF 1: " + (-b * b  + Math.sqrt(delta)) / (2 * a) );
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SquareEquation s1 = new SquareEquation();
		s1.input();
		s1.solve();
	}

}
