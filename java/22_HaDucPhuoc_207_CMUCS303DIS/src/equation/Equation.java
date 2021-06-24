package equation;

public class Equation {
	private double a, b , c;
	public void setA(int aa)
	{
		a = aa;
	}
	public void setB(int bb)
	{
		b = bb;
	}
	public void setC(int cc)
	{
		c = cc;
	}
	public void solve()
	{
		if(a == 0)
		{
			if(b == 0)
			{
				System.out.println("No Roots");
			}
			System.out.println(-c / b);
		}
		else if(a != 0)
		{
			double denta = b * b - 4 * a * c;
			if(denta < 0)
				System.out.println("No Roots");
			else if(denta == 0)
				System.out.println(- b / (2 * a));
			else if(denta > 0)
			{
				System.out.println((- b + Math.sqrt(denta))/ (2* a));
				System.out.println((- b - Math.sqrt(denta))/ (2* a));
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Equation e1 = new Equation();
		e1.a = 1; 
		e1.b = 2;
		e1.c = 1;
		e1.solve();
		Equation e2 = new Equation();
		e2.a = 1; 
		e2.b = 2;
		e2.c = 3;
		e2.solve();
		Equation e3 = new Equation();
		e3.a = 1; 
		e3.b = 3;
		e3.c = 2;
		e3.solve();
		
		
	}

}
