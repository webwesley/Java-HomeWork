package guessingGame;

import java.util.Random;

public class Guessing {
	int value;
	int guess;

	public Guessing() {
		Random tmp = new Random();
		value = tmp.nextInt(11);
		this.guess = 0;
	}

	public boolean play() {
		boolean retVal = true;
		if(value != guess){
			retVal = false;
		}
		return retVal;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getGuess() {
		return guess;
	}

	public void setGuess(int guess) {
		this.guess = guess;
	}
	

}
