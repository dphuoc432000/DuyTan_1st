package n6;

public class N6 {
	private int n;
	public void setN(int n0)
	{
		if( n0 < 0)
		{
			System.out.println("can not negative");
		}
		else
			n = n0;
	}
	public int getN()
	{
		return n;
	}
	public N6(int n0)
	{
		setN(n0);
		
		for(int i = 1; i <= n0; i++)
		{
			for(int j = 1; j <= n0; j++)
				{
					System.out.print(i);
				}
			System.out.println();
		}
		
	}
	
	
	public static void main(String[] args)
	{
		N6 n1 = new N6(5);
		
	}

}
