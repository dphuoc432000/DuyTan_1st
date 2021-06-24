package exercise4;

import java.util.Scanner;

public class Exercise4 {
	private String s;
	public String getS() {
		return s;
	}
	public void setS(String ss) {
		s = ss;
	}
	public Exercise4(String s)
	{
		setS(s);
	}
	public void exercise4_1()
	{
		Scanner s1 = new Scanner (s);
		int dem= 0;
		for(int i = 0; i < s.length(); i++)
			if(s.charAt(i)!= ' ')
				dem++;
		System.out.println(dem);
	}
	public void exercise4_2()
	{
		Scanner s2 = new Scanner(System.in);
		String ss = "";
		for(int i = s.length() - 1; i >= 0; i--)
		{
			ss += s.charAt(i);
		}
		System.out.println(ss);
	}
	public void exercise4_3()
	{
		Scanner s3 = new Scanner(System.in);
		if(s.length() > 3)
			System.out.println(s.charAt(2));
		else
			System.out.println("N/A");
	}
	public void exercise4_4()
	{
		Scanner s4 =new Scanner(System.in);
		char ss;
		int check = 0;
		ss = s4.nextLine().charAt(0);
		for(int i = 1; i < s.length();i++)
			if(s.charAt(i)==ss)
				check = s.lastIndexOf(ss);
		System.out.println("Substring found at position " + check + " in the string");
	}
	public void exercise4_5()
	{
		Scanner s5 = new Scanner(System.in);
		int number = 0;
		int vowel = 0;
		int consonant = 0;
		char c = 0;
		for(int i = 0; i < s.length(); i ++)
		{
			if(c >= 48 && c <=57)
				if(s.charAt(i)==c)
				number ++;
			if(s.charAt(i) == 'u' ||s.charAt(i) == 'e' ||s.charAt(i) == 'a' ||s.charAt(i) == 'o' ||s.charAt(i) == 'i')
				vowel++;
			if(s.charAt(i) == 'b' ||s.charAt(i) == 'c' ||s.charAt(i) == 'd' ||s.charAt(i) == 'f' ||s.charAt(i) == 'g' ||s.charAt(i) == 'h' ||s.charAt(i) == 'j' ||s.charAt(i) == 'k' ||s.charAt(i) == 'l' ||s.charAt(i) == 'm' ||s.charAt(i) == 'n' ||s.charAt(i) == 'p' ||s.charAt(i) == 'q' ||s.charAt(i) == 'r' ||s.charAt(i) == 's' ||s.charAt(i) == 't' ||s.charAt(i) == 'v' ||s.charAt(i) == 'w' ||s.charAt(i) == 'x' ||s.charAt(i) == 'y' ||s.charAt(i) == 'z')
				consonant ++;
		}
		System.out.println("number characters: " + number);
		System.out.println("vowel characters: " + vowel);
		System.out.println("consonat character: " + consonant);
	}
	public void exercise4_6()
	{
		Scanner s6 = new Scanner(System.in);
		int result = 0;
		if(s.charAt(0)!= ' ')
			result = 1;
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) == ' ' && s.charAt(i+1) != ' ')
				result++;
		}
		System.out.println(result);
	}
	public void exercise4_7()
	{
		Scanner s7 =  new Scanner(System.in);
		System.out.println(s.toLowerCase());
	}
	public void exercise4_8()
	{
		Scanner s8 = new Scanner(System.in);
		System.out.println(s.toUpperCase());
	}
	public void exercise4_9()
	{
		Scanner s9 = new Scanner(System.in);
		String ss = "";
		for(int i = 1; i < s.length(); i++)
			if( s.charAt(i) != s.charAt(i - 1))
				ss += s.charAt(i-1);
		System.out.println(ss);
	}
	public void exercise4_10()
	{
		Scanner s10 = new Scanner(System.in);
		String ss = "";
		s = s.toLowerCase().trim();
		String[] a = s.split(" ");
		for (String s : a)
		{
			if( !s.equals("") && !s.equals(null))
				ss += String.valueOf(s.charAt(0)).toUpperCase() + s.substring(1) + " ";
		}
		System.out.println(ss.substring(0, ss.length()-1));
		/*while(s10.hasNextLine())
		{
			String sss = s10.next();
			ss += sss.trim().split(" ") + sss.substring(0) + " ";
		}
		System.out.println(ss);*/
	}
	public void exercise4_11()
	{
		Scanner s11 = new Scanner(System.in);
		int count = 0;
		char c;
		c = s11.next().charAt(0);
		for(int i = 0; i < s.length(); i ++)
		{
			if(s.charAt(i) == c)
				count++;
		}
		System.out.println(count);
	}
	public void exercise4_12()
	{
		Scanner s12= new Scanner(System.in);
		int n;
		n = s12.nextInt();
		System.out.println(s.substring(n));
	}
	public void exercise4_13()
	{
		Scanner s13 = new Scanner(System.in);
		String ss = "";
		s = s.toLowerCase();
		String[] a = s.split(" ");
		for (String s : a)
		{
			if( !s.equals("") && !s.equals(null))
				ss += String.valueOf(s.charAt(0)).toUpperCase() + s.substring(1) + " ";
		}
		System.out.println(ss);
		/*String result = "";
		  while(s13.hasNextLine())
		{
			String ss = s13.next();
			ss = ss.toLowerCase();
			result = (ss.charAt(0) + "").toUpperCase() + ss.substring(1) + " ";
				
		}
		System.out.println(ss);*/
	}
	public void exercise4_14()
	{
		Scanner s14 = new Scanner(System.in);
		String s1= "";
		String s2 = "";
		for(int i= s.length() - 1; i > 0; i --)
		{
			if(s.charAt(i) == ' '){
				s1 = s14.next();
				break;
			}
		}
		for(int j = s.length() - s1.length() - 1; j > 0; j--)
			s2 = s14.next() + " " + s2;
		System.out.println(s1 + s2);
	}
	public void exercise4_15()
	{
		Scanner s15 = new Scanner(System.in);
		String ss= "";
		while(s15.hasNextLine()== true)
		{
			if(s15.hasNext())
			{
				String sss = s15.next();
				ss += sss + " ";
			}
			else
				s15.next();
			System.out.println(ss);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		String s = kb.nextLine();
		Exercise4 e4 = new Exercise4(s);
		System.out.println("-------------");
		//e4.exercise4_1();
		/*System.out.println("-------------");
		e4.exercise4_2();
		System.out.println("-------------");
		e4.exercise4_3();
		System.out.println("-------------");
		e4.exercise4_4();
		System.out.println("-------------");
		e4.exercise4_5();
		System.out.println("-------------");
		e4.exercise4_6();
		System.out.println("-------------");
		e4.exercise4_7();
		System.out.println("-------------");
		e4.exercise4_8();
		System.out.println("-------------");
		e4.exercise4_9();
		System.out.println("-------------");
		e4.exercise4_10();
		System.out.println("-------------");
		e4.exercise4_11();
		System.out.println("-------------");
		e4.exercise4_12();
		System.out.println("-------------");
		e4.exercise4_13();
		System.out.println("-------------");
		e4.exercise4_14();
		System.out.println("-------------");*/
		e4.exercise4_15();
	}

}
