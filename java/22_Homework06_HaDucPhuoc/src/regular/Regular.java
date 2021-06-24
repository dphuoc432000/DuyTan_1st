package regular;

import java.util.Scanner;

import address.Address;
import date.Date;
import employee.Employee;

public class Regular extends Employee {
	private int yearOfExperence;
	private double rate, basicSalary;
	public Regular(int yearOfExperence, double rate, double basicSalary,String id, double allowance, String name, boolean sex, Date dob, Address add) {
		super(id, allowance, name, sex, dob, add);
		this.yearOfExperence = yearOfExperence;
		this.rate = rate;
		this.basicSalary = basicSalary;
	}
	public Regular() {
		super();
	}


	public int getYearOfExperence() {
		return yearOfExperence;
	}


	public void setYearOfExperence(int yearOfExperence) {
		if(yearOfExperence < 0)
			yearOfExperence = 0;
		else
			this.yearOfExperence = yearOfExperence;
	}


	public double getRate() {
		return rate;
	}


	public void setRate(double rate) {
		if(rate < 0)
			rate = 1;
		else
			this.rate = rate;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		if(basicSalary < 0)
			basicSalary = 0;
		else
			this.basicSalary = basicSalary;
	}
	@Override
	public void input()
	{
		Scanner kb = new Scanner(System.in);
		super.input();
		System.out.println("Enter year of experence: ");
		this.setYearOfExperence(kb.nextInt());
		System.out.println("Enter rate: ");
		this.setRate(kb.nextDouble());
		System.out.println("Enter basic salary: ");
		this.setBasicSalary(kb.nextDouble());
	}
	@Override
	public void output()
	{
		super.output();
		System.out.println("Year of experence: " + yearOfExperence);
		System.out.println("Rate: " + rate);
		System.out.println("Basic Salary: " + basicSalary);
	}
	@Override
	public double computeSalary()
	{
		return rate * basicSalary + allowance;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Regular r = new Regular();
		r.input();
		r.output();
	}

}