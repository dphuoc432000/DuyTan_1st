package arryOfCandidate;

import java.util.Scanner;

import candidate.Candidate;
import date.Date;

public class ArrayOfCandidate {
	Candidate [] a = new Candidate[100];
	 Date dob = new Date();
	private int n;

	public int getN() {
		return n;
	}

	public void setN(int nn) {
		this.n = nn;
	}

	public ArrayOfCandidate() {
	}

	public ArrayOfCandidate(int n) {
		setN(n);
	}
	public void input()
	{
		Scanner kb = new Scanner(System.in);
		for(int i = 0; i < n; i++)
		{
			System.out.println("Enter student " + i + " : ");
			Candidate x =new Candidate();
			x.input();
			a[i] = x;
		}
	}
	public void output()
	{
		for(int i = 0 ; i < n; i++)
		{
			System.out.println("STUDENT " + i  + " : ");
			a[i].output();
		}
	}
	public void passStudent()
	{
		System.out.println("THE STUDENTS PASS: ");
		int count = 0;
		for(int i = 0; i < n; i++)
			if(a[i].average() > 5)
			{
				count++;
				a[i].output();
				System.out.println("------");
			}
		System.out.println("HOW MANY THE STUDENTS PASS? "+ count);
	}
	public void remove(int index)
	{
		for(int i = index ; i < n; i++)	
			a[i] = a[i + 1];
		n--;
	}
	public void removeNotPass()
	{
		for(int i = 0 ; i < n; i ++)
		{
			if(a[i].average() < 5)
				remove(i);
		}
		output();
	}
	public void sortYear()
	{
		for(int i = 0; i < n - 1; i ++)
			for(int j = i+ 1; j < n; j++)
			{
				if(a[i].getDob().getY() == a[j].getDob().getY())
				{
					Candidate temp = a[i + 1];
					a[i + 1] = a[j];
					a[j] = temp;
					i++;
				}
			}
		for(int i = 0; i < n-1; i++)// thu tu tang dan
			for(int j = i ; j < n ; j ++)
				if(a[i].getDob().getY() > a[j].getDob().getY() )
				{
					Candidate temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
		output();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ArrayOfCandidate arr = new ArrayOfCandidate(2);
		arr.input();
		System.out.println("STUDENT");
		arr.output();
		arr.passStudent();
		ArrayOfCandidate arr1 = new ArrayOfCandidate(4);
		arr1.input();
		arr1.output();
		System.out.println("------");
		arr1.removeNotPass();*/
		ArrayOfCandidate arr1 = new ArrayOfCandidate(10);
		arr1.input();
		arr1.output();
		arr1.sortYear();
		
	}

}
