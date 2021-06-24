package teacher;

import java.util.Scanner;

public abstract class Teacher {
	protected String name;
	protected int yearOfExperience;
	protected Date dob = new Date();
	protected Address add = new Address();
	protected double bonus;
	
	public Teacher(String name, int yearOfExperience, double bonus, Date dob, Address add) {
		this.name = name;
		this.yearOfExperience = yearOfExperience;
		this.dob = dob;
		this.add = add;
		this.bonus = bonus;
	}
	public Teacher() {
	}
	public double getBonus()
	{
		return bonus;
	}
	public void setBouns(double bonus)
	{
		this.bonus = bonus;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearOfExprence() {
		return yearOfExperience;
	}

	public void setYearOfExperience(int yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}
	public void input()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter name: ");
		this.setName(kb.nextLine());
		System.out.println("Enter year of experience: ");
		this.setYearOfExperience(kb.nextInt());
		System.out.println("Enter Bonus:");
		this.setBouns(kb.nextDouble());
		System.out.println("Enter date of birth: ");
		kb.nextLine();
		dob.input();
		System.out.println("Enter address: ");
		add.input();
	}
	public void output()
	{
		System.out.println("\nName: " + name);
		System.out.println("\nYear of experience: " + yearOfExperience);
		System.out.println("\nBouns: " + bonus);
		System.out.println("\nDate: ");
		dob.output();
		System.out.println("\nAadress: ");
		add.output();
	}
	public abstract double payment();
	public double basicSalary()
	{
		double s = 1800000.0;
		if(yearOfExperience < 10)
			return yearOfExperience * s * 3.1;
		else if(yearOfExperience >= 10 && yearOfExperience < 20)
			return yearOfExperience * s * 3.5;
		else
			return yearOfExperience * s * 3.95;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t = new PastTimeTeacher();
		t.input();
		t.output();
		System.out.println(t.payment());
		Teacher t1 = new FullTime();
		t1.input();
		t1.output();
		System.out.println(t1.payment());
	}

}
