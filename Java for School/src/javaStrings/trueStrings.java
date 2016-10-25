package javaStrings;

public class trueStrings {
	
	public static void main(String args[]){
		
		System.out.println(stringTrue("Word", "o" ));
	}

	public static boolean stringTrue(String word, String x){
		if(word.indexOf(x) == -1){
			return(false);
		} else {
			return(true);
		}
	}
}
