package exercise2;

import java.util.Scanner;

public class Exercise2 {
	private String s;
	

	public String getS() {
		return s;
	}


	public void setS(String ss) {
		s = ss;
	}
	

	public Exercise2(String s) {
		setS(s);
	}
	public boolean isValid()
	{
		Scanner kb = new Scanner(s);
		//true: con chuoi, false: het chuoi
		while(kb.hasNextLine() == true)
			if(kb.hasNextDouble() == false)
				return false;
			else 
				   	kb.next();
		return true;
	}
	public void sum() 
	{
		double sum = 0;
		Scanner kb2 = new Scanner(s);
		if(isValid() == false)
				System.out.println("N/A");
		else
		{
			System.out.println("is Valid.");
			while(kb2.hasNextLine() == true) 
				sum = sum + Math.pow(kb2.nextDouble(), 2);
			System.out.println(sum);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb3 = new Scanner(System.in);
		String s = kb3.nextLine();
		Exercise2 ex = new Exercise2(s);
		ex.sum();
	}

}
