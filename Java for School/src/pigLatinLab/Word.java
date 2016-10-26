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
	
	private int isVowel(){
		for(int i = 0; i < this.word.length(); i++){
			for(int j = 0; j <= 4; j++){
				if(this.word.charAt(i) == this.vowels.charAt(j)){
					return j;
				}
			}
		} 
		return 0;
	}
	
	//Piglatinifys the selected word
	public String pigLatinify2(){
		if(isVowel() == 0){
			return(this.word += "yay");
		} else {
			String wordPart = this.word.substring(isVowel());
			return(wordPart + this.word.substring(0, isVowel()) + "ay");
		}
	}

}
