package assignmentWeek10;

import java.util.Scanner;

public class UserSignUp {

	private String userName = "Null";
	private String password = "Null";
	String name = "Null";
	long phoneNumber = 0;
	String email = "Null";
	Scanner sc = new Scanner(System.in);

	void signUp() {
		System.out.println("Please sign up to book a service.");

		this.setUserName();
		this.setPassword();
		this.setphoneNumber();
		this.setName();
		this.setEmail();

		System.out.println("Thank you for registering!");

	}

	public void setUserName() {
		System.out.println("Enter your Username you want to use.");
		String enterUsername = sc.nextLine();
		this.userName = enterUsername;

	}

	public void setPassword() {
		String enterPassword;
		do {
			System.out.println("Enter the password that you want to use:\n"

					+ "Your password can be any combination of letters, numbers, and symbols.");
			enterPassword = sc.next();
			if (enterPassword.length() < 8) {
				System.out.println("Password is too short");
			} else {
				System.out.println("Confirm password");
				String confirm_password = sc.next();
				if (enterPassword.equals(confirm_password)) {
					this.password = enterPassword;
					System.out.println("Password updated successfully");

				} else {
					System.out.println("Both passwords don't match");
				}
			}
		} while (this.password != enterPassword);
	}

	public void setName() {
		System.out.println("Enter your Full Name");
		String enterName = sc.next();
		this.name = enterName;

	}

	public void setphoneNumber() {
		long enterNumber;
		int phone_number_length;
		
		do {
		System.out.println("Enter your phone number");
		enterNumber = sc.nextLong();
		this.phoneNumber = enterNumber;
		
		phone_number_length = String.valueOf(enterNumber).length();
		if(phone_number_length!=10)
			System.out.println("Entered number is " +phone_number_length+ " digits long"
					+ "\nPlease Enter a valid 10 digit phone number");
		} while(phone_number_length!=10);
		
		System.out.println("Phone number updated successfully");


	}

	public void setEmail() {
		String enterEmail;
		do {
			System.out.println("Please enter your email");

			enterEmail = sc.next();
			if (enterEmail.contains("@") && ((enterEmail.contains(".com")) || (enterEmail.contains(".ca")))) {
				this.email = enterEmail;
			} else {
				System.out.println("Please enter valid email adress");
			}

		} while (this.email != enterEmail);
	}
}
