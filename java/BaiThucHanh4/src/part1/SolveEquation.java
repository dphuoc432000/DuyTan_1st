package part1;

public class SolveEquation {
	
	public String linearEquation(int number1, int number2) {
		if (number1 == 0)
			if (number2 == 0)
				return "Multi roots";
			else
				return "No root";
		else
			return "One root";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SolveEquation s = new SolveEquation();
		System.out.println(s.linearEquation(3, 4));
	}

}
