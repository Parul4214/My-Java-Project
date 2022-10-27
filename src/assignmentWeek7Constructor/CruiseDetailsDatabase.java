// Create a program to take input from the user and give the final price of the cruise they have booked including HST.

package assignmentWeek7Constructor;

public class CruiseDetailsDatabase {
//class level variables
	String cruise_name;
	double adults_price;
	double kids_price;
	int trip_duration;
	
//Parameterized constructor
	public CruiseDetailsDatabase(String nameOfCruise, double priceOfAdult, double priceOfKids, int durationOfTrip) {

		cruise_name = nameOfCruise;
		adults_price = priceOfAdult;
		kids_price = priceOfKids;
		trip_duration = durationOfTrip;

	}

}
