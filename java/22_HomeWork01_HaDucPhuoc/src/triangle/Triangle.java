package triangle;

public class Triangle {
	private double a , b, c;
	public void setA(double a0)
	{
		if(a < 0)
			System.out.println("A0 can not negative");
		else
			a = a0;
	}
	public void setB(double b0)
	{
		if(b < 0)
			System.out.println("B0 can not negative");
		else
			b = b0;
	}
	public void setC(double c0)
	{
		if(c < 0)
			System.out.println("A0 can not negative");
		else
			c = c0;
	}
	public boolean triangle()
	{
		if(a + b < c || a + c < b || b + c <a)
			return false;
		return true;
	}
	public void calArea()
	{
		if(a >= b && a >= c)
			System.out.println(b * c / 2);
		if(b > a && b >= c)
			System.out.println(a * c / 2);
		if(c > b && c > a)
		{
			System.out.println(b * a / 2);
		}
	}
	public double calCirumference()
	{
		return a + b + c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t1 = new Triangle();
		t1.a = 3;
		t1.b = 4;
		t1.c = 1;
		if(t1.triangle() == true)
		{
			System.out.println("la tam giac.");
			t1.calArea();
			System.out.println(t1.calCirumference());
		}
		else 
			System.out.println("khong phai tam giac");
	}

}
