package practiceQuestion;

import java.util.Scanner;

public class Ques9FindLength {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the input for which you want to check length: ");
		String sampleInput = sc.nextLine();
		System.out.println("Length of the String is " + sampleInput.replace(" ", "").length());
 	}

}
