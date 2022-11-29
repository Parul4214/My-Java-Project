package assignmentWeek10;
public class Scenic extends Cruise {
	public void ScenicCruise() {
		super.cruiseSelected = "Scenic Cruise";
		super.numOfDays = 3;
		super.priceForAdult = 43.99;
		super.priceForchildren = 12.99;
		System.out.println("The cruise that you have selected is Scenic Cruise which is a " + numOfDays
				+ " day cruise\r\n" + "Price for Adults	(greater than 12)	: " + priceForAdult + " per day\r\n"
				+ "Price for kids above 5				: " + priceForchildren + " per day\r\n" + "");
		super.SpecialFeatureSelector("Spa", 50.00);
	}
}
