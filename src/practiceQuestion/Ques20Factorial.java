package practiceQuestion;

import java.util.Scanner;

public class Ques20Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any number to get its factorial");
		int num = sc.nextInt();
		long factorial = 1;
		for (int i = num; i > 0; i--) {
			factorial *= i;
		}
		System.out.println("Factorial of " + num + " is " + factorial);
	}
}
