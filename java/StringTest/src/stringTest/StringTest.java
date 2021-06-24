package stringTest;

import java.util.Scanner;

public class StringTest {
	private String s;
	
	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}
	public StringTest() {
	}
	public StringTest(String s) {
		this.s = s;
	}

	public void countSpace()
	{
		int count = 0;
		for(int i = 0; i < s.length(); i ++){
			if(s.charAt(i) == ' ')
				count ++;
		}
		System.out.println(count);
	}

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		Scanner kb =  new Scanner(System.in);
		String s = kb.nextLine();
		StringTest st = new StringTest();
		st.countSpace();
	}

}
