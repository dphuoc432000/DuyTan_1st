package person;

import peoples.employee;
import peoples.Person;

public class PeopleTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person e = new employee();
		System.out.println(e.toString());
		Manager m = new Manager();
		System.out.println(m.toString() + m.getAsistance());
		Person [] a = new Person[2];
		for(int i = 0; i < 3; i++)
		{
			if(i == 0){
				Person e1 = new employee();
				System.out.println("e1" + e1.toString());
			}
			if(i == 1){
				Person m1 = new Manager();
				System.out.println("m1" + m1.toString());
			}
		}
	}

}
