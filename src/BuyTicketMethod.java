import java.util.Scanner;

//To buy tickets only if $50 is available
public class BuyTicketMethod {

	boolean isMoneyAvailable(int entered_money) {
		int ticketPrice=50;
		
		if (entered_money>=ticketPrice) {
			return true;
		}

		return false;

	}

}
