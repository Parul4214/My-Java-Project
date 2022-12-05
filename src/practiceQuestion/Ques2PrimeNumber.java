package practiceQuestion;

import java.util.Scanner;

public class Ques2PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numInput = 0;
		boolean anotherNumCheck=false;
		
		do {
		System.out.println("Please enter any number");
		numInput = sc.nextInt();
		
		if(isNumberPrime(numInput))
			System.out.println("given Number "+ numInput + " is prime");
		else
			System.out.println("given Number "+ numInput + " is not prime");
		
		System.out.println("Do you want to check another num: Yes/No");
		String userInput=sc.next();
		
		if(userInput.equalsIgnoreCase("Yes")) {
			anotherNumCheck=true;
		}
		}while(anotherNumCheck);
		
		evenOdd();
	}

	static boolean isNumberPrime(int num) {

		if (num == 2 ) {
			return true;
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
	
	
	static void evenOdd() {
		System.out.println("Enter num to check even/odd");
		Scanner scn= new Scanner(System.in);
		int num=scn.nextInt();
		
		if(num%2==0)
			System.out.println("Num is even");
		else
			System.out.println("num is odd");
				
				
		
		
	}
}
