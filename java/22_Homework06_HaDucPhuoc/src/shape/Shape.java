package shape;

import cylinder.Circle;
import cylinder.Cylinder;
import rectangle.Rectangle;
import square.Square;

public abstract class Shape {
	// duoc declare fields: private, protected, public, default, static, final
	// co cac constructor(ham khoi tao)
	public void body()
	{
		System.out.println("body");
	}
	public abstract void input();
	public abstract void output();
	public abstract double area();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Rectangle();
		s.input();
		System.out.println(s.area());
		Shape s1 = new Circle();
		s1.input();
		System.out.println(s1.area());
		Shape s2 = new Cylinder();
		s2.input();
		System.out.println(s2.area());
		Shape s3 = new Square();
		s3.input();
		System.out.println(s3.area());
		
	}

}
