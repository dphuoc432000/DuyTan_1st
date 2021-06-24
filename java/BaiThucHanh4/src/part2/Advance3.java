package part2;

public class Advance3 {
	/**
	 * Tính số fibonacci thứ n
	 * @param n: chỉ số của số fibonacci tính từ 0 vd: F0 = 0, F1 = 1, F2 = 1, F3 =2
	 * @return số fibonacci thứ n
	 */
	public static int fibonacci(int n) {
		if (n < 0) {
			return -1;
		} else if (n == 0 || n == 1) {
			return n;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
	/**
	 * Kiểm tra số nguyên tố
	 * 
	 * @param n: số nguyên dương
	 * @return: true là số nguyên tố : false không phải là số nguyên tố
	 */
	public static boolean isPrimeNumber(int n) {
		// so nguyen n < 2 khong phai la so nguyen to
		if (n < 2) {
			return false;
		}
		// check so nguyen to khi n >= 2
		int squareRoot = (int) Math.sqrt(n);
		for (int i = 2; i <= squareRoot; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
