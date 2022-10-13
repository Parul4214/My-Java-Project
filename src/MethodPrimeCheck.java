import java.util.Scanner;

public class MethodPrimeCheck {
	 int prime_check(int given_number)
	{
		int prime_flag=0;
		if (given_number <= 0)
			System.out.println("Please enter a postive integer");
		else if (given_number == 1 || given_number == 2)// 0,1,2 cannot be used in for loop
			System.out.println("Given number " + given_number + " is prime");
		else {
			// pass the given number to for loop to check if it is prime or not
			for (int counter = 2; counter <= given_number; counter++) {
				
				if (given_number % counter == 0) {
					prime_flag=0;
					break;
				}
				//if (counter + 1 == given_number)
				//	prime_flag=1;
			}}
		return prime_flag;
	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		Scanner myObj = new Scanner(System.in);// object declared to use scanner class
//		System.out.println("Enter any Integer");
//
//		int given_number = myObj.nextInt();// user input stored in variable
//		myObj.close(); // close scanner class, no more input from user
//if (prime_check(given_number)==0)
//	System.out.println("number is not prime");
//else
//	System.out.println("number is  prime");



	//}

}

