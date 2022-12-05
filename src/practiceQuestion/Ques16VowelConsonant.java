package practiceQuestion;

import java.util.Scanner;

public class Ques16VowelConsonant {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String checkAgain;

		do {

			System.out.println("Please enter any alphabet you want to check");
			char chr = sc.next().charAt(0);

			if (chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u') {
				System.out.println("Alphabet is vowel ");
			} else {
				System.out.println("Alphabet is consonant");
			}

			System.out.println("do you want to check again: yes/no");
			checkAgain = sc.next();

		} while (checkAgain.equalsIgnoreCase("yes"));

	}
}
