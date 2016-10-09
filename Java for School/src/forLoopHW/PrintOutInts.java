package forLoopHW;

import java.util.Scanner;

public class PrintOutInts {
	private static int n;
	private static int value = 0;
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a value from 1 to 9:");
		n = in.nextInt();
		in.close();
		
		for(int i = 1; i <= n; i++){
			value += i;
			if(i<n){
				System.out.print(i + "+");
			} else {
				System.out.print(i + "=" + value);
			}
		}
	}
}
