package fraction;

import java.util.Scanner;

public class Fraction {
	private int numerator , denominator;
	

	public int getNumerator() {
		return this.numerator;
	}


	public void setNumerator(int n) {
		this.numerator = n;
	}


	public int getDenominator() {
		return this.denominator;
	}


	public void setDenominator(int d) {
		if(d == 0)
			this.denominator = 1;
		else
			this.denominator = d;
	}


	public Fraction() {
	}
	public Fraction(int n, int d) {
		this.setNumerator(n);
		this.setDenominator(d);
	}
	public void input()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter number: ");
		System.out.println("-Enter numerator: ");
		this.numerator = kb.nextInt();
		System.out.println("-Enter denominator: ");
		this.denominator = kb.nextInt();
	}
	public void output()
	{
		System.out.print( this.numerator + " / " + this.denominator);
		System.out.println();
	}
	public Fraction plus(Fraction f2)
	{
		Fraction f3 = new Fraction();
		f3.numerator = this.numerator * f2.denominator + this.denominator * f2.numerator;
		f3.denominator = this.denominator * f2.denominator;
		return f3;
	}
	public Fraction subtract(Fraction f2)
	{
		Fraction f3 = new Fraction();
		f3.numerator = this.numerator * f2.denominator - this.denominator * f2.numerator;
		f3.denominator = this.denominator * f2.denominator;
		return f3;
	}
	public Fraction multiplicat(Fraction f2)
	{
		Fraction f3 = new Fraction();
		f3.numerator = this.numerator * f2.numerator;
		f3.denominator = this.denominator * f2.denominator;
		return f3;
	}
	public Fraction divide(Fraction f2)
	{
		Fraction f3 = new Fraction();
		f3.numerator = this.numerator * f2.denominator;
		f3.denominator = this.denominator * f2.numerator;
		return f3;
	}
	public int hCF()//Highest Common Factor 
	{
		/*if(this.numerator == 0 || this.denominator  == 0)
			return this.numerator + this.denominator  ;
		else
			while(this.numerator !=  this.denominator)
			{
				if(this.numerator > this.denominator)
					numerator = numerator - denominator;
				else
					this.denominator = this.denominator - this.numerator;
			}
		return numerator;*/
		int a = this.numerator;
		int b = this.denominator;
		if(a == 0 || b == 0)
			return a + b;
		else
			while(a !=  b)
			{
				if(a > b)
					a = a - b;
				else
					b = b - a;
			}
		return a;
	}
	public void resize(int numerator, int denominator){
		int temp = hCF();
		numerator = this.numerator / temp;
		denominator = this.denominator / temp;
	}
	public static void main(String[] args) {
		Fraction f1 = new Fraction(10,5);
		f1.output();
		Fraction f2 = new Fraction(3,4);
		f2.output();
		/*Fraction f3 = f1.plus(f2);
		f3.resize();
		f3.output();
		Fraction f4 = f1.subtract(f2);
		f4.resize();
		f4.output(); 
		Fraction f5 = f1.multiplicat(f2);
		f5.resize();
		f5.output();
		Fraction f6 = f1.divide(f2);
		f6.resize();
		f6.output();*/
		Fraction f7 = new Fraction();
		f7 = f1.plus(f2);
		System.out.println(f7.getNumerator());		
	}

}
