package pigLatinLab;

public class Word {

	private String word;
	private final String vowels = "aeiou";

	// Constructors
	public Word() {
		this.word = "word";
	}

	public Word(String word) {
		this.word = word.toLowerCase();
	}

	// returns the index of the first vowel in the word

	private int vowelIndex() {
		int retValue = 0;
		for (int i = 0; i < this.word.length(); i++) {
			if (isVowel(this.word.charAt(i))) {
				retValue = i;
				break;
			}
		}
		return retValue;
	}

	// Piglatinifys the selected word
	public String pigLatinify2() {
		if (vowelIndex() == 0) {
			return (this.word += "yay");
		} else {
			String wordPart = this.word.substring(vowelIndex());
			return (wordPart + this.word.substring(0, vowelIndex()) + "ay");
		}
	}

	private boolean isVowel(char letter) {
		return this.vowels.contains(String.valueOf(letter));

	}

}
