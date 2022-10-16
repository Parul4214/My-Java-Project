import java.util.Scanner;

//To buy tickets only if $50 is available

public class BuyTicketMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Buy Tickets: $50 each");
		System.out.println("How much money do you have?");
		Scanner sc = new Scanner (System.in);
		int entered_money=sc.nextInt();

		// instantiated the clas using ref var buyTicketObj
		BuyTicketMethod buyTicketObj = new BuyTicketMethod();

		boolean checkMoney = buyTicketObj.isMoneyAvailable(entered_money);
		if (checkMoney) {
			System.out.println("Here is your ticket");
		} else if (!checkMoney) {
			System.out.println("Sorry, not enough money");

		}

	}

}
