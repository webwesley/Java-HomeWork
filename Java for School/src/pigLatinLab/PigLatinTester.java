package pigLatinLab;

import java.util.Scanner;

public class PigLatinTester {

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Please input a Sentence you want turned into Pig Latin: ");
		Sentence sentence = new Sentence(input.nextLine());
		System.out.println("The sentence \"" + sentence.getSentence() + 
				"\" is \"" +sentence.getPigLatinSentence().trim() + 
				"\" in Pig Latin" );
		input.close();
	}
}
