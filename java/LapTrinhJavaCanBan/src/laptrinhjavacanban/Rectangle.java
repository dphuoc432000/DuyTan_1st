package laptrinhjavacanban;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Rectangle {
	private double length, height;
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		if(length < 0) {
			System.out.println("is not negative.");
			this.length = 0;
		}
		else
			this.length = length;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		if(height < 0) {
			System.out.println("is not negative.");
			this.height = 0;
		}
		else
			this.height = height;
	}
	public Rectangle(double length, double height) {
		this.length = length;
		this.height = height;
	}
	public Rectangle() {
	}
	public double Area() {
		return this.length * this.height;
	}
	public double Circumference() {
		return (this.height + this.length) *2;
	}
	public void input() throws FileNotFoundException {
		Scanner kb = new Scanner(new File("Rectangle.txt"));
		PrintStream pr = new PrintStream("S_CV.txt");
		while(kb.hasNext()) {
			this.setLength(kb.nextDouble());
			this.setHeight(kb.nextDouble());	
		}
		pr.println("Length: " + this.getLength());
		pr.println("Height: " + this.getHeight());
		pr.println("Area: " +  Area());
		pr.println("Circumference: " + Circumference());
	}
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Rectangle r =new Rectangle();
		r.input();
	}

}
