package candidate;

import java.util.Scanner;

import address.Address;
import date.Date;


public class Candidate {
	private int codeID, d,m,y;
	private String name;
	private double mark1, mark2, mark;
	Date dob = new Date();
	Address ad = new Address();
	public Address getAd() {
		return ad;
	}

	public void setAd(Address add) {
		this.ad = add;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob1) {
		this.dob = dob1;
	}

	public int getCodeID() {
		return codeID;
	}

	public void setCodeID(int ID) {
		if(ID < 0)
			System.out.println("cant negative.");
		else
			this.codeID = ID;
	}

	public int getD() {
		return d;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMark1() {
		return mark1;
	}

	public void setMark1(double m1) {
		if(m1 < 0)
		{	
			System.out.println("cant negative.");
			m1 = 1;
		}
		else
			this.mark1 = m1;
	}

	public double getMark2() {
		return mark2;
	}

	public void setMark2(double m2) {
		if(m2 < 0)
		{
			System.out.println("cant negative.");
			m2 = 1;
		}
		else
			this.mark2 = m2;
	}

	public double getMark() {
		return mark;
	}

	public void setMark(double m) {
		if(m < 0)
		{
				System.out.println("cant negative.");
				m = 1;
		}
		else
			this.mark = m;
	}
	public void input()// bo /**/ & // truoc khi chay bai
	{
		Scanner kb = new Scanner(System.in);
		/*System.out.println("Enter codeID: ");
		//codeID = kb.nextInt(); chi nhap khong kem ham thiet lap lai gia tri
		setCodeID(kb.nextInt()); // vua nhap vua kem ham thiet lap lai gia tri
		kb.nextLine();
		System.out.print("Enter name: ");
		//name = kb.nextLine();
		setName(kb.nextLine());
		System.out.print("Enter test mark 1: ");
		//mark1 = kb.nextDouble();
		setMark1(kb.nextDouble());
		System.out.print("Enter test mark 2: ");
		//mark2 = kb.nextDouble();
		setMark2(kb.nextDouble());
		System.out.print("Enter test mark: ");
		//mark = kb.nextDouble();
		setMark(kb.nextDouble());*/
		dob.input();
		//ad.input();
	}
	public void output()// bo /**/ & // truoc khi chay bai
	{
		/*System.out.println("ID: " + codeID);
		System.out.println("name: " + name);
		System.out.println("test mark 1: " + mark1);
		System.out.println("test mark 2: " + mark2);
		System.out.println("test mark: " + mark);*/
		dob.output();
		//ad.output();
	}
	public double average()
	{
		return (((mark1 + mark2)/2) + (mark *2))/3;
	}
	public void rank()
	{
		System.out.println("-> RANK: ");
		if(average() >= 8 && average() <= 10)
			System.out.println("Good");
		else if(average() >= 7 && average() <8)
			System.out.println("Fairly good");
		if(average() >= 5 && average() <7)
			System.out.println("Average");
		if(average() < 5)
			System.out.println("Fail");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Candidate q1 = new Candidate();
		q1.input();
		q1.output();
		q1.rank();
		Date dob1 = q1.getDob();
		Address ad1 = q1.getAd();
	}

}
