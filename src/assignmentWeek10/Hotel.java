package assignmentWeek10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Hotel extends UserSignUp {

	Scanner sc = new Scanner(System.in);
	static int adultCount;
	static int kidsCount;
	double roomPrice;
	double totalBill;
	String suiteSelected;
	int numOfDays;
	boolean isMealRequested = false;
	double mealForAdult = 25;
	double mealForKids = 5;
	String mealRequest;
	DecimalFormat df = new DecimalFormat("0.00");

	void room_selector() {
		boolean isRoomSelected = false;
		System.out.println("Hotel stay selected");
		System.out.println("Please enter the Suite you want to select\r\n"
				+ "Delux  : accommodates 2 adults and 2 children at the rate of $180/ night\r\n"
				+ "Family : accommodates 4 adults and 4 children at the rate of $230/ night.\r\n");
		while (!isRoomSelected) {
			suiteSelected = sc.nextLine();
			if (suiteSelected.equalsIgnoreCase("family")) {
				FamilySuite fsObj = new FamilySuite();
				while (!fsObj.familySuite())
					;
				roomPrice = 230;

				suiteSelected = "Family Suite";
				isRoomSelected = true;
			} else if (suiteSelected.equalsIgnoreCase("delux")) {
				DeluxSuite dsObj = new DeluxSuite();
				while (!dsObj.deluxSuite())
					;
				roomPrice = 180;
				suiteSelected = "Delux Suite";
				isRoomSelected = true;
			} else
				System.out.println("Please make a valid selection");
		}
		System.out.println("All rooms come with free breakfast.\n"
				+ "Do you want to add lunch in your room as well at a discounted pre-booking rates as explained below:\n"
				+ "$25/ for adults and $5/ for kids \n" + "press 'Y' for yes or any other key to ignore and continue");
		mealRequest = sc.next();

		if (mealRequest.equalsIgnoreCase("y")) {
			System.out.println("Meals Requested");
			isMealRequested = true;
		} else if (!mealRequest.equalsIgnoreCase("y")) {
			System.out.println("Meals not requested");
		}
		System.out.println("Enter the number of days of stay: ");
		numOfDays = sc.nextInt();
		this.billCalculator();
	}

	void memberCount() {
		System.out.println("Enter the number of adults : ");
		adultCount = sc.nextInt();
		System.out.println("Enter the number of kids : ");
		kidsCount = sc.nextInt();
	}

	void billCalculator() {
		totalBill = (roomPrice * numOfDays);
		System.out.println("The total amount you will be charged is\n" + suiteSelected + "      	  @ " + numOfDays
				+ " nights	: $" + (roomPrice * numOfDays));
		if (isMealRequested) {
			System.out.println(
					"Lunch Pre-Booked Special Rate Adults @" + adultCount + "	: $" + (mealForAdult * adultCount));
			System.out.println(
					"Lunch Pre-Booked Special Rate Kids   @" + kidsCount + "	: $" + (mealForKids * kidsCount));

			totalBill = ((roomPrice * numOfDays) + (mealForAdult * adultCount) + (mealForKids * kidsCount));
		}
		System.out.println("Total Price 				: $" + totalBill);
		System.out.println("HST   18%   				: $" + df.format(totalBill * 0.18));
		System.out.println("Final Price 				: $" + df.format(totalBill * 1.18));

	}

}
