package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Text {
	private double lenght, width;
	
	public double getLenght() {
		return lenght;
	}

	public void setLenght(double lenght) {
		this.lenght = lenght;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	public Text(double lenght, double width) {
		this.lenght = lenght;
		this.width = width;
	}
	public Text() {
		// TODO Auto-generated constructor stub
	}

	public void input() throws FileNotFoundException {
		Scanner kb = new Scanner(new File("Rectangle.txt"));
		PrintStream p = new PrintStream(new File("S.txt"));
		while(kb.hasNext()) {
			String name = kb.next();
			this.setLenght(kb.nextDouble());
			this.setWidth(kb.nextDouble());
			p.println(name + " " + this.lenght * this.width);
		}
		
	}
	public static void main(String[] args) throws FileNotFoundException {
		Text  t = new Text();
		t.input();
	}

}
