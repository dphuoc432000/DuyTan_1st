package people;

import java.util.Scanner;

public class Professor extends People {
	private int rank;
	private String department, officeNumber, officePhoneNumber;
	public String getOfficeNumber() {
		return officeNumber;
	}
	public void setOfficeNumber(String officeNumber) {
		this.officeNumber = officeNumber;
	}
	public String getOfficePhoneNumber() {
		return officePhoneNumber;
	}
	public void setOfficePhoneNumber(String officePhoneNumber) {
		this.officePhoneNumber = officePhoneNumber;
	}
	public Professor() {
		super();
	}
	public Professor(String code, String firstName, String lastName, String homePhoneNumber, String cellPhoneNumber,
			Date dob, int rank, String department,String officeNumber, String officePhoneNumber) {
		super(code, firstName, lastName, homePhoneNumber, cellPhoneNumber, dob);
		this.setRank(rank);
		this.setDepartment(department);
		this.setOfficeNumber(officeNumber);
		this.setOfficePhoneNumber(officePhoneNumber);
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		if(rank < 0)
			rank = 0;
		else
			this.rank = rank;
	}
	@Override
	public void input()
	{
		Scanner kb = new Scanner(System.in);
		super.input();
		System.out.println("Enter Rank: (0.None & 1.Assistant Professor & 2.Associate Professor & 3.Professor & 4.Assistant Teaching Professor & 5.Associate Teaching Professor & 6.Teaching Professor");
		this.setRank(kb.nextInt());
		kb.nextLine();
		System.out.println("Enter Department: ");
		this.setDepartment(kb.nextLine());
		System.out.println("Enter Office Number: ");
		this.setOfficeNumber(kb.nextLine());
		System.out.println("Enter Office Phone Number: ");
		this.setOfficePhoneNumber(kb.nextLine());
	}
	@Override
	public void output()
	{
		super.output();
		System.out.println("Rank: ");
		Rank();
		System.out.println();
		System.out.println("Department: " + this.department);
		System.out.println("Office Number: " + this.officeNumber);
		System.out.println("Office Phone Number: " + this.officePhoneNumber);
	}
	public void Rank(){
		if(this.rank == 0)
			System.out.println("None");
		if(this.rank == 1)
			System.out.println("Assistant Professor");
		if(this.rank == 2)
			System.out.println("Associate Professor");
		if(this.rank == 3)
			System.out.println("Professor");
		if(this.rank == 4)
			System.out.println("Assistant Teaching Professor");
		if(this.rank == 5)
			System.out.println("Associate Teaching Professor");
		if(this.rank == 6)
			System.out.println("Teaching Professor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
