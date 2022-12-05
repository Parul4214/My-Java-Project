package practiceQuestion;

import java.util.Scanner;

public class DoubleNumberTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isAnotherNumChecked = false;
		do {
			System.out.println("Please enter the number you want to check : ");
			int num = sc.nextInt();
			if (isNumDouble(num)) {
				multiplicationTable(num);
			}
			System.out.println("Do you want to check another number: Yes/No");
			String userInput = sc.next();

			if (userInput.equalsIgnoreCase("yes")) {
				isAnotherNumChecked = true;
			}
		} while (isAnotherNumChecked);
	}

	public static boolean isNumDouble(int givenNum) {
		for (int i = 0; i <= 10; i++) {
			if (givenNum % 10 == i && givenNum / 10 == i) {
				System.out.println("Given num is double in nature");
				return true;
			}
		}
		System.out.println("Given number is not double in nature");
		return false;
	}

	public static void multiplicationTable(int num) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
	}
}
