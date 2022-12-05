package practiceQuestion;

import java.util.Scanner;

public class Ques13RemoveSecondCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the sentence ");
		String sentence = sc.nextLine();
		String joinString = "";

		String[] word = sentence.split(" ");

		for (String splitWords : word) {
			String newWord = splitWords.substring(0, 1) + splitWords.substring(2);
			joinString = String.join(" ", joinString, newWord);
		}
		String newStr = joinString.substring(1);
		System.out.print(newStr);

	}

}