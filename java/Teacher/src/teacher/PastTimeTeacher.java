package teacher;

public class PastTimeTeacher extends Teacher {
	
	public PastTimeTeacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PastTimeTeacher(String name, int yearOfExperience, double bonus, Date dob, Address add) {
		super(name, yearOfExperience, bonus, dob, add);
	}
	@Override
	public double payment()
	{
		return super.basicSalary() + bonus;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PastTimeTeacher p = new PastTimeTeacher();
		p.input();
		p.output();
		System.out.println(p.payment());
	}

}
