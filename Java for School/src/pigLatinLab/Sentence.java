package pigLatinLab;

public class Sentence {

	private String sentence;
	private String latinSentence = "";
	
	
	//Default constructor
	public Sentence(){
		this.sentence = "This will probably never be used";
	}
	
	//Overloaded constructor
	public Sentence(String sentence){
		this.sentence = sentence.toLowerCase();
		
	}
	
	private void pigLatinify(){
		int startIndex = 0;
		for(int i = 0; i < this.sentence.length(); i++){
			String word = this.sentence.substring(startIndex, this.sentence.indexOf(" "));
			startIndex = this.sentence.indexOf(" ") + 1;
			Word wordToPigLatin = new Word(word);
			latinSentence += (wordToPigLatin.pigLatinify2() + " ");
		}
	}

	public String getLatinSentence() {
		pigLatinify();
		return latinSentence;
	}

		
	
}
