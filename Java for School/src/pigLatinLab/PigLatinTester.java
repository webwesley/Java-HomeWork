package pigLatinLab;

public class PigLatinTester {

	public static void main(String args[]){
		Sentence sentence = new Sentence("Wesley is the best");
		System.out.println(sentence.getLatinSentence());
	}
}
