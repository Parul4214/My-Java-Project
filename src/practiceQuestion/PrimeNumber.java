package practiceQuestion;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = 0;
		String userResponse="";

		while (num <= 0) {
			System.out.println("Please enter valid number");
			num = sc.nextInt();
		}
		if (num == 1 || num == 2) {
			System.out.println("number is prime");
		} else {

			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					System.out.println("number is not prime because it is divisible by " + i);
					break;
				}
				if (i + 1 == num) {
					System.out.println("Number is prime number");
				}
			}
		}
		System.out.println("Do you want to check number again? Press Y to continue and any other key to exit");
		userResponse=sc.next();
		if(userResponse.equalsIgnoreCase("y")) {
			System.out.println("Please make selections again");
		}
	}
	
	 
	
	}

