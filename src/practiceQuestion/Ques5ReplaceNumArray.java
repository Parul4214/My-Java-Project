package practiceQuestion;

import java.util.Scanner;

public class Ques5ReplaceNumArray {

	
	public static void main(String[] args) {
		// Initializing an array of numbers
		int[] numbersArray = { 1, 2, 3, 4, 5 };
		// Initializing an array of letters
		char[] lettersArray = { 'a', 'b', 'c', 'd', 'e' };

		// Replace each number in the array with a letter
		for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = lettersArray[i];
        }

		// Print out the new array
		for (int i = 0; i < numbersArray.length; i++) {
			System.out.print((char)numbersArray[i] + " ");
		}
	}
}
//	