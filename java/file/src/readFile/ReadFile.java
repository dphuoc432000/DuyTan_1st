package readFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile{
	public static void read()throws FileNotFoundException{
		Scanner kb = new Scanner(new File("file.txt"));
		while(kb.hasNext()== true)
			System.out.println(kb.next());
	}
	public static void main(String[] args) throws FileNotFoundException{
		ReadFile.read();
	}
}
