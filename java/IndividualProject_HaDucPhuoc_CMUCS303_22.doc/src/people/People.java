package people;

import java.util.Scanner;

public class People {
	protected String code, firstName, lastName, homePhoneNumber, cellPhoneNumber, dateString;
	protected Date dob = new Date();

	public People(String code, String firstName, String lastName, String homePhoneNumber, String cellPhoneNumber,
			Date dob) {
		this.code = code;
		this.firstName = firstName;
		this.lastName = lastName;
		this.homePhoneNumber = homePhoneNumber;
		this.cellPhoneNumber = cellPhoneNumber;
		this.dob = dob;
	}
	public People() {
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getHomePhoneNumber() {
		return homePhoneNumber;
	}

	public void setHomePhoneNumber(String homePhoneNumber) {
		this.homePhoneNumber = homePhoneNumber;
	}

	public String getCellPhoneNumber() {
		return cellPhoneNumber;
	}

	public void setCellPhoneNumber(String cellPhoneNumber) {
		this.cellPhoneNumber = cellPhoneNumber;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	public void input()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter ID: ");
		this.setCode(kb.nextLine());
		System.out.println("Enter First Name: ");
		this.setFirstName(kb.nextLine());
		System.out.println("Enter Last Name: ");
		this.setLastName(kb.nextLine());
		System.out.println("Enter Date Of Birth: ");
		dob.input();
		System.out.println("Enter Home Phone Number: ");
		this.setHomePhoneNumber(kb.nextLine());
		System.out.println("Enter Cell Phone Number: ");
		this.setCellPhoneNumber(kb.nextLine());
	}
	public void output(){
		System.out.println("-ID: " + this.code);
		System.out.println("-First Name: " + this.firstName);
		System.out.println("-Last Name: "+ this.lastName);
		dateString = this.getDob().getY() + "-" +this.getDob().getM() + "-" + this.getDob().getD();
		System.out.print("-Date Of Birth: " + dateString);
		System.out.println();
		System.out.println("-Home Phone Number: " + this.homePhoneNumber);
		System.out.println("-Cell Phone Number: " + this.cellPhoneNumber);
	}
	public static void main(String[] args) {
		People p = new People();
		p.input();
		p.output();
	}

}
