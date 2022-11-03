package assignmentWeek9;

import java.util.Scanner;

public class GamePractice {
	public static void main(String[] args) {
		GamePracticeMethods ran_name_obj = new GamePracticeMethods();
		String random_name = ran_name_obj.Random_name_selector();
		System.out.println("You are guessing : " + random_name.replaceAll("\\w", "_ "));

		//////////// game starts now////////////////
//	String indexOfRandomName=	random_name.substring(0, random_name.length());

		ran_name_obj.guess_making(random_name);

	}
}