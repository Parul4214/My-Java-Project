package assignmentWeek8;

import java.util.Scanner;

public class CruiseUserDetails {
	Scanner obj = new Scanner(System.in);

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

	
	public void setUser_name() {
		String enter_username = obj.nextLine();
		this.user_name = enter_username;
	}

	public void setUser_password(String enter_passwrd) {
		this.user_password = enter_passwrd;
		System.out.println("Password updated");

	}
	public void setFull_name() {
		String enter_name = obj.nextLine();
		this.full_name = enter_name;
	}
	public void setPhone_number() {
		String enter_num = obj.nextLine();
		this.phone_number = enter_num;
		
	}

	public boolean isPasswordValidated() {
	//	System.out.println("Enter your New Password");
		System.out.println("Enter the password that you want to use:\n"
				+ "Your password can be any combination of letters, numbers, and symbols.");
		String new_password = obj.next();
		if (new_password.length() < 8) {
			System.out.println("Password is too short");
		}else {	
			System.out.println("Confirm password");
			String confirm_password = obj.nextLine();
			if(new_password.equals(confirm_password)) {
				this.user_password = new_password;
				System.out.println("Password updated successfully");
				return true;
			}else {
				System.out.println("Both passwords don't match");
			}
		}
		return false;
	}

	
	public int password_check() {
		int password_check_attempts = 0;
		int return_value = 0;
		while (password_check_attempts < 3) {
			System.out.println("Enter your existing password");
			String old_passwrd = obj.nextLine();
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
			String entered_username = obj.next();
			System.out.println("Please Enter Password");
			String entered_password = obj.next();
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

	public void update_info() {
		System.out.println(
				"Do you want to change your personal information. Press Y to change. Press any other alphabet to exit.");
		String change_info = obj.next();
		if (change_info.equalsIgnoreCase("Y")) {
			System.out.println("Please enter the information you want to change.\n" + "1.	Password\n"
					+ "2.	Phone number\n" + "3.	User Name\n");
			int new_info = obj.nextInt();
			if ((new_info == 1 || new_info == 2 || new_info == 3)) {
				switch (new_info) {
				case 1:
					System.out.println("Enter your New Password");
					String new_password = obj.nextLine();
					System.out.println("confirm password");
					String confirm_password = obj.nextLine();
					if (new_password.equals(confirm_password)) {
						this.user_password = new_password;
						System.out.println("Password updated successfully");
					} else {
						System.out.println("Password doesn't match");
					}
					break;

				case 2:
					System.out.println("Enter your New phone number");
					String new_phnNumber = obj.nextLine();
					this.phone_number = new_phnNumber;
					System.out.println("Phone number updated successfully");
					break;
				case 3:
					System.out.println("Enter your New User Name");
					String new_user_name = obj.nextLine();
					this.user_name = new_user_name;
					System.out.println("User Name updated successfully");
					break;
				default:
					System.out.println("System Abort");
					System.exit(0);
					break;

				}
			} else {
				System.out.println("System Abort");
				System.exit(0);
			}

		}
	}
}
