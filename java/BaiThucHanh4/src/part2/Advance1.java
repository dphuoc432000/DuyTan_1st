package part2;

public class Advance1 {
	public int USCLN(int a, int b){
        while(a!= b){
        	if(a>b) a= a-b; 
               else b= b-a;
       }
       return (a);
	}
	
	public int BSCNN(int a,int b){
	    return (a*b)/USCLN(a,b);
	}
	
	public int sum(long number) {
		//Tính tổng các phần tử của number
		//VD number = 5765, sum = 5+7+6+5 = 23
		int sum = 0;
		long index;
		while (number != 0) {
			index = number % 10;
			sum += index;
			number /= 10;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Advance1 a = new Advance1();
		System.out.println(a.USCLN(1000,0));
	}

}
