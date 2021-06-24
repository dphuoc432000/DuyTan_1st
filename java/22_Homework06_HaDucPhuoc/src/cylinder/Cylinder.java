package cylinder;

import java.util.Scanner;

public class Cylinder extends Circle {
	private double h;
	
		 			
	public Cylinder(double h, double r) {
		super(r);
		this.setH(h);
	}


	public double getH() {
		return h;
	}


	public void setH(double h) {
		this.h = h;
	}

	public Cylinder() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public void input()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter h: ");
		this.setH(kb.nextDouble());
		super.input();
	}
	@Override
	public double area()
	{
		return 2*super.area() + 2 * 3.14 *this. r * this.h;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cylinder c = new Cylinder();
		c.input();
		System.out.println(c.area());
	}
}
