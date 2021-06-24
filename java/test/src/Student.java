
public class Student {
	static int rollno = 0;
	String name;
	static String college = "DTU";
	static void change(){
		college = "BBDIT";
	}
	Student(String n)
	{
		rollno ++;
		name = n;
	}
	void dislay(){
		System.out.println(rollno + " " + name + " " + college);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student.change();
		Student s1 = new Student("Trang");
		s1.dislay();
		Student s2 = new Student("Duong");
		
		s2.dislay();
	}

}
