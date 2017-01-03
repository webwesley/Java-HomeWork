package bigInt;

public class addInts {

	private final static int N = 30;

	// Calculates the sum of two "large integers" a and b,

	// represented as arrays of digits, and returns their sum

	// as an array of N digits.

	// Precondition: the sum fits into N digits.

	private static int[] add(int[] a, int[] b) {
		int[] retVal = new int[N];
		long haha = toLong(a);
		long shortcut = toLong(b);
		long sum = haha + shortcut;
		return(toArray(sum));
	}

	private static long toLong(int[] tmp) {
		long shortcut = 0;
		for (int i = 0; i < N; i++) {
			shortcut += tmp[i] * (Math.pow(10, N - i));
		}
		return shortcut;
	}

	private static int[] toArray(long sum) {
		String tmp = Long.toString(sum);
		int[] retVal = new int[N];
		for (int i = 0; i < N; i++){
		retVal[i] = Integer.parseInt(tmp);
		}
		
}
	
	
	
	