package assignmentWeek7Constructor;

import java.util.Scanner;

public class AccountDetailsMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		AccountDetails accountDetailsUser1 = new AccountDetails(74107410, 1234, 250.99);
		AccountDetails accountDetailsUser2 = new AccountDetails(85208520, 4567, 300.99);
		AccountDetails accountDetailsUser3 = new AccountDetails(96309630, 8910, 450.99);
		AccountDetails accountDetailsUser4 = new AccountDetails(75307530, 1112, 500.99);
		AccountDetails accountDetailsUser5 = new AccountDetails(96309630, 1314, 650.99);

		AccountDetails[] allAccountsDatabase = { accountDetailsUser1, accountDetailsUser2, accountDetailsUser3,
				accountDetailsUser4, accountDetailsUser5 };
		// The program should prompt the user to first enter the account number and PIN
		System.out.println("Please enter you Account Number");
		int entered_acc_num = sc.nextInt();

		System.out.println("Please enter you PIN");
		int entered_PIN = sc.nextInt();

		AccountDetails Obj = new AccountDetails(entered_PIN, entered_PIN, entered_PIN);
		
		
		System.out.println("Credential check :" );
		for (int i = 0; i < allAccountsDatabase.length; i++)
			if (entered_acc_num == allAccountsDatabase[i].account_number
					&& entered_PIN == allAccountsDatabase[i].account_PIN) {

				System.out.println("You Account balance is " + allAccountsDatabase[i].account_balance);
				System.out.println("Press\n" + "1: To Withdraw\n" + "2: To Deposit");
				int entered_input=sc.nextInt();
				if(entered_input)
				System.out.println("Please enter ");
			}

	}

}
