package exercise3;

import java.util.Scanner;

public class Exercise3 {
	private String s;

	public String getS() {
		return s;
	}
	public void setS(String ss) {
		s = ss;
	}
	public Exercise3(String s) {
		
		setS(s);
	}
	public void sum()
	{
		Scanner kb = new Scanner(s);
		int sint = 0;
		double sdouble = 0;
		String ss = "";
		while(kb.hasNextLine())
		{
			if(kb.hasNextInt()){
				sint += kb.nextInt();
			}
			else if(kb.hasNextDouble())
				sdouble += kb.nextDouble();
			else
				ss += kb.next();
		}
			System.out.println(sint);
			System.out.println(sdouble);
			System.out.println(ss);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		String s = kb.nextLine();
		Exercise3 ex = new Exercise3(s);
		ex.sum();
	}

}
