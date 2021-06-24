package arrayOfFraction;

import java.util.Scanner;
import fraction.Fraction;

public class ArrayOfFraction {
	Fraction [] a = new Fraction[100];
	private int n;

	public int getN() {
		return n;
	}

	public void setN(int nn) {
		if(n < 0)
			n = 0;
		else
			this.n = nn;
	}
	
	public ArrayOfFraction() {
	}
	
	public ArrayOfFraction(int n) {
		setN(n);
	}
	public void input()
	{
		Scanner kb = new Scanner(System.in);
		for(int i = 0; i < n; i++)
		{
			Fraction x = new Fraction();
			x.input();
			a[i]=x;
		}
	}
	public void output()
	{
		for(int i = 0 ; i < n; i++)
			a[i].output();
		System.out.println("------");
	}
	public void display()
	{
		for(int i = 0; i < n; i++)
			if(a[i].getDenominator() % 2 == 0)
				a[i].output();
		System.out.println("------");
	}
	public void maxFraction()
	{
		double max = 1.0*a[0].getNumerator() / a[0].getNumerator();
		int flag = 0;
		for(int i = 0 ; i < n ; i ++)
			if(max < 1.0 * a[i].getNumerator() / a[i].getDenominator())
			{	
				max = 1.0 * a[i].getNumerator() / a[i].getDenominator();
				flag = i;
			}
		a[flag].output();
		
	}
	public void maxSumFraction()
	{
		double max =0; //1.0*a[0].plus(a[1]).getNumerator() / a[0].plus(a[1]).getDenominator();
		int flag1 = 0;
		int flag2 = 0;
		for(int i = 0; i < n -1 ; i++)
		{
			if(max < 1.0*a[i].plus(a[i+1]).getNumerator() / a[i].plus(a[i+1]).getDenominator() )
			{
					max =  1.0*a[i].plus(a[i+1]).getNumerator() / a[i].plus(a[i+1]).getDenominator();
					flag1 = i;
					flag2 = i + 1;
			}
			
		}
		a[flag1].output();
		a[flag2].output();
	}
	public void increase()
	{
		for(int i = 0; i < n -1;i ++)
		{
			for (int j = n -1; j > i; j --)
				if(1.0 *a[j].getNumerator()/a[j].getDenominator() < 1.0* a[j - 1].getNumerator() / a[j-1].getDenominator())
				{
					Fraction temp = a[j  -1];
					a[j - 1] = a[j];
					a[j] = temp;
				}
		}
		for(int i = 0 ; i < n; i++)
			a[i].output();
	}
	public void plus()
	{
		int sumNum = a[0].getNumerator()*a[1].getDenominator() + a[0].getDenominator()*a[1].getNumerator();
		int sumDemo = a[0].getDenominator()*a[1].getDenominator();
		for(int i = 2; i < n;i++){
			sumNum = sumNum*a[i].getDenominator() + a[i].getNumerator()*sumDemo;
			sumDemo = sumDemo * a[i].getDenominator();
		}
		System.out.println(sumNum + "/" + sumDemo);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayOfFraction arr = new ArrayOfFraction(4);
		arr.input();
		arr.output();
		/*arr.display();
		arr.maxSumFraction();
		System.out.println("--------");
		arr.increase();*/
		arr.plus();
	}

}
