package thietKeDoHoa;

import java.util.Scanner;

public class Test {
	private static int n;
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public Test(int n) {
		Scanner kb = new Scanner(System.in);
		this.setN(kb.nextInt());
	}
	public Test() {
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Nhap n: ");
		Test t = new Test(n) ;
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
