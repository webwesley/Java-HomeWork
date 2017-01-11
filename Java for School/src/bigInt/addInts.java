package bigInt;

public class addInts {

	private final static int N = 30;

	// Calculates the sum of two "large integers" a and b,

	// represented as arrays of digits, and returns their sum

	// as an array of N digits.

	// Precondition: the sum fits into N digits.

	public int[] add(int[] a, int[] b) {
		int[] sum = new int[N];
		for (int i = N - 1; i >= 0; i--) {
			int tmp = a[i] + b[i];
			int tens = (tmp) / 10;
			int ones = (tmp) % 10;
			if (i > 0) {
				sum[i] += ones;
				sum[i - 1] += tens;
				if (sum[i] == 10) {
					sum[i] = 0;
					sum[i - 1] += 1;
				}
			} else {
				sum[i] += ones;
			}
		}
		return sum;
	}

}
