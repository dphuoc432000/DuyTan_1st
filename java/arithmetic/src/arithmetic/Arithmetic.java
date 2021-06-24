package arithmetic;

import java.util.Scanner;

public class Arithmetic {
	public static void divide(){
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the value of b: ");
		try{
			int a = 50;
			try{
				int b = kb.nextInt();
				a = a/ b;
				System.out.println(a + b);
			}catch(Exception e){
				System.out.println("đã bắt lỗi." + e);
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		divide();
	}

}
