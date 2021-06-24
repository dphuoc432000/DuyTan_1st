package linear;

public class Linear 
{
	private double b, c;
	public void setB(double b1)
	{
		b = b1;
	}
	public void setC(double c1)
	{
		c = c1;
	}
	public  Linear (){
		
	}
	public  Linear (double b0,  double c0){
		b0 = b;
		
	}
	public double solve()
	{
		return -c / b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linear n1= new Linear();
		n1.b = 3;
		n1.c =3;
		System.out.println(n1.solve());
		Linear n2= new Linear();
		n2.b = 4;
		n2.c = 2;
		System.out.println(n2.solve());
	}

}
