package people;

import java.util.Scanner;

public class Student extends People {
	private int standing;
	private String degreeProgram, anticipatedYear;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String code, String firstName, String lastName, String homePhoneNumber, String cellPhoneNumber,
			Date dob, int standing, String degreeProgram, String anticipatedYear) {
		super(code, firstName, lastName, homePhoneNumber, cellPhoneNumber, dob);
		this.setDegreeProgram(degreeProgram);
		this.setAnticipatedYear(anticipatedYear);
	}

	public String getDegreeProgram() {
		return degreeProgram;
	}

	public void setDegreeProgram(String degreeProgram) {
		this.degreeProgram = degreeProgram;
	}

	public String getAnticipatedYear() {
		return anticipatedYear;
	}

	public void setAnticipatedYear(String anticipatedYear) {
		this.anticipatedYear = anticipatedYear;
	}

	public int getStanding() {
		return standing;
	}

	public void setStanding(int standing) {
		this.standing = standing;
	}
	@Override
	public void input()
	{
		Scanner kb = new Scanner(System.in);
		super.input();
		System.out.println("Enter Degree Program: ");
		this.setDegreeProgram(kb.nextLine());
		System.out.println("Enter Standing: (0.None & 1.Freshman & 2.Sophomore & 3.Junior & 4.Senior & 5.Graduate & 6.Masters Postgraduate & 7.PhD Postgraduate)");
		this.setStanding(kb.nextInt());
		kb.nextLine();
		System.out.println("Enter Anticipated Year: ");
		this.setAnticipatedYear(kb.nextLine());
	}
	@Override
	public void output()
	{
		super.output();
		System.out.println("-Degree: " + this.degreeProgram);
		System.out.print("-Standing: ");
		Standing();
		System.out.println();
		System.out.println("Anticipated Year: " + this.anticipatedYear);
	}
	public void Standing()
	{
		if(standing == 0)
			System.out.println("None");
		if(standing == 1)
			System.out.println("Freshman");
		if(standing == 2)
			System.out.println("Sophomore");
		if(standing == 3)
			System.out.println("Junnior");
		if(standing == 4)
			System.out.println("Senior");
		if(standing == 5)
			System.out.println("Graduate");
		if(standing == 6)
			System.out.println("Masters Postgraduate");
		if(standing == 7)
			System.out.println("PhD Postgraduate");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
