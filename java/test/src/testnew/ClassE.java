package testnew;
import Test.ClassA;
public class ClassE {
	// can not access default private protected
	// members
	public void display5(){
		ClassA a = new ClassA();
		System.out.println(a.x);// error sua lai: (System.out.println(a.getX());
		System.out.println(a.pvt);// error sua lai: (System.out.println(a.getPvt());
		System.out.println(a.pro);// error sua lai: (System.out.println(a.getPro());
		System.out.println(a.pb);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
