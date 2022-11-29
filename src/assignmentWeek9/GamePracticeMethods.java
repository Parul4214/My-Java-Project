package assignmentWeek9;

import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Random;//random method
import java.util.Scanner;//for user iput

public class GamePracticeMethods {
	String Random_name_selector() {
		int total_names = 0;
		// used exception handling so that no error occur during program
		try {
			File myObj = new File("NameList.txt"); // procedure to read the file
			Scanner myReader = new Scanner(myObj);
			// to read total num of names in the file and store in the counter
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				total_names++;
				 System.out.println(data);
			}
			System.out.println("Total Number of Names: " + total_names);
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace(); // to read the language of code, to read file properly
		}

		// create instance of Random class
		Random randomNum = new Random();
		int random_num = 1 + randomNum.nextInt(total_names); // 1 is minimum value and max can be total num of names in
																// the list and return random num picked
		System.out.println("Random Number Picked: " + random_num);
		// System.out.println();

		
		///////////////////// reading file again so that if random num is picked , it
		///////////////////// will read that corresponding
		///////////////////// name/////////////////////////////
		String random_name = "Null";
		try {
			File myObj = new File("NameList.txt");
			Scanner myReader = new Scanner(myObj);
			while (random_num >= 1) {
				random_name = myReader.nextLine(); // read the file , skip all the lines and go to specific line to pick
													// the random name and store
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
		int correct_guess_counter = 0; // variable used further to check is full name has been guessed or not

		char[] nameToCharArray = random_name.toCharArray();// string to array conversion of given name

		char[] tempArray = new char[name_length]; // new array declared to store the correct guess word temporary
		// iterate over array
		for (int i = 0; i < name_length; i++) {
			tempArray[i] = '_'; // array value initialized with _
		}

		Scanner sc = new Scanner(System.in);
		char repeat_word_check = '*'; // variable used further to check if user is pressing same word again,
										// initialezed with non-alphbet

		
			//while loop will break after 5 wrong attempts or after full correct guess
		while (attempt_counter >= 0) {
			isGuessCorrect = false;

			System.out.println("You have guessed (" + (5 - attempt_counter) + ") wrong letters");
			System.out.println("\nGuess a letter.");
			
			//read 1 char at a time and store in guess word var
			char guess_word = sc.next().charAt(0);
			
			if (guess_word == repeat_word_check)
				System.out.println("You have already guessed this letter");

			else {
				for (int i = 0; i < name_length; i++) {
					// System.out.println( Character.toLowerCase(tempArray[i]));
					if (guess_word == Character.toLowerCase(nameToCharArray[i])
							|| guess_word == Character.toUpperCase(nameToCharArray[i])) {

						if (guess_word == tempArray[i]) {
							System.out.println("Letter already exist");
							// break;
						} else {
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
					if (attempt_counter == 0) {
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
