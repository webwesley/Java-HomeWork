package forLoopHW;

import java.util.Scanner;

public class addOdds {
//this program returns the sum of all ints from 1 to n
	private static int n;
	private static int value = 1;
	
	public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	System.out.print("Enter a value:");
	n = in.nextInt();
	in.close();
	
	for(int i = 3; i<=n; i +=2){
		value += i;
	}
	System.out.print(value);	
	}
}
