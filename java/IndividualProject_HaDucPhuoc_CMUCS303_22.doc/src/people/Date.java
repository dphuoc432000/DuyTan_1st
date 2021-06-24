 package people;

import java.util.Scanner;

public class Date {
	private int d, m, y;
	public void setD(int day)
	{
		if(day  < 0 || day > dayOfMonth())
		{
			System.out.println("day can not negative");
			day = 1;
		}
		else
			d = day;
	}
	public int getD()
	{
		return d;
	}
	public void setM(int month)
	{
		if(month  < 0 || month > 12)
		{
			System.out.println("month can not negative");
			month = 1;
		}
		else
			m = month;
	}
	public int getM()
	{
		return m;
	}
	public void setY(int year)
	{
		if(year < 1900 || year > 2019)
		{
			System.out.println("day can not negative");
			year = 1900;
		}
		else
			y = year;
	}
	public int getY()
	{
		return y;
	}
	int dayOfMonth()
	{
		if(m == 4 || m == 6 || m == 9 || m == 11)
			return 30;
		else if(m == 2)
			if((m % 4 == 0 && m % 100 != 0) || m % 400 ==0 )
				return 29;
			else
				return 28;
		else
			return 31;
	}
	public Date(){
		d = 1;
		m = 1;
		y = 1900;
	}
	public Date(int d, int m, int y)
	{
		setD(d);
		setM(m);
		setY(y);
	}
	public void input()
	{
		Scanner  kb = new Scanner(System.in);
		System.out.println("Enter year: ");
		setY(kb.nextInt());
		System.out.println("Enter month: ");
		setM(kb.nextInt());
		System.out.println("Enter day: ");
		setD(kb.nextInt());
	}
	public static void main(String[] args) 
	{
	}
}
