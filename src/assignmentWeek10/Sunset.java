package assignmentWeek10;
public class Sunset extends Cruise {
	public void SunsetCruise() {
		super.cruiseSelected = "Sunset Cruise";
		super.numOfDays = 1;
		super.priceForAdult = 52.99;
		super.priceForchildren = 15.99;
		System.out.println("The cruise that you have selected is Sunset Cruise which is a " + numOfDays
				+ " day cruise\r\n" + "Price for Adults	(greater than 12)	: " + priceForAdult + " per day\r\n"
				+ "Price for kids above 5				: " + priceForchildren + " per day\r\n" + "");
		super.SpecialFeatureSelector("Candle Light Dinner", 45.00);
	}
}
