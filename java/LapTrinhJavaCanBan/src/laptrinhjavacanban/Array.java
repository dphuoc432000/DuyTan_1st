package laptrinhjavacanban;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;


public class Array {
	int [] a = new int[100];
	private int n;
	public int getN() {
		return n;
	}
	public void setN(int n) {
		if(n < 0)
			System.out.println("Is not negative.");
		else
			this.n = n;
	}
	public Array(int n) {
		this.n = n;
	}
	public Array() {
	}
	public void input() throws FileNotFoundException {
		Scanner kb = new Scanner(new File("Array.txt"));
		while(kb.hasNext()) {
			n = kb.nextInt();
			for(int i = 0; i < n; i ++)
				a[i] = kb.nextInt();
		}
		
	}
	public void output() throws FileNotFoundException {
		PrintStream pr = new PrintStream(new File("resultArray.txt"));
		for(int i = 0 ; i < n; i++)
			pr.println("Value [" + i  + "]:" + a[i]);
	}
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Array a = new Array();
		a.input();
		a.output();
	}

}
