/*
Class that runs StringManipulation program
which implements the countChars method 3 times
and the longestWord method 3 times which are
apart of the StringManipulations.java class

Author: Teddy Juntunen
*/

public class StringManipulationsDriver {

	// main method
	public static void main(String[] args) {

		StringManipulations stringManipulations = new StringManipulations();

		// countChars method 3 times
		System.out.println("Letter appears " + stringManipulations.countChars("USF is a great school", 'g') + " time(s) in the given string.");
		System.out.println("Letter appears " + stringManipulations.countChars("I love computer science", 'c') + " time(s) in the given string.");
		System.out.println("Letter appears " + stringManipulations.countChars("I am seeing a movie this weekend", 'e') + " time(s) in the given string.");
		System.out.println();
		// longestWord method 3 times
		System.out.println("Longest word is " + stringManipulations.longestWord("USF is a great school") + " letter(s) long.");
		System.out.println("Longest word is " + stringManipulations.longestWord("I love computer science") + " letter(s) long.");
		System.out.println("Longest word is " + stringManipulations.longestWord("I am seeing a movie this weekend") + " letter(s) long.");


	}

}