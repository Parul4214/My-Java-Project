package practiceQuestion;

import java.util.Scanner;

public class Ques22FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int firstNum = 0;
		int secondNum = 1;
		System.out.println("please enter nth term limit of Fibonacci series");
		int limit = sc.nextInt();
		for (int i = 1; i <= limit; i++) {
			System.out.print(firstNum + " ");
			int nextNum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = nextNum;
		}
	}
}
