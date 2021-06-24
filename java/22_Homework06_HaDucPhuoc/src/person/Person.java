package person;

import java.util.Scanner;

import address.Address;
import date.Date;

public class Person {
	protected String name;
	protected boolean sex;
	protected Date dob = new Date();
	protected Address add = new Address();
	
	public Person() {
	}

	public Person(String name, boolean sex, Date dob, Address add) {
		this.name = name;
		this.sex = sex;
		this.dob = dob;
		this.add = add;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
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
		/*Scanner kb = new Scanner(System.in);
		System.out.println("Enter name: ");
		this.setName(kb.nextLine());
		System.out.println("Enter sex(true(man)/false(woman)): ");
		this.setSex(kb.nextBoolean());
		kb.nextLine();*/
		dob.input();
		//add.input();
	}
	public void output()
	{
		/*System.out.println("Name: " + name);
		System.out.print("Sex: ");
		if(sex == false)
			System.out.println("Female");
		else
			System.out.println("male");*/
		dob.output();
		//add.output();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.input();
		p.output();
	}

	

}
