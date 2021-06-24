package teacher;

import java.util.Scanner;

public class Address {
	private int number;
	private String street, district, city;
	public int getNumber() {
		return number;
	}
	public void setNumber(int n) {
		if(n < 0)
			System.out.println("is not negative.");
		else
			this.number = n;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String st) {
		this.street = st;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String dt) {
		this.district = dt;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String cty) {
		this.city = cty;
	}
	public Address(int number, String street, String district, String city) {
		this.number = number;
		this.street = street;
		this.district = district;
		this.city = city;
	}
	public Address() 
	{
	}
	public void input()
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter number: ");
		setNumber(kb.nextInt());
		kb.nextLine();
		System.out.print("Enter street:" );
		setStreet(kb.nextLine());
		System.out.print("Enter district: ");
		setDistrict(kb.nextLine());
		System.out.print("Enter city: ");
		setCity(kb.nextLine());
	}
	public void output()
	{
		System.out.println("-Number: " + number);
		System.out.println("-Street: " + street);
		System.out.println("-District: " + district);
		System.out.println("-City: " + city);
	}
	public static void main(String[] args)
	{
		Address a1 = new Address();
		a1.input();
		a1.output();
	}
}
