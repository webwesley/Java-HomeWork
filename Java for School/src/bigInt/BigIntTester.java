package bigInt;

import java.util.Arrays;

public class BigIntTester {

	public static void main(String args[]){
		addInts add = new addInts();
		int[] a = {1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0};
		int[] b = {0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9};
		int[] sum = add.add(a, b);
		System.out.println(Arrays.toString(sum));
	}
}
