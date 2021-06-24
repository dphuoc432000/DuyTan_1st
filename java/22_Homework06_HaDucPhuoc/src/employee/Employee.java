package employee;

import java.util.Scanner;

import address.Address;
import date.Date;
import person.Person;

public abstract class Employee extends Person {
	protected String id;
	protected double allowance;
	
	public Employee() {
		super();
	}
	public Employee(String id, double allowance, String name, boolean sex, Date dob, Address add) {
		super(name, sex, dob, add);
		this.setId(id);
		this.setAllowance(allowance);
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	public void input()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter ID: ");
		this.setId(kb.nextLine());
		System.out.println("Enter Allowance");
		this.setAllowance(kb.nextDouble());
		super.input();
	}
	public void output()
	{
		System.out.println("ID: " + this.id);
		System.out.println("Allowance: " + this.allowance);
		super.output();
	}
	//phuong thuc truu tuong la phuong thuc khong co body va co dau cham phay (;)
	public abstract double computeSalary();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee(); // KHONG NEW CHA, MA NEW CON(THONG QUA LOP CON)
		e.input();
		e.output();
	}

	

}
