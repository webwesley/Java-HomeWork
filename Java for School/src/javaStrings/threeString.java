package javaStrings;

public class threeString {
	
	public static void main(String args[]){
		System.out.println(threeStrings("Wesley"));
	}
	
	private static String threeStrings(String str){
		return(str.substring(0, 3));
	}
}
