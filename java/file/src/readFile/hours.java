package readFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class hours {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner kb=new Scanner(new File("hours.txt"));
		while(kb.hasNextLine()==true) {
			String line=kb.nextLine();
			Scanner kb1=new Scanner(line);
			int id=kb1.nextInt();
			String name=kb1.next();
			double sum=0.0;
			int count=0;
			while(kb1.hasNextDouble()) {
				sum=sum+kb1.nextDouble();
				count++;
			}
			double average=sum/count;
			System.out.println(name+"(ID#"+id+") worked "+sum+" hours ("+average+" hours/day)");
			kb.nextLine();
		}
	}
		
}
