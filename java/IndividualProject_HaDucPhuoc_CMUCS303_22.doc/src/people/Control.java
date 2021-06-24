package people;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Control{
	People []a = new People[100];
	private int n;
	public Control(){
	}
	public Control(int n){
		this.setN(n);
	}
	public int getN(){
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public void input(){
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter n: ");
		this.setN(kb.nextInt());
		for(int i = 0 ; i < n; i ++){
			People x;
			System.out.println("\nEnter choose: (1.Professor & 2.Student)");
			int choose = kb.nextInt();
			if(choose == 1){
				System.out.println("\n\tProfessor: ");
				x = new Professor();
				x.input();
				a[i] = x;
			}
			else{
				System.out.println("\n\tStudent: ");
				x = new Student();
				x.input();
				a[i] = x;
			}
		}
	}
	public void output(){
		for(int i = 0; i < n; i++)
			a[i].output();
	}
	public void add()
	{
		Scanner kb = new Scanner(System.in);
		int i = n;
		int choose = kb.nextInt();
		People x;
		if(choose == 1){
			x = new Professor();
			x.input();
			a[i] = x;
		}
		else{
			x = new Student();
			x.input();
			a[i] = x;
		}
		n++;
		output();
			
	}
	public void find()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("\n\tENTER ID NEED TO FIND: \n");
		String id = kb.nextLine();
		for(int i = 0; i < n; i++){
			if(a[i].getCode().equals(id))
				a[i].output();
			else
				System.out.println("No people.");
		}
	}
	public void count()
	{
		System.out.println("\n\tCOUNT PROFESSOR: \n");
		int count = 0;
		for(int i = 0; i < n; i++){
			if(a[i] instanceof Professor)
				count++;
			else
				System.out.println("Not Professer.");
		}
		System.out.print("Count Professer: " + count + "\n");
	}
	public void remove(int k)
	{
		for(int i = k ; i < n ; i ++)
			a[i] = a[i + 1];
		n--;
	}
	public void delete()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("\n\tDELETE ID: \n");
		String id = kb.nextLine();
		for(int i = 0 ; i < n ; i++){
			if(a[i].getCode().equals(id)){
				remove(i);
				i--;
			}
			else
				System.out.println("Not ID.");
		}
		output();
	}
	public void sortFirstName()
	{
		for(int i = 1; i < n; i++)
			for (int j = 1; j < n; j++) 
				if (a[j - 1].getFirstName().compareTo(a[j].getFirstName())> 0 ){
					People t = a[j -1];
					a[j -1] = a[ j];
					a[j] = t;
				}
	}
	public void sortLastName(){
		for(int i = 1; i < n ;i ++)
			for (int j = 1; j < n; j++) 
				if (a[j -1].getLastName().compareTo(a[j].getLastName())> 0 ) {
					People t = a[j -1];
					a[j -1] = a[ j];
					a[j] = t;
				}
	}
	public void sort(){
		System.out.println("\tSORT: \n");
		sortLastName();
		sortFirstName();
		output();
	}
	public void button(){
		Scanner kb = new Scanner(System.in);
		System.out.println("\n------------------------");
		System.out.println("-Enter NUMBER 1, to add in personal information: ");
		System.out.println("-Enter NUMBER 2, to search for a person by a spcecified code: ");
		System.out.println("-Enter NUMBER 3, to count the number of processer and display: ");
		System.out.println("-Enter NUMBER 4, to delete the information profile of a person by a specified code: ");
		System.out.println("-Enter NUMBER 5, to sort the list is sorted based on first names and last names:  ");
		System.out.println("\n\nPlease ENTER NUMBER: ");
		int choose = 1;
		while(choose > 0){
			choose = kb.nextInt();
			if(choose > 0 && choose  < 6){
				switch(choose){
					case 1:{
						add();
						break;
					}
					case 2:{
						find();
						break;
					}
					case 3:{
						count();
						break;
					}
					case 4:{
						delete();
						break;
					}
					case 5:{
						sort();
						break;
					}
				}
				System.out.println("\n-----------------------");
				System.out.println("-Enter NUMBER 1, to add in personal information: ");
				System.out.println("-Enter NUMBER 2, to search for a person by a spcecified code: ");
				System.out.println("-Enter NUMBER 3, to count the number of processer and display: ");
				System.out.println("-Enter NUMBER 4, to delete the information profile of a person by a specified code: ");
				System.out.println("-Enter NUMBER 5, to sort the list is sorted based on first names and last names:  ");
				System.out.println("\n\nPlease ENTER CHOOSE: ");
			}
			else{
				System.out.println("----------------------");
				System.out.println("Choose only 1 to 5. ENTER AGAIN CHOOSE: ");
				System.out.println("-Enter NUMBER 1, to add in personal information: ");
				System.out.println("-Enter NUMBER 2, to search for a person by a spcecified code: ");
				System.out.println("-Enter NUMBER 3, to count the number of processer and display: ");
				System.out.println("-Enter NUMBER 4, to delete the information profile of a person by a specified code: ");
				System.out.println("-Enter NUMBER 5, to sort the list is sorted based on first names and last names:  ");
				System.out.println("\n\nPlease ENTER CHOOSE: ");
			}
		}
	}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Control c = new Control();
	c.input();
	c.button();
}

}
