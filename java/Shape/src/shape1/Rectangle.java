 package rectangle;

import java.util.Scanner;

import shape.Shape;

public class Rectangle extends Shape {
	protected double length, width;
	public void setLength(double l)
	{
		if(l < 0)
			System.out.println("Lenght is not negative");
		else
			this.length = l;
	}
	public double getLength()
	{
		return this.length;
	}
	public void setWidth(double w)
	{
		if (w < 0)
		{
			System.out.println("Width is not negative");
		}
		else
			this.width = w;
	}
	public double getWidth()
	{
		return this.width;
	}

	public Rectangle()
	{
		this.length = 0;
		this.width = 0;
	}
	public Rectangle(double l , double w)
	{
		this.setLength(l);
		this.setWidth(w);
	}
	@Override
	public double area()
	{
		return this.length * this.width;
	}
	public double calCirumference()
	{
		return (this.length + this.width) * 2;
	}
	@Override
	public void input()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter length: ");
		this.setLength(kb.nextDouble());
		System.out.println("Enter width: ");
		this.setWidth(kb.nextDouble());
	}
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		System.out.println("please enter the length.");
		double l = kb.nextDouble();
		System.out.println("please enter the width.");
		double w = kb.nextDouble();
		
		Rectangle r1 = new Rectangle();
		r1.length = 2;
		r1.width = 1;
		System.out.println(r1.area());
		System.out.println(r1.calCirumference());
		System.out.println(" ");
		Rectangle r2 = new Rectangle();
		r2.length = 3;
		r2.width = 4;
		System.out.println(r2.area());
		System.out.println(r2.calCirumference());
		System.out.println(" ");
		Rectangle r3 = new Rectangle(l,w);
		System.out.println(r3.getLength());
		System.out.println(r3.getWidth());
		System.out.println(r3.area());
		System.out.println(r3.calCirumference());
		System.out.println(" ");
		Rectangle r4 = new Rectangle(4,2);
		System.out.println(r4.getLength());
		System.out.println(r4.getWidth());
		System.out.println(r4.area());
		System.out.println(r4.calCirumference());
	}

}
