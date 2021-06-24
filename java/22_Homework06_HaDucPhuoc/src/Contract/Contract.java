package Contract;

import java.util.Scanner;

import address.Address;
import date.Date;
import employee.Employee;

public class Contract extends Employee{
	private double gradeSalary;
	

	public double getGradeSalary() {
		return gradeSalary;
	}


	public void setGradeSalary(double gradeSalary) {
		if(gradeSalary  < 0)
			gradeSalary = 0;
		else
			this.gradeSalary = gradeSalary;
	}


	public Contract(String id, double allowance, String name, boolean sex, Date dob, Address add, double gradeSalary) {
		super(id, allowance, name, sex, dob, add);
		this.gradeSalary = gradeSalary;
	}
	public Contract() {
		super();
	}
	@Override
	public void input()
	{
		Scanner kb = new Scanner(System.in);
		super.input();
		System.out.println("Enter grade salary: ");
		this.setGradeSalary(kb.nextDouble());
	}
	@Override
	public void output()
	{
		super.output();
		System.out.println("Grade salary: " + gradeSalary);
	}
	@Override
	public double computeSalary()
	{
		return gradeSalary + allowance;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contract c = new Contract();
		c.input();
		c.output();
	}

}
