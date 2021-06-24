package managerTeacher1;

import java.util.Scanner;
public class Date {
	//khai bao thuoc tinh
	private int day,month,year;
	//ham khoi tao khong doi so
	public Date() {
		this.day=1;
		this.month=1;
		this.year=1900;
	}

	public static Date convertStringToDateOfBirth(String date) {
		Date dayOfBirth = new Date();
		String [] dateArr = date.split("/");
		dayOfBirth.setDay(Integer.valueOf(dateArr[0]));
		dayOfBirth.setMonth(Integer.valueOf(dateArr[1]));
		dayOfBirth.setYear(Integer.valueOf(dateArr[2]));
		return dayOfBirth;
	}
	//ham khoi tao co doi so
	public Date(int d,int m, int y)
	{
		setYear(y);
		setMonth(m);
		setDay(d);
	}
	
	
	public int getDay()
	{
		return this.day;
	}
	public void setDay(int d)
	{
		if(d<0 || d> numberOfDay())
			this.day=1;
		else 
			this.day=d;
	}
	public int getMonth()
	{
		return this.month;
	}
	public void setMonth(int m)
	{
		if(m<0 && m>12)
			this.month=1;
		else 
			this.month=m;
	}
	public int getYear()
	{
		return this.year;
	}
	public void setYear(int y)
	{
		if(y<1900 || y>5000)
			this.year=1;
		else 
			this.year=y;
	}
	public void input() {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter year :");
		this.setYear(kb.nextInt());
		System.out.println("Enter month :");
		this.setMonth(kb.nextInt());
		System.out.println("Enter day :");
		this.setDay(kb.nextInt());
		
	}
	public void output() {
		System.out.print("\t"+this.day+"/"+this.month+"/"+this.year);
	}
	
	public int numberOfDay()
	{
		if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
			
			return 31;
	
		else if(month==4 || month==6 || month==9 || month==11)
				return 30;
			else 
			{
				if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
					return 29;
				else 
					return 28;
			}
		
	}
	
		public void nextDay()
		{
		if(day==numberOfDay())
			if(month==12) System.out.println("1/1/"+(++year));
			else System.out.println("1/"+(++month)+"/"+year);
		else System.out.println((++day)+"/"+month+"/"+year);
		}	

	
	public static void main(String[] args) {
		//tao cac doi tuong co gia tri cu the rieng
			Date A=new Date();
			A.input();
			A.output();
	
			
		}

	public String outputFile() {
		return "\t"+this.day+"/"+this.month+"/"+this.year;
	}
}