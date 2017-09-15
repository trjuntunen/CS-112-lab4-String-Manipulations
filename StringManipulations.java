/*
Class that has 2 methods, countChars which
counts the amount of times the given character
appears in the given string, and a method longestWord
which returns the length of the longest word in the 
given string.

Author: Teddy Juntunen
*/

import java.util.ArrayList;

public class StringManipulations {

	// method which counts chars in given string
	public int countChars(String original, char c) {

		int charCount = 0;

		// iterates through string and counts char
		for (int i = 0; i < original.length(); i++) {
			if (original.charAt(i) == c) {
				charCount++;
			}
		}

		if (charCount == 0) {
			System.out.print("String had none of the letter: " + c);
			return -1;
		}

		return charCount;
	}

	/* method which counts the longest word in given
	string */
	public int longestWord(String original) {
		int letterCount = 0;
		int max = 0;
		for(int i = 0; i < original.length(); i++) {
			if(Character.isWhitespace(original.charAt(i))) {
				letterCount = 0;
			} else {
				letterCount++;
			}
			if(letterCount > max) {
				max = letterCount;
			}

		}

		return max;
	}

}