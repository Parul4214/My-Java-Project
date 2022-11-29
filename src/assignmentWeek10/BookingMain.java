package assignmentWeek10;

import java.util.Scanner;

public class BookingMain {

	public static void main(String[] args) {

		UserSignUp signupObj = new UserSignUp();
		signupObj.signUp();
		Scanner sc = new Scanner(System.in);
		boolean isOtherServiceSelected = false;
		do {
			System.out.println("Please enter the service you want to book:" + " \nHotel / Cruise ??");
			String userSelection = sc.nextLine();

			if (userSelection.equalsIgnoreCase("hotel")) {
				Hotel hotel = new Hotel();
				hotel.room_selector();
			} else if (userSelection.equalsIgnoreCase("cruise")) {
				System.out.println("Cruise trip selected");
				Cruise cruiseObj = new Cruise();
				cruiseObj.cruiseSelector();
			} else {
				System.out.println("Please make a valid selection");
			}
			System.out.println("Do you want to book another Hotel Room or Cruise\n" + "Yes or No");
			String selectAgain = sc.nextLine();
			if (selectAgain.equalsIgnoreCase("Yes"))
				isOtherServiceSelected = true;
			else {
				isOtherServiceSelected = false;
			}
		} while (isOtherServiceSelected);
	}
}
