package date1;

public class Date1 {
	private int m, y;
	public void setM(int m0)
	{
		if(m0 < 0 || m0 > 12)
		{
			System.out.println("M0 is not negative");
		}
		else
			m = m0;
	}
	public void setY(int y0)
	{
		if(y0 < 1900 || y > 5000)
		{
			System.out.println("Y0 is not negative");
		}
		else
			y = y0;
	}
	public int dayOfMonth()
	{
		if(m == 4 || m == 5 || m == 9 || m ==11)
			return 30;
		else if(m == 2)
		{
			if( (y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
				return 29;
			return 28;
		}
	
		else
		{
			return 31;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date1 d1 = new Date1();
		d1.m = 2;
		d1.y = 2020;
		System.out.println(d1.dayOfMonth());
	}

}
