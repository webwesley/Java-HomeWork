package palindromeLab;

import java.util.Scanner;

public class PalindromTester {

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Please input a word or sentence that you are unable to determin if it is a palindrome: ");
		String word = input.next();
		Palindrome test = new Palindrome(word);
		System.out.print("Are you compent enough in the english langauge to determin if \n"
				+ "\"" + word +  "\"" + " is a Palindrome? [y/n] ");
		String tmp = input.next();
		if(tmp.equals("y")){
			System.out.println("Well clearly not because you're using a program to do so. \n"
				+ "Anyways, the fact that \"" + word + "\" is a Palindrome is " + test.isPalindrome());
		} else {
			System.out.println("Classic");
		}
		
		input.close();
	}
}
