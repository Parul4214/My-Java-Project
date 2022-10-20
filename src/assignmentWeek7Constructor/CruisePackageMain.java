package assignmentWeek7Constructor;

import java.util.Scanner;

public class CruisePackageMain {

	public static void main(String[] args) {

//		We offer 4 different packages as displayed below. Please enter the cruise that you want to select.
//		Scenic Cruise
//		Sunset Cruise
//		Discovery Cruise
//		Mystery Cruise
		double adult_buffet_price = 20.99;
		double kids_buffet_price = 4.99;

		CruiseDetailsDatabase scenic_cruise = new CruiseDetailsDatabase("Scenic Cruise", 43.99, 12.99, 3);
		CruiseDetailsDatabase sunset_cruise = new CruiseDetailsDatabase("Sunset Cruise", 52.99, 15.99, 1);
		CruiseDetailsDatabase discovery_cruise = new CruiseDetailsDatabase("Discovery Cruise", 39.99, 4.99, 4);
		CruiseDetailsDatabase mystery_cruise = new CruiseDetailsDatabase("Mystery Cruise", 45.99, 12.99, 2);

		// array of an object
		CruiseDetailsDatabase[] cruise_details = { scenic_cruise, sunset_cruise, discovery_cruise, mystery_cruise };
		int false_cruise_selection = cruise_details.length + 2;
		int which_cruise_selected = false_cruise_selection;
		Scanner sc = new Scanner(System.in);
		String continue_selector = "Null";
		do {

			// using loop for any invalid input, keep asking until any valid input received
			which_cruise_selected = false_cruise_selection;
			while (which_cruise_selected == false_cruise_selection) {
				System.out.println(
						"We offer 4 different packages as displayed below. Please enter the cruise that you want to select\n"
								+ "Scenic Cruise\n" + "Sunset Cruise\n" + "Discovery Cruise\n" + "Mystery Cruise ");
				String selected_cruise = sc.nextLine();

				System.out.println("You have selected: " + selected_cruise);
//	
//		The cruise that you have selected is Scenic Cruise which is a 2 day cruise
//		Price for Adults	(greater than 12)	: 52.99 per day
//		Price for kids above 5			: 15.99 per day

				for (int i = 0; i < cruise_details.length; i++) {
					if (selected_cruise.equalsIgnoreCase(cruise_details[i].cruise_name)) {
						System.out.println("The cruise that you have selected is " + (cruise_details[i].cruise_name)
								+ " which is a " + cruise_details[i].trip_duration + " day cruise");
						System.out.println("Price for Adults (greater than 12)	: " + (cruise_details[i].adults_price)
								+ " per day");
						System.out.println(
								"Price for kids above 5		    	: " + (cruise_details[i].kids_price) + " per day");
						which_cruise_selected = i;
					}

				}
				if (which_cruise_selected == false_cruise_selection)
					System.out.println(
							"Invalid Selection, Please try again \n----------------------------------------\n");
			}

			System.out.println(
					"Please press Y if you want to continue with the selection or press any other alphabet to select another cruise");
			continue_selector = sc.nextLine();
			if (!(continue_selector.equalsIgnoreCase("Y")))
				System.out.println(
						"User aborted the trip selection , Please Start Over\n----------------------------------------\n");

		} while (!(continue_selector.equalsIgnoreCase("Y"))); // loop is used to repeat set of block if user doesn't
																// wish to continue

		System.out.println("Enter the number of adults");
		int adults_input = sc.nextInt(); // number of adults stored in it
		if (adults_input >= 0 && adults_input <= 500)
			System.out.println("You have selected: " + adults_input + " adults");
		else if (adults_input > 500) {
			System.out.println("Exceeded cruise capacity");
			adults_input = 0;
		}

		System.out.println("Enter the number of kids");
		int kids_input = sc.nextInt();
		int chargeable_kids = 0;

		if (kids_input == 0)
			System.out.println("No Kids");
		else {

			for (int i = 1; i <= kids_input; i++) {

				System.out.println("Enter age of child " + i);
				int kids_age_input = sc.nextInt();
				if (kids_age_input > 5 && kids_age_input <= 12)
					chargeable_kids++;
			}
			System.out.println("kids > 5 age: " + chargeable_kids);
		}
		boolean isMealSelected = false;
		System.out.println("All our cruises have food service on board. \n" + "Do you want to pre-book for "
				+ "dinner buffet meals at 20.99 per day for adults and 4.99 per day for kids? Y/N");

		String meal_selector = sc.next();
		if (meal_selector.equalsIgnoreCase("y"))
			isMealSelected = true;
//To calculate the final price now 
		double final_price = 0;

		System.out.println("Your Package includes: ");
		System.out.println((cruise_details[which_cruise_selected].cruise_name) + " Adults			@ " + adults_input
				+ " =  $" + ((cruise_details[which_cruise_selected].adults_price) * adults_input));
		final_price = final_price + ((cruise_details[which_cruise_selected].adults_price) * adults_input);

		System.out.println((cruise_details[which_cruise_selected].cruise_name) + " Kids above 5		@ "
				+ chargeable_kids + " =  $" + ((cruise_details[which_cruise_selected].kids_price) * chargeable_kids));
		final_price = final_price + ((cruise_details[which_cruise_selected].kids_price) * chargeable_kids);
		if (isMealSelected) {
			System.out.println("Buffet Special Price Adults		@ " + adults_input + " = $"
					+ adult_buffet_price * adults_input);
			final_price = final_price + (adult_buffet_price * adults_input);

			System.out.println("Buffet Special Price kids above 5 	@ " + chargeable_kids + " = $"
					+ kids_buffet_price * chargeable_kids);
			final_price = final_price + (kids_buffet_price * chargeable_kids);
		}
		System.out.println("Total Price				= $" + final_price);
		System.out.println("HST	 @ 15%				= $" + final_price * 0.15);
		final_price = final_price * 1.15;

		System.out.println("Final Price				= $" + final_price);
	}

}
