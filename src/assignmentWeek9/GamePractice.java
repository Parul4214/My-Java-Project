package assignmentWeek9;

import java.util.Scanner;

public class GamePractice {
	public static void main(String[] args) {
		GamePracticeMethods ran_name_obj = new GamePracticeMethods();
		String random_name = ran_name_obj.Random_name_selector();//method call will return random name
		System.out.println("You are guessing : " + random_name.replaceAll("\\w", "_ "));

		//////////// game starts now////////////////
		
		ran_name_obj.guess_making(random_name); //random name passed as argument to method

	}
}