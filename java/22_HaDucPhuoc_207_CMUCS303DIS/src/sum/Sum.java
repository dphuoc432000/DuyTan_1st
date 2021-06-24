package sum;

public class Sum {
	private int n;
	public void setN(int nn)
	{
		if(n < 0)
			System.out.println("Can not negative");
		else
			n = nn;
	}
	public int getN()
	{
		return n;
	}
	public long result()
	{
		long s = 0;
		while(n > 0)
		{
			s = s + n % 10;
			n = n / 10;
		}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum s1 = new Sum();
		s1.n = 1234;
		System.out.println(s1.result());
		Sum s2 = new Sum();
		s2.n = 25347;
		System.out.println(s2.result());
		
	}

}
