package assignmentWeek10;

public class Discovery extends Cruise {

	public void DiscoveryCruise() {
		super.cruiseSelected = "Discovery Cruise";
		super.numOfDays = 4;
		super.priceForAdult = 39.99;
		super.priceForchildren = 9.99;
		System.out.println("The cruise that you have selected is Discovery Cruise which is a " + numOfDays
				+ " day cruise\r\n" + "Price for Adults	(greater than 12)	: " + priceForAdult + " per day\r\n"
				+ "Price for kids above 5				: " + priceForchildren + " per day\r\n" + "");
		super.SpecialFeatureSelector("Adventure Games Entry", 50.00);
	}

}
