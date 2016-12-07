package scrableLab;

public class Scrable {
	private String word;
	private String alphabet = "aeiunrsltgdmbcopfvywhkxjqz";
	int[] points = {1,1,1,1,1,1,1,1,1,2,2,3,3,3,3,3,4,4,4,4,4,5,8,8,10,10};
	
	public Scrable(String word){
		this.word = word.toLowerCase();
	}
	
	public int score(){
		int retVal = 0;
		for(int i = 0; i < word.length(); i++){
			char letter = this.word.charAt(i);
			int index = alphabet.indexOf(letter);
			retVal += points[index];
		}		
		return retVal;
	}
}
