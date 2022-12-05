package practiceQuestion;

import java.util.Scanner;

public class Ques7Substring {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String sampleStr1 = sc.nextLine();

		System.out.println("Enter another string");
		String sampleStr2 = sc.nextLine();

		System.out.println("Is String2 a substring of String1 " + " - " + sampleStr1.contains(sampleStr2));
	}

}
