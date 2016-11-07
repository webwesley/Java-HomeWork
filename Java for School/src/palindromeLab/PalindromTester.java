package palindromeLab;

import java.util.Scanner;

public class PalindromTester {

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Please input a word or sentence that you are unable to determin if it is a palindrome: ");
		String word = input.nextLine();
		Palindrome test = new Palindrome(word);
		System.out.println("Is \"" + word + "\"" + " a palindrome: " + test.isPalindrome());
		input.close();
	}
}
