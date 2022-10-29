package assignmentWeek8;

import java.util.Scanner;

public class CruiseBookingMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		CruiseUserDetails user_info = new CruiseUserDetails("abcd", "abc123", "parul verma", "1234567890");

		System.out.println("Welcome to Cruise Booking.");
		System.out.println("Please sign up to book a cruise.");

		System.out.println("Enter your Username you want to use.");
		user_info.setUser_name();

		
		while(!(user_info.isPasswordValidated()));

		System.out.println("Enter your Full Name");
		
		user_info.setFull_name();

		System.out.println("Enter your phone number");
		user_info.setPhone_number();

		System.out.println("Thank you for registering!");

		// credential checking

		if (user_info.credential_check() == 1)
			System.out.println("Credentials matched");
		else {
			System.out.println("ID/Password Incorrect");
			System.exit(0);
		}
		/////////////////////////////////////////////////

/*		String again;
		String cruiseSelec;
		int index = 0;
		CruisePackageDetails scenicCruise = new CruisePackageDetails("Scenic Cruise", 43.99, 12.99, 3);
		CruisePackageDetails sunsetCruise = new CruisePackageDetails("Sunset Cruise", 52.99, 15.99, 1);
		CruisePackageDetails discoveryCruise = new CruisePackageDetails("Discovery Cruise", 39.99, 9.99, 4);
		CruisePackageDetails mysteryCruise = new CruisePackageDetails("Mystery Cruise", 45.99, 12.99, 2);
		CruisePackageDetails[] cruiseDetails = { scenicCruise, sunsetCruise, discoveryCruise, mysteryCruise };

		do {
			System.out.println(
					"We offer 4 different packages as displayed below. Please enter the cruise that you want to select.\n"
							+ "Scenic Cruise\nSunset Cruise\nDiscovery Cruise\nMystery Cruise\n");
			cruiseSelec = sc.nextLine();
			int counTry = 1;
			while (!cruiseSelec.equalsIgnoreCase("Scenic Cruise") && !cruiseSelec.equalsIgnoreCase("Sunset Cruise")
					&& !cruiseSelec.equalsIgnoreCase("Discovery Cruise")
					&& !cruiseSelec.equalsIgnoreCase("Mystery Cruise")) {
				++counTry;
				if (counTry > 3) {
					System.out.println("Please Start over,you have reached the input limit");
					System.exit(0);
				}
				System.out.println("Invalid Selection try again below");
				cruiseSelec = sc.nextLine();
			}

			for (int i = 0; i < cruiseDetails.length; i++) {
				if ((cruiseSelec).equalsIgnoreCase(cruiseDetails[i].cruiseSelection)) {
					index = i;
					System.out.println("The cruise that you have selected is " + cruiseDetails[i].cruiseSelection
							+ " which is a " + cruiseDetails[i].numDay + " day cruise\r\n"
							+ "Price for Adults	(greater than 12)	: " + cruiseDetails[i].priceForAdult
							+ " per day\r\n" + "Price for kids above 5			: " + cruiseDetails[i].priceForchildren
							+ " per day\r\n" + "");
					break;
				}

			}
			System.out.println("Please press Y if you want to continue with the selection or\n"
					+ "press any other alphabet to select another");
			again = sc.nextLine();
		} while (!again.equalsIgnoreCase("Y"));

		System.out.println("Enter the number of adults");
		int numAdults = sc.nextInt();
		System.out.println("Enter the number of children");
		int numChildren = sc.nextInt();
		int ageAboveFive = 0;
		int age;
		if (numChildren > 0) {
			for (int i = 0; i < numChildren; i++) {
				System.out.println("Enter the age of child " + (i + 1));
				age = sc.nextInt();
				while (age >= 13 || age <= 0) {
					System.out.println("Please enter a valid age of child " + (i + 1) + " from (1-12)");
					age = sc.nextInt();
				}

				if (age >= 5) {
					ageAboveFive++;
				}
			}
		}

		System.out.println(
				"All our cruises have food service on board. Do you want to pre-book for dinner buffet meals at \n20.99 per day for adults and 4.99 per day for kids?"
						+ "\nPlease press Y if you want to Prebook otherwise press any other alphabet");
		String buffetMeal = sc.next();
		cruiseDetails[index].setbuffetPrice(buffetMeal);
		cruiseDetails[index].output(numAdults, ageAboveFive);
*/
		////////////////////////////////
		// make changes after selecting cruise
		
		user_info.update_info();

		
		System.out.println("Thank you for using the service!");
	}
}
