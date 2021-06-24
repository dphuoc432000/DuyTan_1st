package test;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		if(kb.hasNextInt()== true)
		{
			int a = kb.nextInt();
			System.out.println(a);
		}
		else
			kb.next();
		if(kb.hasNextDouble() == true)
		{
			double b = kb.nextDouble();
			System.out.println(b);
		}
		else 
			kb.next();
		if(kb.hasNextBoolean() == true)
		{
			boolean bb = kb.nextBoolean();
			System.out.println(bb);
		}
		else
			kb.next();
		if(kb.hasNext() == true)
		{
			String word = kb.next();
		System.out.println(word);
		}else
			kb.next();
		kb.next();
		String sentence = kb.nextLine();
		System.out.println(sentence);
		
	}
}
