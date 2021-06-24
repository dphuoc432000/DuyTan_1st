package question2;

import java.util.Scanner;

public class Question2 {
	private String s;
	

	public String getS() {
		return s;
	}


	public void setS(String ss) {
		this.s = ss;
	}
	

	public Question2(String s) {
		this.setS(s);
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
	public void input() {
		Scanner kb = new Scanner(System.in);
		String s = "", ss = "" , sss = "";
		while(kb.hasNextLine()) {
			if(kb.hasNextInt()) {
				s += " " + kb.nextInt();
				System.out.println("So nguyen: " + s );
			}/*
			else if(kb.hasNext()) {
				ss = ss + kb.hasNextDouble();
				System.out.println("So thap phan: " +  ss);
			}
			else if(kb.hasNext()) {
				sss = s + kb.next();
				System.out.println("Chu: " + sss);
			}*/
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb3 = new Scanner(System.in);
		String s = kb3.nextLine();
		Question2 ex = new Question2(s);
		
		ex.input();
	}

}
