package scrableLab;

import java.util.Scanner;

public class ScrableTester {

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Pleas input a word:");
		String word = input.nextLine();
		input.close();
		Scrable test = new Scrable(word);
		System.out.println(test.score());
	}
}
