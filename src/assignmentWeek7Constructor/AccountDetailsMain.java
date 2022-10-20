package assignmentWeek7Constructor;

import java.util.Scanner;

public class AccountDetailsMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		AccountDetails accountDetailsUser1 = new AccountDetails(101, 1111, 250.99);
		AccountDetails accountDetailsUser2 = new AccountDetails(202, 2222, 300.99);
		AccountDetails accountDetailsUser3 = new AccountDetails(303, 3333, 450.99);
		AccountDetails accountDetailsUser4 = new AccountDetails(404, 4444, 500.99);
		AccountDetails accountDetailsUser5 = new AccountDetails(505, 5555, 650.99);

		AccountDetails[] allAccountsDatabase = { accountDetailsUser1, accountDetailsUser2, accountDetailsUser3,
				accountDetailsUser4, accountDetailsUser5 };
		// The program should prompt the user to first enter the account number and PIN
		boolean is_account_verified = false;
		int acc_selector = 10; // initialized to false value
		while (!is_account_verified) {

			System.out.println("Please enter you Account Number");
			int entered_acc_num = sc.nextInt();

			System.out.println("Please enter you PIN");
			int entered_PIN = sc.nextInt();

			for (int i = 0; i < allAccountsDatabase.length; i++)
				if (allAccountsDatabase[i].credential_check(entered_acc_num, entered_PIN) == 1) {
					is_account_verified = true;
					acc_selector = i;
				}
			if (!is_account_verified)
				System.out.println("Credential Mismatch, Enter valid account number and PIN");

		}

		System.out.println("You Account balance is " + allAccountsDatabase[acc_selector].account_balance);
		System.out.println("Press\n" + "1: To Withdraw\n" + "2: To Deposit");
		int entered_input = sc.nextInt();
		boolean user_abort = false;

		if (entered_input == 1) {
			while (!user_abort) {
				System.out.println("How much money do you want to withdraw?");
				double withdraw_request = sc.nextDouble();

				if (withdraw_request > allAccountsDatabase[acc_selector].get_balance()) {
					System.out.println("Insufficient funds, Requested amount exceeded available funds");
					System.out.println("Do you wish to try again?\n" + "1: Try Again\n" + "2: Abort");
					int abort_request = sc.nextInt();
					if (abort_request == 2)
						user_abort = true;
				} else {
					allAccountsDatabase[acc_selector].withdraw_money(withdraw_request);
					break;
				}
			}
		}

		else if (entered_input == 2) {
			System.out.println("How much money do you want to deposit?");
			double deposit_request = sc.nextDouble();
			allAccountsDatabase[acc_selector].deposit_money(deposit_request);
		}

	}

}
