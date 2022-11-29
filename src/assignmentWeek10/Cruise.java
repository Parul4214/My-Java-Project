package assignmentWeek10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Cruise extends UserSignUp {

	static String cruiseSelected;
	static double priceForAdult;
	static double priceForchildren;
	static int numOfDays;
	int numOfAdults, numOfChildren;
	double buffetForAdults;
	double buffetForChildren;
	static double specialFeaturePrice;
	static String specialFeature;

	DecimalFormat df = new DecimalFormat("0.00");

	void cruiseSelector() {
		System.out.println("========= welcome to cruise selection page================");
		cruiseSelected = userSelection();

		switch (cruiseSelected) {
		case "scenic cruise":
			Scenic scObj = new Scenic();
			scObj.ScenicCruise();
			break;
		case "mystery cruise":
			Mystery msObj = new Mystery();
			msObj.MysteryCruise();

			break;
		case "sunset cruise":
			Sunset ssObj = new Sunset();
			ssObj.SunsetCruise();

			break;
		case "discovery cruise":
			Discovery dsObj = new Discovery();
			dsObj.DiscoveryCruise();
			break;
		default:
			break;
		}
		peopleCalulator();
		setbuffetPrice();
		priceCalculator();
	}

	String userSelection() {
		Scanner sc = new Scanner(System.in);
		String again;
		String cruiseSelec;
		do {
			System.out.println(
					"We offer 4 different packages as displayed below. Please enter the cruise that you want to select.\n"
							+ "Scenic Cruise\nSunset Cruise\nDiscovery Cruise\nMystery Cruise\n");
			cruiseSelec = sc.nextLine().toLowerCase();
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
			System.out.println("Please press Y if you want to continue with the selection or\n"
					+ "press any other alphabet to select another");
			again = sc.nextLine();
		} while (!again.equalsIgnoreCase("Y"));
		return cruiseSelec;
	}

	void peopleCalulator() {
		System.out.println("Enter the number of adults");
		numOfAdults = sc.nextInt();
		System.out.println("Enter the number of children");
		int tempNumOfChildren = sc.nextInt();

		int age;
		if (tempNumOfChildren > 0) {
			for (int i = 0; i < tempNumOfChildren; i++) {
				System.out.println("Enter the age of child " + (i + 1));
				age = sc.nextInt();
				while (age >= 13 || age <= 0) {
					System.out.println("Please enter a valid age of child " + (i + 1) + " from (1-12)");
					age = sc.nextInt();
				}

				if (age >= 5) {
					numOfChildren++;
				}
			}
		}
		System.out.println("Adults -->>" + numOfAdults + " Kids above 5 --->>" + numOfChildren);
	}

	void SpecialFeatureSelector(String splFeature, double featurePrice) {
		System.out.println("You have selected " + cruiseSelected + " which has its own special feature '" + splFeature
				+ "'\n" + "Which will cost you $" + featurePrice + " per person\n"
				+ "Do you want to add this feature Yes / No");
		String featureRequest = sc.nextLine();
		if (featureRequest.equalsIgnoreCase("yes")) {
			System.out.println("Special Feature added to the package");
			specialFeature = splFeature;
			specialFeaturePrice = featurePrice;
		} else
			System.out.println("Special Feature Offer Declined");

	}
	void setbuffetPrice() {
		System.out.println(
				"All our cruises have food service on board. Do you want to pre-book for dinner buffet meals at \n20.99 per day for adults and 4.99 per day for kids?"
						+ "\nPlease press Y if you want to Prebook otherwise press any other alphabet");
		String buffetMeal = sc.next();

		if (buffetMeal.equalsIgnoreCase("Y")) {
			buffetForAdults = 20.99;
			buffetForChildren = 4.99;
			System.out.println("Buffet Meal Added to the package");
		} else {
			buffetForAdults = buffetForChildren = 0.0;
		}
	}
	void priceCalculator() {

		double totalPriceForAdults = numOfAdults * priceForAdult * numOfDays;
		double totalPriceforChildren = numOfChildren * priceForchildren * numOfDays;
		double buffetTotalPriceAdult = numOfAdults * buffetForAdults;
		double buffetTotalPriceChildren = numOfChildren * buffetForChildren;
		double specialFeatureTotalPrice = specialFeaturePrice * (numOfAdults + numOfChildren);
		double totalPrice = totalPriceForAdults + totalPriceforChildren + buffetTotalPriceAdult
				+ buffetTotalPriceChildren + specialFeatureTotalPrice;
		double hst = (totalPrice * 15) / 100;
		double FinalPrice = totalPrice + hst;
		System.out.println("Your  " + cruiseSelected + " Package includes: (Special Feature '" + specialFeature + "')\n"
				+ "Adults 					@ " + numOfAdults + "	:$" + df.format(totalPriceForAdults) + "\n"
				+ "Children above 5 			@ " + numOfChildren + "	:$" + df.format(totalPriceforChildren) + "\n"
				+ "Buffet Special Price Adults		@ " + numOfAdults + "	:$" + df.format(buffetTotalPriceAdult)
				+ "\n" + "Buffet Price Children above 5 		@ " + numOfChildren + "	:$"
				+ df.format(buffetTotalPriceChildren) + "\n" + "Special Feature Price			@ "
				+ (numOfAdults + numOfChildren) + "	:$" + specialFeatureTotalPrice + "\n"
				+ "Total Price					:$ " + df.format(totalPrice) + "\n" + "HST	@ 15%					:$ "
				+ df.format(hst) + "\n" + "Final Price					:$ " + df.format(FinalPrice) + "\n");
	}
}
