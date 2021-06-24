package complex;

import java.util.Scanner;

public class Complex {
	private double a , b;
	public double getA() {
		return a;
	}
	public void setA(double aa) {
		this.a = aa;
	}


	public double getB() {
		return b;
	}


	public void setB(double bb) {
		this.b = bb;
	}
	
	public Complex() 
	{
	}
	public Complex(double aa , double bb) 
	{
		this.setA(aa);
		this.setB(bb);
	}
	public void input()
	{
		Scanner kb = new Scanner(System.in);
		this.a = kb.nextDouble();
		this.b = kb.nextDouble();
	}
	public void output()
	{
		System.out.println(this.a + " + i * " + this.b);
	}
	public void add(Complex y)
	{
		double aa = this.a + y.a ;
		double bb = this.b + y.b;
		a = aa;
		b = bb;
		output();
	}
	public void subtract(Complex y)
	{
		double aa = this.a - y.a ;
		double bb = this.b - y.b;
		a = aa;
		b = bb;
		output();
	}
	public void multiply(Complex y)
	{
		double aa = this.a * y.a + this.b * y.b ;
		double bb = this.a * y.b + this.b * y.a;
		a = aa;
		b = bb;
		output();
	}
	public void divide(Complex y)
	{
		double aa = (this.a * y.a + this.b * y.b)/(Math.pow(y.a, 2) - Math.pow(y.b, 2)) ;
		double bb = (this.a * y.b + y.a * this.b)/(Math.pow(y.a, 2) - Math.pow(y.b, 2));
		a = aa;
		b = bb;
		output();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex x = new Complex(3,4);
		x.output();
		Complex y = new Complex(4,5);
		y.output();
		x.add(y);
		x.subtract(y);
		x.multiply(y);
		x.divide(y);
	}

}
