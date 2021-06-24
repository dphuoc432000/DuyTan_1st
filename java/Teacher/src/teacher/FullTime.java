package teacher;

import java.util.Scanner;

public class FullTime extends Teacher {
	private double allowance;
	

	public FullTime() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FullTime(String name, int yearOfExperience, double bonus, Date dob, Address add, double allowance) {
		super(name, yearOfExperience, bonus, dob, add);
		this.allowance = allowance;
	}
	public double getAllowance() {
		return allowance;
	}
	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	@Override
	public void input()
	{
		Scanner kb = new Scanner(System.in);
		super.input();
		System.out.println("Enter Allowance: ");
		this.setAllowance(kb.nextDouble());
	}
	@Override
	public void output()
	{
		super.output();
		System.out.println("Allowance: " + allowance);
	}
	@Override
	public double payment()
	{
		return super.basicSalary() + allowance + bonus;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t = new FullTime();
		t.input();
		t.output();
	}

}
