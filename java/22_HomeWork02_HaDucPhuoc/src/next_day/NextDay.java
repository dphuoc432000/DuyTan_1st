package next_day;

import java.util.Scanner;

public class NextDay {
	private int d, m, y;
	public void setD(int day)
	{
		if(day  < 0 || day > dayOfMonth())
		{
			System.out.println("day can not negative");
		}
		else
		{
			d = day;
		}
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
		}
		else
		{
			m = month;
		}
	}
	public int getM()
	{
		return m;
	}
	public void setY(int year)
	{
		if(year < 1800 || year > 5000)
		{
			System.out.println("day can not negative");
			year = 1900;
		}
		else
		{
			y = year;
		}
	}public int getY()
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
	public void nextDay()
	{
		d++;
		if(d > dayOfMonth())
		{
			d = 1;
			m ++;
			if(m > 12)
			{
				m = 1;
				y++;
			}
		}
		System.out.println(d + "/" + m + "/" + y);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		NextDay n1 = new NextDay();
		n1.d = 30;
		n1.m = 12;
		n1.y = 2020;
		n1.nextDay();
	}
}
