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
		boolean retValue;
		int split = split();
		String firstHalf = this.word.substring(0, split);
		String secondHalf = this.word.substring(split);
		int firstValue = wordValue(firstHalf);
		
		
		
		return retValue;
	}
	
	//gets the middle index of the word
	private int split(){
		return(this.word.length() / 2) ;
	}
	
	//will add up all the ascii values of each char in the word and return it
	public int (String str){
		int retValue;
		for(int i = 0; i < str.length(); i++){
			char tmp = str.charAt(i);
			retValue += ((int)tmp);
		}
	}
	
	
}
