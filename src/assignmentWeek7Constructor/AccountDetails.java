package assignmentWeek7Constructor;

public class AccountDetails {
	
	int account_number;
	int account_PIN;
	double account_balance;
	
	public AccountDetails(int numberOnAccount, int PINOnAccount, double balanceOfAccount) {
		
		
//		account_number=numberOnAccount;
//		account_PIN=PINOnAccount;
//		account_balance= balanceOfAccount;
		this.account_number = numberOnAccount;
        this.account_PIN = PINOnAccount;
        this.account_balance = balanceOfAccount;
    
		
		
	}
	

	public void deposit_money(double deposit_money_requested) {
		this.account_balance=this.account_balance+deposit_money_requested;
		System.out.println("Deposit Successful, Account Balance: " +this.account_balance);
	}
	
	public double get_balance() {
		return this.account_balance;
	}
	
	public void withdraw_money(double withdraw_money_requested) {
		this.account_balance=this.account_balance-withdraw_money_requested;
		System.out.println(" Withdraw Successful, Account Balance: " +this.account_balance);
	}

	public int credential_check(int acc_num, int acc_pin) {
		if (acc_num==this.account_number && acc_pin==this.account_PIN)
			
		return 1;
		else 
			return 0;
	}

	
//	double withdraw(double withdrawAmount) {
//        if (withdrawAmount > 0) {
//            this.balance = this.balance - withdrawAmount;
//            return this.balance;
//        }
//        
//        else return 0;}
//	 double deposit(double depositAmount) {
//	        if (depositAmount > 0) {
//	            this.balance = this.balance + depositAmount;
//	            return this.balance;
//	        }
//	        else return 0;
//	    }

}
