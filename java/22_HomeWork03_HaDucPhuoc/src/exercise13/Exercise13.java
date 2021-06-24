package exercise13;

public class Exercise13 {
	private int a , b, c;
	public void setA(int aa)
	{
		if(aa < 0 )
			System.out.println("can not negative");
		else 
			a = aa;
	}
	public void setB(int bb)
	{
		if(bb < 0 )
			System.out.println("can not negative");
		else 
			b = bb;
	}
	public void setC(int cc)
	{
		if(cc < 0 )
			System.out.println("can not negative");
		else 
			c = cc;
	}
	public int getA()
	{
		return a;
	}
	public int getB()
	{
		return b;
	}
	public int getC()
	{
		return c;
	}
	public Exercise13()
	{
		a = 1;
		b = 1;
		c = 1;
	}
	public Exercise13(int a, int b, int c)
	{
		setA(a);
		setB(b);
		setC(c);
	}
	public int hCF(int a, int b, int c)
	{
		if(a == 0|| b == 0 || c == 0)
		{
			if(a == b && a != c)
				return a + c;
			else if(a == c && a != b)
				return a + b;
			else if(b == c && b != a)
				return b + a;
			else if(a != b && a != c)
			{
				if( a == 0)
					if(b > c)
						b = b -c ;
					else
						c = c - b;
				else if(b == 0)
					if(a > c)
						a = a -c;
					else
						c = c - a;
				else if(c == 0)
					if(a > b)
						a = a - b;
					else
						b = b -a;
			}
		}
		else
		while (a != b && a != c)
		{
			if(a > b && a > c)
				a = a - b -c;
			if(b > a && b > c)
				b = b - a -c;
			if(c > a && c > b)
				c = c - b -a;
		}
		return a;
	}
	public int lCM(int a, int b, int c)
	{
		return (a * b * c)/hCF(a, b, c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise13 ex = new Exercise13();
		System.out.println(ex.hCF(145, 0, 75));
	}

}
