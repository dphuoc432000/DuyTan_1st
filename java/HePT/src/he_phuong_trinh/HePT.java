
package he_phuong_trinh;

public class HePT {
	public double a , b , c , d , e, f;
	public double dd()
	{
		return a * e - b * d;
	}
	public double dx()
	{
		return b * f - c * e;
	}
	public double dy()
	{
		return c * d - f * a;
	}
	public void solve()
	{	
		if(dd() == 0)
		{
			if(dx() == 0 && dy() == 0)
			{
				System.out.println("Vo so nghiem");
			}
			if(dx() != 0 || dy() != 0 )
			{
				System.out.println("Vo nghiem");
			}
				
		}
		if(dd() != 0)
		{
			if(dx() != 0 || dy() != 0)
			{
				System.out.println(" co cap nghiem");
				System.out.println(dx()/ dd());
				System.out.println(dy() / dd());
			}
		}
	}
	public static void main(String[] args){
		HePT n1 = new HePT();
		n1.a = 0;
		n1.b = 3;
		n1.c = 4;
		n1.d = 0;
		n1.e = 0;
		n1.f = 7;
		n1.solve();
	}
}
