package array;

import java.util.Scanner;

public class ArrayOfInteger {

	int []a  = new int [100];
	private int n;
	public void setN(int nn)
	{
		if(nn < 0)
			System.out.println("cant negative");
		else
			n = nn;
	}
	public int getN()
	{
		return n;
	}
	public ArrayOfInteger()
	{
	}
	public ArrayOfInteger(int nn)
	{
		setN(nn);
	}
	public void input()
	{
		Scanner kb = new Scanner(System.in);
		for(int i = 0; i < n; i++)
		{
			System.out.print("Enter element " + i + ": ");
			int x = kb.nextInt();
			a[i] = x;
		}
	}
	public void output()
	{
		for(int i = 0; i < n; i ++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
	public int sum()
	{
		int s= 0;
		for(int i = 0; i < n; i++)
		{
			if(a[i] % 2 == 0 && a[i] % 5 == 0)
				s = s+ a[i];
		}
		System.out.println("==================");
		System.out.print("Sum: ");
		
		return s;
	}
	public int min()
	{
		int min = a[0];
		for(int i = 1; i < n; i++)
			if(a[i] < min)
				min = a[i];
		System.out.print("- Min: ");
		return min;
	}
	public int minS()
	{
		int min = a[0] + a[1];
		for(int i = 1; i < n; i++)
			if(a[i] + a[i+1] < min)
				min = a[i] + a[i+1];
		return min;
	}
	public void averageOdd()
	{
		int s = 0;
		int count = 0;
		for(int i = 0; i < n; i++ )
			if(a[i] % 2 != 0)
			{
				count++;
				s = s + a[i];
			}
		System.out.print("- AverageOdd: ");
		System.out.println(s/count);

	}
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
	public int countPrime()
	{
		int count = 0;
		for(int i = 0; i < n; i++)
			if(isPrime(a[i]))
				count++;
		System.out.print("- Count numbers is prime: ");
		return count;
	}
	public void reverse()
	// dao nguoc mang
	{
		System.out.print("- Reverse: ");
		/*for(int i = n - 1; i >= 0; i--)
			System.out.print(a[i] + " ");
		System.out.println();*/
		/*
		 // processing
		 for(int i = 0; i < n; i ++)
		{	
			for(int j =n -1;j >= 0; j-- )
			{
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				System.out.print(a[i] + " ");
			}
			
			System.out.println();
		}*/
	}
	public boolean symmetry()
	// doi xung mang
	{
		System.out.print("is symmetry array: ");
		/*for(int i = 0; i < n; i++)
			if(a[i] != a[n - i - 1])
					return false;
		return true;*/	
		int i = 0;
		int j = n -1;
		while(i <j)
		{
			if(a[i] != a[j])
				return false;
			i++;
			j--;
		}
		return true;
	}public boolean increases()
	{
		System.out.print("- Is increases array: ");
		for(int i = 0; i < n -1; i++)
			if(a[i] > a[i+1])
				return false;
		return true;
	}
	public boolean search(int n)
	{
		Scanner kb = new Scanner(System.in);
		for(int i = 0;i <n;i++)
			if(a[i] == n)
				return true;
		return false;
	}
	public void remove(int index)
	{
		for(int i = index; i < n -1; i++)
		{
			a[i] = a[i + 1];
		}
		n--;
		output(); 
	}
	public void removeNagative()
	{
		for(int j = 0; j < n;j++)
		{
			if(a[j] < 0)
			{
				remove(j);
				j--;
			}
		}
		output();
		System.out.println();
	}
	public void removeDuplicate()
	{
		for(int i = 0; i < n - 1; i++)
			for(int j = i + 1;j < n;j++)
				if(a[j] == a[i])
				{
					remove(j);
					i--;
				}
		output();
	}
	public void insert(int x, int index)
	{
		for(int i =n ; i > index ; i --)
			a[i] = a[i - 1];
		a[index] = x;
		n++;
	}
	public void insertIncreasing(int x)
	{
		System.out.print("- Is increases array: ");
		for(int i = n - 1; i >= 0; i--)
			if(a[i] < x)
			{
				insert(x, i + 1 );
				break;
			}
		if(x < a[0])
		{
			insert(x, 0);
		}
		output();		 
	}
	public void sort()
	{
		for(int i = 0; i  < n -1; i++)
			for(int j = n -1; j > i; j--)
				if(a[j] < a[j-1])
				{
					int temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
				}
		output();
	}
	public static void main(String[] args)
	{
		ArrayOfInteger a = new ArrayOfInteger(5);
		//System.out.println(a.getN);
		a.input();
		a.output();
		System.out.println(a.sum());
		System.out.println(a.min());
		System.out.println(a.countPrime());
		a.averageOdd();
		a.reverse();
		System.out.println(a.symmetry());
		System.out.println(a.increases());
		System.out.println(a.search(5));
		//a.remove(2);
		a.removeNagative();
		a.removeDuplicate();
		a.insertIncreasing(-7);
		a.sort();
	}
}