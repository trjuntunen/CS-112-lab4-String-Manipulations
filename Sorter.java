/*
Main class of Sorter program, which
reads in words from a textfile and
prints them alphabetically A-Z, and then
Z-A.

Author: Teddy Juntunen
*/

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;

public class Sorter {

	// main method
	public static void main(String[] args) {

		// initializing the arraylist
		ArrayList<String> wordList = new ArrayList<String>();

		// indicates the textfile in which to read
		File file = new File("words.txt");

		try(Scanner input = new Scanner(file)) {

			while(input.hasNext()) {
				String word = input.nextLine();
				wordList.add(word);
				Collections.sort(wordList);
			}

		} catch(FileNotFoundException fnf) {
			System.out.println(fnf.getMessage());
		}

		// Print words A-Z 
		System.out.println("Alphabetical A-Z:");
		for(String words: wordList) {
			System.out.println(words);
		}

		System.out.println();

		// Print words Z-A by iterating backwards
		System.out.println("Alphabetical Z-A:");
		for(int i = wordList.size() - 1; i >= 0; i--) {
			System.out.println(wordList.get(i));
		}

	}

}