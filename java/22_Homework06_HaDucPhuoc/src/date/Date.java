 package date;

import java.util.Scanner;

public class Date {
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
	}
	public int getY()
	{
		return y;
	}
	public int dayOfMonth()
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
	// phuong thuc khoi tao mac dinh cua minh
	// nhung khong nhan gia tri mac dinh cuar java 0 0 0
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
	public void input()// bo /**/ truoc khi chay bai
	{
		Scanner  kb = new Scanner(System.in);
		System.out.println("Enter year: ");
		// nhap cach 1
		int y  = kb.nextInt();
		setY(y);
		System.out.println("Enter month: ");
		//nhap cach 2
		setM(kb.nextInt());
		System.out.println("Enter day: ");
		setD(kb.nextInt());
	}
	public void output()
	{
		System.out.println(d + " / " + m + " / " + y );// bo /**/ truoc khi chay bai
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*NextDay n1 = new NextDay();
		n1.d = 30;
		n1.m = 12;
		n1.y = 2020;
		n1.nextDay();
		System.out.println(" ");
		NextDay n2 = new NextDay();
		System.out.println(n2.getD());
		System.out.println(n2.getM());
		System.out.println(n2.getY());
		n2.nextDay();
		System.out.println(" ");
		NextDay n4 = new NextDay(28,2,2020);
		System.out.println(n4.getD());
		System.out.println(n4.getM());
		System.out.println(n4.getY());
		System.out.println(" ");
		NextDay n3 = new NextDay(2, 12,1000);
		System.out.println(n3.getD());
		System.out.println(n3.getM());
		System.out.println(n3.getY());
		n3.nextDay();*/
		// ngay 21 thang 2 nam 2019
		Date dob1 = new Date(); // dob : day of birth 
		dob1.output();
		Date dob2 = new Date();
		dob2.input();
		dob2.output();
		Date dob3 = new Date(3,4,1999);
		dob3.output();	
	}
}
