import java.util.Scanner;

public class prime_number {

	public static void main(String[] args) {
		// try {
		// take input from user and store it in a variable
		Scanner myObj = new Scanner(System.in);// object declared to use scanner class
		System.out.println("Enter any Integer");

		int given_number = myObj.nextInt();// user input stored in variable
		myObj.close(); // close scanner class, no more input from user

		// checking if the given number is in valid range
		if (given_number <= 0)
			System.out.println("Please enter a postive integer");
		else if (given_number == 1 || given_number == 2)// 0,1,2 cannot be used in for loop
			System.out.println("Given number " + given_number + " is prime");
		else {
			// pass the given number to for loop to check if it is prime or not
			for (int counter = 2; counter < given_number; counter++) {
				if (given_number % counter == 0) {
					System.out.println("Given number " + given_number + " is not prime");
					System.out.println("Divisible by " + counter);
					break;
				}
				if (counter + 1 == given_number)
					System.out.println("Given number " + given_number + " is prime");
			}
		}
		// }

		// catch (Exception e) {
		// System.out.println(
		// "Something went wrong. \n" + "Value Entered is not Integer \n" + "or it is
		// out of valid range");
		// }
	}
}
