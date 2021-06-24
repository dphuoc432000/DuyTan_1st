package teacher;

import java.util.Scanner;

public class ArrayOfTeacher {
	Teacher [] a = new Teacher[100];
	private int n;

	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public ArrayOfTeacher(int n) {
		this.n = n;
	}
	public ArrayOfTeacher() {
	}
	public void input()
	{
		Scanner kb = new Scanner(System.in);
		for(int i = 0; i < n; i ++)
		{
			Teacher t;
			int choose = kb.nextInt();
			if(choose == 1)
				t = new PastTimeTeacher();
			else
				t = new FullTime();
			t.input();
			a[i] = t;
		}
	}
	public void output()
	{
		for(int i = 0; i < n; i++)
			a[i].output();
	}
	public void add()
	{
		double s = 0;
		for(int i = 0; i < n; i ++)
			s = s + a[i].payment();
		System.out.println(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayOfTeacher arr = new ArrayOfTeacher(2);
		arr.input();
		arr.output();
		arr.add();
	}

}
