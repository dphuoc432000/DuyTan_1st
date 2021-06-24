package exercise1;

import java.util.Scanner;

public class Exercise1 {
	private int n;
	
	public int getN() {
		return n;
	}

	public void setN(int nn) {
		n = nn;
	}
	public Exercise1(int n)
	{
		setN(n);
	}
	public String eng(int k)// k la chu so
	{
		if(k == 1)
			return("one");
		else if(k == 2)
			return("two");
		else if(k == 3)
			return("three");
		else if(k == 4)
			return("four");
		else if(k == 5)
			return("five");
		else if(k == 6)
			return("six");
		else if(k == 7)
			return("seven");
		else if(k == 8)
			return("eight");
		else if(k == 9)
			return("nine");
		else
			return("zero");
	}
	public void binary()
	{
		String s = "";
		while (n > 0)
		{
			int du = n % 2;
			n = n / 2;
			s = s + du; 	
		}
		System.out.println(s);
	}
	public void read()
	{
		String ss = "";
		while(n > 0)
		{
			int k = n % 10;
			n = n / 10;
			eng(k);
			ss = ss + k;
		}
		System.out.println(ss);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ex = new Scanner(System.in);
		int n = ex.nextInt();
		Exercise1 e1 = new Exercise1(n);
		e1.binary();
		e1.read();
	}
}
