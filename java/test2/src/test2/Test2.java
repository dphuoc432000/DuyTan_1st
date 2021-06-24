package test2;

import java.util.Scanner;

public class Test2 {
	private String s;
	
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
	
	public Test2(String s) {
		this.s = s;
	}
	public void input() {
		Scanner kb = new Scanner(s);
		String ss = "", sss = "" , ssss = "";
		while(kb.hasNextLine()) {
			if(kb.hasNextInt()) {
				ss += kb.nextInt() + " ";
			}
			else if(kb.hasNextDouble()) {
				sss += kb.nextDouble() + " ";
			}
			else if(kb.hasNext()) {
				ssss += kb.next() + " ";
			}
		}
		System.out.println("So nguyen: " + ss );
		System.out.println("So thap phan: " +  sss);
		System.out.println("Chu: " + ssss);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb3 = new Scanner(System.in);
		String s = kb3.nextLine();
		Test2 ex = new Test2(s);
		ex.input();
	}

}
