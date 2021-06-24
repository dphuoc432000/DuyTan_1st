package rectangle;

import java.util.Scanner;

public class Rectangle {
	private double length, width;
	public void setLength(double l)
	{
		if(l < 0)
			System.out.println("Lenght is not negative");
		else
			length = l;
	}
	public double getLength()
	{
		return length;
	}
	public void setWidth(double w)
	{
		if (w < 0)
		{
			System.out.println("Width is not negative");
		}
		else
			width = w;
	}
	public double getWidth()
	{
		return width;
	}

	public Rectangle()
	{
		length = 0;
		width = 0;
	}
	public Rectangle(double l , double w)
	{
		setLength(l);
		setWidth(w);
	}
	public double calArea()
	{
		return length * width;
	}
	public double calCirumference()
	{
		return (length + width) * 2;
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
		System.out.println(r1.calArea());
		System.out.println(r1.calCirumference());
		System.out.println(" ");
		Rectangle r2 = new Rectangle();
		r2.length = 3;
		r2.width = 4;
		System.out.println(r2.calArea());
		System.out.println(r2.calCirumference());
		System.out.println(" ");
		Rectangle r3 = new Rectangle(l,w);
		System.out.println(r3.getLength());
		System.out.println(r3.getWidth());
		System.out.println(r3.calArea());
		System.out.println(r3.calCirumference());
		System.out.println(" ");
		Rectangle r4 = new Rectangle(4,2);
		System.out.println(r4.getLength());
		System.out.println(r4.getWidth());
		System.out.println(r4.calArea());
		System.out.println(r4.calCirumference());
	}

}
