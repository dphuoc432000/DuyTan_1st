package exercise12;

public class Exercise12 {
	private int a, b;
	public void setA(int aa)
	{
		if(aa < 0)
		{
			System.out.println("can not negative");
		}
		else
			a =aa;
	}
	public void setB(int bb)
	{
		if(bb < 0)
			System.out.println("can not negative");
		else
			b = bb;
	}
	public Exercise12()
	{
		a= 1;
		b = 1;
	}
	public Exercise12(int a, int b)
	{
		setA(a);
		setB(b);
	}
	public int hCF()//Highest Common Factor 
	{
		if(a == 0 || b == 0)
			return a + b;
		else
			while(a !=  b)
			{
				if(a > b)
					a = a - b;
				else
					b = b - a;
			}
		return a;
	}
	public int lCM()//Least Common Multiple 
	{
		return (a*b)/hCF();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise12 ex = new Exercise12();
		System.out.println(ex.hCF());
		System.out.println(ex.lCM());
		/*System.out.println(ex.hCF());
		System.out.println(ex.lCM());*/
		Exercise12 ex2 = new Exercise12(10, 5);
		System.out.println(ex2.hCF());
		System.out.println(ex2.lCM());

	}

}
