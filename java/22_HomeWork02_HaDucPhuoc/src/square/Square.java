package square;

public class Square {
	private double a, b , c;
	public void setA(double a0)
	{
		a = a0;
	}
	public void setC(double c0)
	{
		c = c0;
	}
	public void setB(double b0)
	{
		b = b0;
	}
	public double denta()
	{
		return b * b - 4 * a * c;
	}
	public void solve()
	{
		if (a == 0)
		{
			System.out.println("phuong trinh bac 1. ");
			if( b == 0)
			{
				System.out.println("Phuong trinh vo nghiem. ");
			}
			else
			{
				System.out.println("phuong trinh co 1 nghiem: ");
				System.out.println(-c / b);
			}
		}
		else
		{
			System.out.println("Phuong trinh bac 2. ");
			if(denta() < 0)
			{
				System.out.println("Phuong trinh vo nghiem. ");
			}
			else if(denta() == 0)
				
			{
				System.out.println("Phuong trinh co nghiem kep: ");
				System.out.println(-b / (2 * a));
			}
			else if(denta() > 0) 
			{
				System.out.println("Phuong trinh co 2 nghiem: ");
				System.out.println((- b + Math.sqrt(denta())) / (2 * a));
				System.out.println((- b - Math.sqrt(denta())) / (2 * a));
			}
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Square s1 = new Square();
		s1.a = 2;
		s1.b = 9;
		s1.c = 4;
		s1.solve();
		Square n2 = new Square();
		n2.a = 1;
		n2.b = 2;
		n2.c = 3;
		n2.solve();
	}

}
   