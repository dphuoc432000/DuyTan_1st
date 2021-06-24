package point;

import java.util.Scanner;

public class Point {
	private double absiassa, ordirate;
	

	public double getAbsiassa() {
		return absiassa;
	}


	public void setAbsiassa(double a) {
		this.absiassa = a;
	}


	public double getOrdirate() {
		return ordirate;
	}


	public void setOrdirate(double b) {
		this.ordirate = b;
	}


	public Point() {
	}
	public Point(int a, int b)
	{
		this.setAbsiassa(a);
		this.setOrdirate(b);
	}
	public void input()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter absiassa: ");
		this.absiassa = kb.nextInt();
		System.out.println("Enter ordirate: ");
		this.ordirate = kb.nextInt();
	}
	public void output()
	{
		System.out.println("(" + this.absiassa + " ; " + this.ordirate + ")");
	}
	public double distance(Point b)
	{
		double  d;
		d = Math.sqrt(Math.pow(b.absiassa - this.absiassa,2) + Math.pow(b.ordirate - this.ordirate,2));
		return d;
	}
	public double area(Point b, Point c)
	{
		double s;
		s = (Math.abs((b.absiassa - this.absiassa)*(c.ordirate - this.ordirate)) - (c.absiassa - this.absiassa)*(b.ordirate - this.ordirate))/2;
		return s;
	}
	public void solve(Point b, Point c)
	{
		double ab = this.distance(b);
		double ac = this.distance(c);
		double bc = b.distance(c);
		if(ab + bc > ac && bc + ac > ab && ab + ac > bc)
		{
			double p =(ab + ac + bc) / 2;
			double s = Math.sqrt(p* ( p - ab) *(p - bc) * (p - ac));
			double cv = p * 2;
			System.out.println(" s2 " +s);
			System.out.println(" cv " + cv);
			if(ab == bc && ab == ac )
				System.out.println("is an equilateral triangle.");
			else if(Math.pow(ab, 2) + Math.pow(ac, 2) == Math.pow(bc, 2) || Math.pow(bc, 2) + Math.pow(ac, 2) == Math.pow(ab, 2) || Math.pow(bc, 2) + Math.pow(ab, 2) == Math.pow(ac, 2) )
				System.out.println("is the right triangle.");
			else if(ab == ac || ab == bc || bc == ac)
				System.out.println("is an isosceles triangle.");
		}
		else
			System.out.println("is not negative.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point(1,7);
		System.out.print("A");
		p1.output();
		Point p2 = new Point(7,1);
		System.out.print("B");
		p2.output();
		Point p3 = new Point(15,9);
		System.out.print("C");
		p3.output();
		System.out.println("............................");
		System.out.println("Result: ");
		System.out.print(" - AB = ");
		System.out.println(p1.distance(p2));
		System.out.print(" - AC = ");
		System.out.println(p1.distance(p3));
		System.out.print(" - BC = ");
		System.out.println(p2.distance(p3));
		System.out.print(" -> AREA TRIANGLE: ");
		System.out.println(p1.area(p2, p3));
	}

}
