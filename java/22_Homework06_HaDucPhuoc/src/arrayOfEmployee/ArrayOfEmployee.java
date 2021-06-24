package arrayOfEmployee;

import java.util.Scanner;

import Contract.Contract;
import employee.Employee;
import regular.Regular;

public class ArrayOfEmployee {
	Employee []  a = new Employee[100];
	private int n;
	

	public ArrayOfEmployee(int n) {
		this.n = n;
	}
	public ArrayOfEmployee() {
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		if(n < 0)
			n = 1;
		else
			this.n = n;
	}
	public void input()
	{
		Scanner kb = new Scanner(System.in);
		for(int i = 0; i < n; i ++)
		{
			Employee x;
			System.out.println("Enter Employee " + i);
			System.out.println("Enter 1-regular/ 2-contract: ");
			int choose = kb.nextInt();
			if(choose == 1){
				x = new Regular();
				x.input();
				a[i] = x;
			}
			else if(choose == 2){
				x = new Contract();
				x.input();
				a[i] = x;
			}
		}
	}
	public void output()
	{
		System.out.println("---------------------------------------");
		for(int i = 0 ; i < n; i++)
		{
			System.out.println("-----Employee " + i);
			if(a[i]instanceof Regular)
			a[i].output();
		}
	}
	public void displayFebuaray()
	{
		System.out.println("---------------------------------------");
		for(int i = 0 ; i < n ; i ++)
			if(a[i].getDob().getM() == 2)
				a[i].output();
	}
	public void remove(int index)
	{
		for(int i = index; i < n; i ++)
			a[index] = a[i + 1];
		n--;
	}
	public void removeDaNang()
	{
		System.out.println("---------------------------------------");
		for(int i = 0; i < n; i++)
			if(a[i].getAdd().getCity().equals("Da Nang")||a[i].getAdd().getCity().equals("da nang"))
				remove(i);
		output();
	}
	public void ageSort()
	{

		System.out.println("---------------------------------------");
		for(int i = 0; i < n - 1; i++)
			for(int j = n -1; j > i ; j --)
				if(2019 - a[j].getDob().getY() < 2019 - a[j - 1].getDob().getY() )
				{
					Employee temp = a[j - 1];
					a[j - 1] = a [j];
					a[j] = temp;
				}
		output();
	}
	public double salaryMax()
	{
		double max = a[0].computeSalary();// tinh da hinh
		for(int i = 0; i < n; i++)
			if(max < a[i].computeSalary())// tinh da hinh
				max=a[i].computeSalary();// tinh da hinh
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayOfEmployee arr = new ArrayOfEmployee(3);
		arr.input();
		arr.output();
		/*arr.displayFebuaray();
		arr.removeDaNang();*/
		arr.ageSort();
	}

}
