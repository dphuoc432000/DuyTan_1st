package arrayOfPoint;

import java.util.Scanner;

import point.Point;

public class ArrayOfPoint {
	Point [] a = new Point[100];
	private int n;

	public ArrayOfPoint(int nn) {
		setN(nn);
	}

	public ArrayOfPoint() {
	}

	public int getN() {
		return n;
	}

	public void setN(int nn) {
		this.n = nn;
	}
	public void input()
	{
		Scanner kb = new Scanner(System.in);
		for(int i  = 0; i  < n; i++)
		{
			
			System.out.println("Enter number " + i + " : ");
			Point x = new Point();
			x.input();
			a[i] = x;
		}
	}
	public void output()
	{
		for(int i = 0 ; i < n; i++)
		{	
			a[i].output();
		}
		System.out.println();
	}
	public void maxDistance()
	{
		double max = 0;
		int flag1 = 0;
		int flag2 = 0;
		for(int i = 0; i < n - 1; i++)
			for(int j = i  + 1;j < n; j++)
			{
				if (max < 1.0 * a[i].distance(a[j]));
				{
					max = 1.0 * a[i].distance(a[j]);
					flag1 = i;
					flag2 = j;	
				}
			}
		a[flag1].output();
		a[flag2].output();
	}
	public void maxCircumference()
	{
		double max = 0;
		int flag1 = 0;
		int flag2 = 0;
		int flag3 = 0;
		for(int i = 0; i < n - 2; i ++)
			for(int j = i + 1; j < n -1; j ++)
				for(int k = j + 1; k < n; k++)
					if(max < 1.0 * a[i].distance(a[j]) + 1.0 * a[j].distance(a[k]) + 1.0 * a[i].distance(a[k]))
					{
						max = 1.0 * a[i].distance(a[j]) + 1.0 * a[j].distance(a[k]) + 1.0 * a[i].distance(a[k]);
						flag1= i;
						flag2 = j;
						flag3 = k;
					}
		System.out.println(max);
		a[flag1].output();
		a[flag2].output();
		a[flag3].output();
	}
	public void maxArea()
	{
		double max = 0 ;
		int flag1 = 0;
		int flag2 = 0;
		int flag3 = 0;
		for(int i = 0; i < n -2; i++)
		{
			if(max < 1.0 * a[i].area(a[i+1], a[i+2]))
				{
					max = 1.0 * a[i].area(a[i+1], a[i+2]);
					flag1 = i;
					flag2 = i+1;
					flag3 = i+2;
				}
		}
		a[flag1].output();
		a[flag2].output();
		a[flag3].output();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayOfPoint arr = new ArrayOfPoint(5);
		arr.input();
		arr.output();
		arr.maxDistance();
		arr.maxCircumference();
		arr.maxArea();
	}

}
