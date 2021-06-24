package exception;

import java.util.Scanner;

public class trycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int a[] = new int[5];
		double s = 0;  	
		for(int i = 0; i < 5; i ++){
			a[i] = kb.nextInt();
		}
		try {
			for(int i = 0; i < 4; i++)
				if(a[i] ==0)
					s = a[i - 1] / a[i];
		} catch (ArithmeticException e) {
			System.out.println("task1 is completed");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("task 2 completed");
		} catch (Exception e) {
			System.out.println("common task completed");
		}

		System.out.println("rest of the code...");
	}

}

