package pigLatinLab;

public class Word {

	private String word;
	private String vowels = "aeiou";
	
	//constructers
	public Word(){
		this.word = "word";
	}
	
	public Word(String word){
		this.word = word.toLowerCase();
	}
	
	//returns the index of the first vowel in the word
	
	private int vowelIndex(){
		for(int i = 0; i < this.word.length(); i++){
			char letter = this.word.charAt(i);
			for(int j = 0; j <= 4; j++){
				char vowel = this.vowels.charAt(j);
				if(letter == vowel){
					return i;
				}
			}
		} 
		return 0;
	}
	
	//Piglatinifys the selected word
	public String pigLatinify2(){
		if(vowelIndex() == 0){
			return(this.word += "yay");
		} else {
			String wordPart = this.word.substring(vowelIndex());
			return(wordPart + this.word.substring(0, vowelIndex()) + "ay");
		}
	}

}
