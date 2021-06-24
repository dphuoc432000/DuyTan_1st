package linearEquation;

import java.util.Scanner;

public class LinearEquation 
{
	protected double b, c;
	public void setB(double b1)
	{
		this.b = b1;
	}
	public void setC(double c1)
	{
		this.c = c1;
	}
	public double getB()
	{
		return b;
	}
	public double getC()
	{
		return c;
	}
	public  LinearEquation (){
	}
	public  LinearEquation (double b0,  double c0){
		this.setB(b0);
		this.setC(c0);
	}
	public void input()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter b: ");
		this.setB(kb.nextDouble());
		System.out.println("Enter c: ");
		this.setC(kb.nextDouble());
	}
	public void solve()
	{
		if(b == 0)
			System.out.println("NO ROOF");
		else
			System.out.println("ROOF: " + -c/b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinearEquation n1= new LinearEquation();
		n1.b = 3;
		n1.c =3;
		n1.solve();
		LinearEquation n2= new LinearEquation(4,2);
		n2.solve();
		LinearEquation n3 = new LinearEquation();
		n3.input();
		n3.solve();
	}

}
