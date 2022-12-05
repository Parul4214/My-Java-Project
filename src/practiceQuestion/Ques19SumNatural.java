package practiceQuestion;

import java.util.Scanner;

public class Ques19SumNatural {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Please enter any natural number");
		int givenInput = sc.nextInt();
		for (int i = 1; i <= givenInput; i++)
			sum += i;
		System.out.println("Sum of " + givenInput + " natural numbers are : " + sum);

	}

}
