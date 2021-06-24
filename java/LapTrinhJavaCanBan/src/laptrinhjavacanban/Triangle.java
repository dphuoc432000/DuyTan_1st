package laptrinhjavacanban;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Triangle {
	private double a, b, c;
	private double Area, Circumference;
	public double getA() {
		return a;
	}

	public void setA(double a) {
		if(a <= 0) {
			a = 0;
			System.out.println("is not negative.");
		}
		else
			this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		if(b <= 0) {
			b = 0;
			System.out.println("is not negative.");
		}
		else
			this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		if(b <= 0) {
			b = 0;
			System.out.println("is not negative.");
		}
		else
			this.c = c;
	}

	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Triangle() {
	}
	public double Area() {
		double p = (this.a + this.b + this.c)/2;
		return Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c) );
	}
	public double Circumference(){
		return (this.a + this.b + this.c)/ 2;
	}
	public void input() throws FileNotFoundException {
		Scanner kb = new Scanner(new File("Triangle.txt"));
		PrintStream pr = new PrintStream(new File("S_CV.txt"));
		while (kb.hasNext())
		{
			this.setA(kb.nextDouble());
			this.setB(kb.nextDouble());
			this.setC(kb.nextDouble());
		}
		pr.println("Edge a: "+ this.getA());
		pr.println("Edge b: "+ this.getB());
		pr.println("Edge c: "+ this.getC());
		pr.println("Area: " + Area());
		pr.println("Circumference: " + Circumference());
	}
	public static void main(String[] args)throws FileNotFoundException {
		// TODO Auto-generated method stub
		Triangle t = new Triangle();
		t.input();
		
	
	}
}
