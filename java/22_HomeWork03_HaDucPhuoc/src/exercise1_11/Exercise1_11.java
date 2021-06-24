package exercise1_11;

import java.util.Scanner;

public class Exercise1_11 {
	private int n;
	public void setN(int nn)
	{
		if(n < 0)
			System.out.println("can not negative.");
		else
			n = nn;
	}
	public int getN()
	{
		return n;
	}
	public Exercise1_11()
	{
	}
	public Exercise1_11(int n)
	{
		setN(n);
	}
	public void question1(int n)
	{
		for(int i = 1; i <= n; i++)
		{
			for(int j = n; j >= i; j -- )
			{
				System.out.print(i + " ");
			}
			System.out.println(" ");
		}
	}
	public void question2(int n)
	{
		for (int i = 1; i <= n; i++)
		{
			for(int j = i; j > 0; j --)
				System.out.print(j + " ");
			System.out.println(" ");
		}
	}
	public void question3(int n)
	{
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1;j <= n -i; j ++)
				System.out.print(" ");
			for(int k = 1; k <= i; k++ )
				System.out.print(k);
			for(int h = i -1; h >= 1; h--)
				System.out.print(h);
			System.out.println(" ");
		}
	}
	public void question4(int n)
	{
		int s =1;
		int gt =1;
		if(n > 0)
		{
			for(int i = 1; i < n; i++)
			{
				gt = gt* i;
			}
			s = n * gt;
			System.out.println(s);
		}
		else if(n == 0)
		{
			gt = 1;
			System.out.println(s = n);
		}
		
	}
	public void question5(int n)
	{
		int p =1;
		for(int i = n; i > 0; i = i -2)
			p = p * i;
		System.out.println(p);
	}
	//question6
	public boolean isPrime(int x)
	{
		if(x < 2)
			return false;
		for(int i = 2; i <= Math.sqrt(x); i++)
		{
			if(x % i == 0)
				return false;
		}
		return true;
	}
	public boolean question6_1()
	{
		return isPrime(n);
	}
	public void question6_2()
	{
		for(int i = 2; i <= n; i++)
		{
			if(isPrime(i) == true)
			{
				System.out.print(i);
			}
		}
	}

	
	public void question6_3(int n)
	{
		
		for(int i =2; i > 1; i++)
		{
			if(isPrime(i)== true)
			{
				System.out.println(" "+ i + " ");
				n --;	
			}
			if(n == 0)
				break;
		}
	}
//question 7
	public boolean isPerfect(int n)
	{
		int s =0;
		for(int i = 1; i < n; i++)
		{
			if(n % i == 0)
			{
				s = s + i;
			}
			
		}
		if(s != n)
			return false;
		else
			return true;
	}
	public boolean question7_1(int n)
	{
		return isPerfect(n);
	}
	public void question7_2(int n)
	{
		for (int i = 1; i > 1; i++)
		{
			if(isPerfect(i)== true)
			{
				System.out.print(i + " ");
				n -- ;
			}
			if(n == 0)
			{
				break;
			}
		}
	}
	//question8
	public void question8_1(int n)
	{
		int s =1;
		for(int i = 2; i <= n; i++)
		{
			int gt = 1;
			for(int j = 1 ; j <= i; j++)
			{
				gt = gt * j;
			}
			s = s + gt;
		}
		System.out.println(s);
		
		
	}
	public void question8_2(int n)
	{
		int s = 0;
		for(int i = 1; i <= n; i++)
		{	
			s = (int) (s + Math.pow(i,2));
		}
		System.out.println(s);
	}
	public double question8_3(int n)
	{
			double s=0;
			for(double i = 0; i <= n; i++)
			{
				s = s + (i/(i+1)) ;
				
			}
			return s;
	}
	public void question8_4(int n)
	{
		int s = 1;
		for(int i = 1; i <= n; i++)
		{	
			s = (int) (s + Math.pow(2,2*i-1));
		}
		System.out.println(s);
	}
	public void question9_1(int n)
	{
		int s = 0;
		int dem = 0;
		while(n > 0)
		{
			s = s + n % 10;
			n = n / 10;
			dem++;
		}
		System.out.println(dem);
		System.out.println(s);
	}
	public void question9_2(int n)
	{
		int s = 0;
		while(n  > 0)
		{
			int du = n % 10;
			n = n / 10;
			s = s * 10 + du;
		}
		System.out.println(s);
	}
	public boolean validNumber(int n)
	{
		int dem = 0;
		while(n > 0)
		{
			int du = n % 10;
			dem++;
			n = n/ 10;
		}
		if(dem != 3)
			return false;
		else
			return true;
	}
	public void question10(int n)
	{
		if(validNumber(n) == true)
			System.out.println(" is valid number");
		else
			System.out.println("is invalid number");
	}
	public void question11(int n)
	{
		int i = 2;
		while(n > 0)
		{
			if(n == i)
			{
				System.out.print(i);
				break;
			}
			if(isPrime(i) == true)
			{
				
				if(n % i == 0)
				{
					System.out.print(i + " * ");
					n = n / i;
				}
				else
					i++;
			}
		}
	}
		public void exercise1_04()
		{
			int s = 0;
			int bin = 0;
			int k = 0;
			
			while (n> 0)
			{
				int du = n % 2;
				n = n / 2;
				s = s * 10 + du;
			}
			while(s > 0)
			{
				bin = bin * 10 + s % 10;
				s = s /10;
			}
			System.out.println(bin);
			
		}
		public void exercise1_2_04()
		{
			int k = 0;
			while(n > 0)
			{
				k = n % 10;
				n = n / 10;
				if(k == 0)
					System.out.println("khong");
				else if(k == 1)
					System.out.print("mot ");
				else if(k == 2)
					System.out.print("hai ");
				else if(k == 3)
					System.out.print("ba ");
				else if(k == 4)
					System.out.print("bon ");
				else if(k == 5)
					System.out.print("nam ");
				else if(k == 6)
					System.out.print("sau ");
				else if(k == 7)
					System.out.print("bay ");
				else if(k == 8)
					System.out.print("tam ");
				else if(k == 9)
					System.out.print("chin ");
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner st2 = new Scanner(System.in);
		int n = st2.nextInt();
		Exercise1_11 ex = new Exercise1_11(n);
		/*ex.question1(8);
		ex.question2(6);
		ex.question3(5);
		ex.question4(7);
		ex.question5(5);
		//ex.question11(12);
		System.out.println(ex.question6_1());
		ex.setN(1);
		System.out.println(ex.question6_1());
		System.out.println(ex.isPrime(-7));
		System.out.println(ex.isPrime(1));
		System.out.println(ex.isPrime(2));
		System.out.println(ex.isPrime(9));
		System.out.println(ex.isPrime(7));
		ex.n=9;
		ex.question6_2();
		ex.question6_3(30);
		System.out.println(ex.question7_1(28));
		ex.question7_2(7);
		ex.question8_1(3);
		ex.question8_2(3);
		System.out.println(ex.question8_3(8));
		ex.question8_4(4);
		ex.question9_1(2536);
		ex.question9_2(203);
		ex.question10(123);
		ex.question11(100);*/
		ex.exercise1_04();
		ex.exercise1_2_04();
	}

}
