package learningReadWriteFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GuessGame {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("You are guessing the name from the following list: ");

		GuessGameMethods guess_game = new GuessGameMethods();

		String guess_name = guess_game.random_name_selector();
		System.out.println(guess_name);
	}

}
