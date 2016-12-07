package array;
import java.util.Arrays;

public class BasicArray {

	public static void main(String args[]){
		int[] num1 = new int[11];
		int[] num2 = new int[11];
		for(int i = 0; i < num1.length; i++){
			num1[i] = 6;
			num2[i] = i;
		}
		
		int[] sum = new int[num1.length];
		for (int i = 0; i < num1.length; ++i) {
		    sum[i] = num1[i] + num2[i];
		}
		
		System.out.println(Arrays.toString(sum));
		System.out.println(Arrays.toString(num1));
	}
}