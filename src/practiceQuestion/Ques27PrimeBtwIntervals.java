package practiceQuestion;

import java.util.Scanner;

public class Ques27PrimeBtwIntervals {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the lower limit");
		int lowerVal = sc.nextInt();
		System.out.println("Please enter the higher limit");
		int highVal = sc.nextInt();
		System.out.print("Prime Numbers are: ");
		for (int i = lowerVal; i <= highVal; i++) {

			if (isNumberPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}

	static boolean isNumberPrime(int num) {

		if (num ==2) {
			return false;
		} else {

			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					return false;
				}
				if (i + 1 == num) {
					return true;
				}
			}
		}
		return false;
	}
}