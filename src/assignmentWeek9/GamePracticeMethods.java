package assignmentWeek9;

import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Random;
import java.util.Scanner;

public class GamePracticeMethods {
	String Random_name_selector() {
		int counter = 0;
		try {
			File myObj = new File("NameList.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				counter++;
			//	System.out.println(data);
			}
			System.out.println("Total Number of Names: " + counter);
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

		// what is our range?
		int max = counter;
		// create instance of Random class
		Random randomNum = new Random();
		int random_num = 1 + randomNum.nextInt(max);
		System.out.println("Random Number Picked: " + random_num);
	//	System.out.println();

		//////////////////////////////////////////////////
		String random_name = "Null";
		try {
			File myObj = new File("NameList.txt");
			Scanner myReader = new Scanner(myObj);
			while (random_num >= 1) {
				random_name = myReader.nextLine();
				random_num--;
				// System.out.println("random num value: " +random_num + " corrs name: "
				// +random_name );
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

		return random_name;
	}

	///////////////////////////////////////////////////////////////////////////////
	void guess_making(String random_name) {
		int name_length = random_name.length();
		boolean isGuessCorrect = false;
		int attempt_counter = 5;
		int correct_guess_counter = 0;

		char[] nameToCharArray = random_name.toCharArray();

		char[] tempArray = new char[name_length];

		for (int i = 0; i < name_length; i++) {
			tempArray[i] = '_';
			// System.out.print(tempArray[i] + " ");
		}

		Scanner sc = new Scanner(System.in);
		// System.out.println();
		char repeat_word_check = '*';
		while (attempt_counter >= 0) {
			
			
			isGuessCorrect = false;

			System.out.println("You have guessed (" + (5 - attempt_counter) + ") wrong letters");
			System.out.println("\nGuess a letter.");
			char guess_word = sc.next().charAt(0);

			if (guess_word == repeat_word_check)
				System.out.println("You have already guessed this letter");

			else {
				for (int i = 0; i < name_length; i++) {
					// System.out.println( Character.toLowerCase(tempArray[i]));
					if (guess_word == Character.toLowerCase(nameToCharArray[i])
							|| guess_word == Character.toUpperCase(nameToCharArray[i])) {
						
						if(guess_word==tempArray[i]) {
							System.out.println("letter already exist");
							//break;
						}
						else {
							tempArray[i] = guess_word;
						correct_guess_counter++;
						}
						isGuessCorrect = true;
						// System.out.println("Word matched" );

					}
				}
				if (correct_guess_counter == name_length) {
					System.out.println("************************************************"
							+ "\nCongratulations, you have guessed the whole name" + "\n****************** "
							+ random_name + " *********************");
					break;
				}
				if (isGuessCorrect) {
					System.out.println("Good job, Keep Playing");
					repeat_word_check = guess_word;
				}

				else if (!isGuessCorrect) {
					repeat_word_check = guess_word;
					attempt_counter--;
					if(attempt_counter==0)
					{
						System.out.println("You Have Guessed 5 wrong letters"); 
						System.out.println("No More attempts remainng");
						break;
					}
					System.out.println("OOPS!! Wrong Guess, Try Again");
				}

				for (int i = 0; i < name_length; i++) {
					System.out.print(tempArray[i] + " ");
				}
				System.out.println();
				

				sc.reset();
			}
		}

	}

}
