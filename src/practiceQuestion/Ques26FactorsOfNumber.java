package practiceQuestion;

import java.util.Scanner;

public class Ques26FactorsOfNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number you want to find factors of: ");
		int num = sc.nextInt();
		System.out.println("Factors of " + num + " are :");

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}

	}

}
