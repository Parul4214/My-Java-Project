package learningReadWriteFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class GuessGameMethods {
	/////////////// Read from file and pick random name////////////////////////

	String random_name_selector() throws FileNotFoundException {

		int total_names = 0;

		File file = new File("C:\\Users\\romyk\\OneDrive\\Desktop\\Software testing\\Assignments\\filename.txt");
		try (Scanner scn = new Scanner(file)) {
			while (scn.hasNextLine()) {
				String name_list = scn.nextLine();
				total_names++;
				System.out.println(name_list);
			}

		}
		System.out.println("Total number of names are: " + total_names);

		Random random = new Random();
		int random_number_picked = random.nextInt(total_names) + 1;

		System.out.println("Random number picked: " + random_number_picked);

		String random_name_picked = "";
		try {

			Scanner scn = new Scanner(
					new File("C:\\Users\\romyk\\OneDrive\\Desktop\\Software testing\\Assignments\\filename.txt"));

			while (random_number_picked >= 1) {

				random_name_picked = scn.nextLine();
				random_number_picked--;
			}
		} catch (Exception e) {

		}
		return random_name_picked;
	}

	////////////////////// guess name game starts//////////////////////////////

	void guess_name(String name, String masked_name) {
		int max_attempt_counter=5;
		int name_length=name.length();
		System.out.println(name);
		masked_name.replaceAll("\\w", "_ ");
		
		

	}

}