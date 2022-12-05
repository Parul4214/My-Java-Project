package practiceQuestion;

import java.util.Scanner;

public class Ques17PositiveNegetive {
	public static void main(String[] args) {

		String checkAgain;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter the number");
			int num = sc.nextInt();

			if (num > 0) {
				System.out.println("Number is positive ");
			} else if (num < 0) {
				System.out.println("Number is negetive ");
			} else {
				System.out.println("Number is : " + 0);
			}
			System.out.println("Do you want to check number again ? Yes/No ");
			checkAgain = sc.next();
		} while (checkAgain.equalsIgnoreCase("yes"));
	}

}
