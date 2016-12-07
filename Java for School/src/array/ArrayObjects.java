package array;

import java.util.Arrays;
import gambling.Die;

public class ArrayObjects {

	public static void main(String args[]) {
		int[] nums = {1,2,3,4,5,6,7,8,9,10};
		int i = find(nums, 2);
		System.out.println(i);
	}

	//loops through array, returning index of first instance of "target". If "target" is not in array, returns -1
	private static int find(int[] nums, int target) {
		int retVal = -1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				retVal = i;
				break;
			}
		}
		return retVal;
	}
	
	private static int[] halfArray(int[] nums){
			int[]
	}

}
