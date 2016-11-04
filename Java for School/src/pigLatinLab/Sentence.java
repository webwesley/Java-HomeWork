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
	//will make the sentence piglatin
	private void pigLatinify(){
		while(this.sentence.indexOf(' ') != -1){
				pigLatinWord(this.sentence.indexOf(' '));
			}
			pigLatinWord(this.sentence.length());
		}
	
	// will separate the word in the sentence and make it piglatin
	private void pigLatinWord(int endIndex){
		String word = this.sentence.substring(0, endIndex);
		this.sentence = this.sentence.replaceFirst(word, "");
		this.sentence = this.sentence.trim();
		Word wordToPigLatin = new Word(word);
		latinSentence += (wordToPigLatin.pigLatinify2() + " ");
		
		
	}
	public String getSentence(){
		return this.sentence;
	}

	public String getPigLatinSentence() {
		pigLatinify();
		return latinSentence;
	}

		
	
}
