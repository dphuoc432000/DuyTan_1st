package peoples;

public class employee extends Person {
	
	protected double salary;
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return name + birthday + salary;
	}

}
