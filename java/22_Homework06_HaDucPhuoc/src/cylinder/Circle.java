package cylinder;

import java.util.Scanner;

import shape.Shape;

public class Circle extends Shape {
	protected double r;
	public Circle(double r) {
		this.setR(r);
	}
	public Circle() {
	}
	public void setR(double r1)
	{
		if(r1 < 0)
		{
			System.out.println("R1 can not negative");
		}
		else
			this.r = r1;
	}
	public double getR()
	{
		return r;
	}
	@Override
	public double area()
	{
		return this.r * this.r * 3.14;
	}
	public double calCirumference()
	{
		return this.r * 2 * 3.14;
	}
	@Override
	public void input()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter r: ");
		this.setR(kb.nextDouble());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
		c1.r = 2;
		System.out.println(c1.area());
		System.out.println(c1.calCirumference());
		Circle c2 = new Circle();
		c2.r = 3;
		System.out.println(c2.area());
		System.out.println(c2.calCirumference());
	}

}
