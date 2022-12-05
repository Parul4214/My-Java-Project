package practiceQuestion;

import java.util.Scanner;

public class Ques18AlphabetOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String checkAgain;
		do {
			System.out.println("Press any key");
			char chr = sc.next().charAt(0);
			if ((chr >= 'a' && chr <= 'z') || (chr >= 'A' && chr <= 'Z')) {
				System.out.println(chr + " is an alphabet");
			} else {
				System.out.println(chr + " is not an alphabet");
			}
			System.out.println("Do you want to check again? Yes/No");
			checkAgain = sc.next();
		} while (checkAgain.equalsIgnoreCase("yes"));
	}
}
