package assignmentWeek7Constructor;

import java.text.DecimalFormat;

public class RevisedCruiseDetails {
	String cruise_name;
	double adult_price;
	double kids_price;
	int trip_duration;
	double adult_buffet=20.99;
	double kids_buffet=4.99;
	
	DecimalFormat df=new DecimalFormat("0.00");
	
	public RevisedCruiseDetails(String nameOfCruise, double priceOfAdults, double priceOfKids, int durationOfTrip) {
		cruise_name=nameOfCruise;
		adult_price=priceOfAdults;
		kids_price=priceOfKids;
		trip_duration=durationOfTrip;
}
	
	
	
	
	
	
}
