package assignmentWeek7Constructor;

public class AccountDetails {

	int account_number;
	int account_PIN;
	double account_balance;

	public AccountDetails(int numberOnAccount, int PINOnAccount, double balanceOfAccount) {

		account_number = numberOnAccount;
		account_PIN = PINOnAccount;
		account_balance = balanceOfAccount;

	}

	public void deposit_money(double deposit_money_requested) {
		account_balance = account_balance + deposit_money_requested;
		System.out.println("Deposit Successful, Account Balance: " + account_balance);
	}

	public double get_balance() {
		return account_balance;
	}

	public void withdraw_money(double withdraw_money_requested) {
		account_balance = account_balance - withdraw_money_requested;
		System.out.println("Withdraw Successful, Account Balance: " + account_balance);
	}

	public int credential_check(int acc_num, int acc_pin) {
		if (acc_num == account_number && acc_pin == account_PIN)

			return 1;
		else
			return 0;
	}

}
