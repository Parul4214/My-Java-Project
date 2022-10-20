package assignmentWeek7Constructor;

public class AccountDetails {
	
	int account_number;
	int account_PIN;
	double account_balance;
	double withdraw;
	double deposit;
	
	public AccountDetails(int numberOnAccount, int PINOnAccount, double balanceOfAccount) {
		
		
		account_number=numberOnAccount;
		account_PIN=PINOnAccount;
		account_balance= balanceOfAccount;
		
		
	}
	
	int credential_check(int acc_num, int acc_pin) {
		
		
	}

}
