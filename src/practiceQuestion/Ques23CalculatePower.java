package practiceQuestion;

import java.util.Scanner;

public class Ques23CalculatePower {

	static long calculateExp(int base, int power) {
		int result = 1;
		for (int i = 0; i < power; i++) {
			result = result * base;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the base value");
		int baseVal = sc.nextInt();
		System.out.println("Enter the power Value");
		int powerVal = sc.nextInt();

		long resultant = calculateExp(baseVal, powerVal);
		System.out.println(resultant);
	}
}
