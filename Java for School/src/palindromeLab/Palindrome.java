package palindromeLab;

public class Palindrome {
	private String word;

	//Default constructor 
	public Palindrome(){
		this.word = "Congragulations for using the default constructor for this class";
	}
	
	//overloaded constructor
	public Palindrome(String word){
		this.word = word;
	}
	//returns true or false depending if its a palindrome
	public boolean isPalindrome(){
		boolean retValue = true;
		int split = split();
		removeEverything();
		for(int i = 0; i < split; i++){
			if(this.word.charAt(i) != this.word.charAt((this.word.length() - 1) - i)){
				retValue = false;
				break;
			}
		 }
		return retValue;
	}
	
	//removes punctuation, spaces from word
	private void removeEverything(){
		this.word.replaceAll("[^a-zA-Z]", "");
	}
	//determins the middle index of the word
	private int split(){
		return(this.word.length() / 2);
	}
	

	
	
	
	
}
