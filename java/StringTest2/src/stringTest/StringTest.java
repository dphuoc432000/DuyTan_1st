package stringTest;

import java.util.Scanner;

public class StringTest {
	private String ss;
	
	public String getS() {
		return ss;
	}

	public void setS(String ss) {
		this.ss = ss;
	}
	public StringTest() {
	}
	public StringTest(String s) {
		this.ss = s;
	}

	public void countSpace() {
		
		
		int count = 0;
		char x;
		for(int i = 0; i < ss.length(); i++){
			x = ss.charAt(i);
			if(x == ' ')
				count ++;
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb =  new Scanner(System.in);
		String ss = kb.nextLine();
		StringTest st = new StringTest(ss);
		
		st.countSpace();
	}

}
