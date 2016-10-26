package pigLatinLab;

public class Word {

	private String word;
	private String vowels = "aeiou";
	
	//constructers
	public Word(){
		this.word = "word";
	}
	
	public Word(String word){
		this.word = word;
	}
	
	private boolean isVowel(){
		char letter;
		for(int i = 0; i < this.word.length(); i++){
			letter = this.vowels.charAt(i);
			if(this.word.contains(letter);
	}
	
}
