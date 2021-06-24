package arrayOfShape;

import java.util.Scanner;

import cylinder.Circle;
import cylinder.Cylinder;
import rectangle.Rectangle;
import shape.Shape;
import square.Square;

public class ArrayOfShape {
	Shape [] a = new Shape[100];
	private int n;
	
	public int getN() {
		return n;
	}
	public void setN(int n) {
		if(n < 0)
			n = 1;
		else
			this.n = n;
	}
	public ArrayOfShape() {
	}
	public ArrayOfShape(int n) {
		this.n = n;
	}
	public void input()
	{
		Scanner kb = new Scanner(System.in);
		for(int i = 0; i < n; i++)
		{
			System.out.println("Eenter " + i + ": ");
			//Shape s = new Shape();//ben shape co abstract
			Shape s;
			System.out.println("Enter 1(Rectangle) - 2(Square) - 3(Circle) - 4(Cyclinder): ");
			int choose = kb.nextInt();
			if(choose == 1)
				s = new Rectangle();
			else if(choose == 2)
				s = new Square();
			else if(choose == 3)
				s = new Circle();
			else
				s = new Cylinder();
			s.input();
			a[i] = s;
		}
	}
	public void output()
	{
		for(int i = 0; i < n; i++)
			a[i].output();
	}
	public void maxArea(){
		double max = a[0].area();
		for(int i = 1 ; i < n; i ++)
			if(max < a[i].area())
				max = a[i].area();
		System.out.println(max);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayOfShape arr = new ArrayOfShape(4);
		arr.input();
		//arr.output();
		arr.maxArea();
	}

}
