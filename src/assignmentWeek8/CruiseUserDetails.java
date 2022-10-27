package assignmentWeek8;

import java.util.Scanner;

public class CruiseUserDetails {
	Scanner sc = new Scanner(System.in);
	private String user_name;
	private String user_password;
	private String full_name;
	private String phone_number;

	public CruiseUserDetails(String user_name, String user_password, String full_name, String phone_number) {

		this.user_name = user_name;
		this.user_password = user_password;
		this.full_name = full_name;
		this.phone_number = phone_number;
	}

	public void setFull_name() {

		String enter_name = sc.nextLine();
		this.full_name = enter_name;
	}

	public void setUser_name() {

		String enter_username = sc.nextLine();
		this.user_name = enter_username;
	}

	public void setUser_password() {
		String enter_passwrd = sc.nextLine();
		this.user_password = enter_passwrd;
	}

	public void setPhone_number() {

		String enter_num = sc.nextLine();
		this.phone_number = enter_num;
	}

	public int password_check() {
		int password_check_attempts = 0;
		int return_value = 0;
		while (password_check_attempts < 3) {
			System.out.println("Enter your existing password");
			String old_passwrd = sc.next();
			if (old_passwrd.equals(this.user_password)) {
				System.out.println("Password Verified");
				return_value = 1;
				break;

			} else {
				password_check_attempts++;
				System.out.println("Password Mismatched, Attempts remianing: " + (3 - password_check_attempts));
				if (password_check_attempts == 3) {
					System.out.println("You have reached the maximum limit of password check");
					return_value = 0;

				}
			}
		}
		return return_value;

	}

	public int credential_check() {
		int cred_check_attempts = 0;
		int return_cred_value = 0;
		while (cred_check_attempts < 3) {
			System.out.println("Please Enter User Name");
			String entered_username = sc.next();
			System.out.println("Please Enter Password");
			String entered_password = sc.next();
			if (entered_password.equals(user_password) && entered_username.equals(entered_username)) {
				return_cred_value = 1;
				break;

			} else {
				cred_check_attempts++;
				System.out.println("Credential mismatched, Attempts remaining: " + (3 - cred_check_attempts));
				if (cred_check_attempts == 3) {
					System.out.println("You have reached the maximum limit");
					return_cred_value = 0;
				}

			}
		}
		return return_cred_value;

	}
}
