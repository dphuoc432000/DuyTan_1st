package part1;

public class Calculator {
	public int add(int number1, int number2) {
		return number1 + number2;
	}
	public int sub(int number1, int number2) {
		return number1 - number2;
	}
	public int mul(int number1, int number2) {
		return number1 * number2;
	}
	public int div(int number1, int number2) {
		return number1 / number2;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		System.out.println(c.add(3, 4));
		System.out.println(c.sub(5, 2));
	}

}
