package javaStrings;

public class StringHW {
	public static void main(String args[]){
		System.out.println(lastThreeChar("Wesley"));
		System.out.println(sumChar("book", 'o'));
	}

	private static String lastThreeChar(String word){
		if(word.length() < 3){
			return word;
		}else {
		return(word.substring(word.length() - 3));
		}
	}
	
	private static int sumChar(String word, char letter){
		int sum = 0;
		for(int i = 0; i < word.length(); i++){
			if(word.charAt(i) == letter){
				sum += i;
			}
		}
		return sum;
	}
}
