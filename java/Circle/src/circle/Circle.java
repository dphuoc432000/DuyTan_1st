package circle;

public class Circle {
	private double r;
	public void setR(double r1)
	{
		if(r1 < 0)
		{
			System.out.println("R1 can not negative");
		}
		else
			r = r1;
	}
	public double getR()
	{
		return r;
	}
	public double calArea()
	{
		return r * r * 3.14;
	}
	public double calCirumference()
	{
		return r * 2 * 3.14;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
		c1.r = 2;
		System.out.println(c1.calArea());
		System.out.println(c1.calCirumference());
		Circle c2 = new Circle();
		c2.r = 3;
		System.out.println(c2.calArea());
		System.out.println(c2.calCirumference());
	}

}
