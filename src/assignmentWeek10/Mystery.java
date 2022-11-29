package assignmentWeek10;

public class Mystery extends Cruise {

	public void MysteryCruise() {
		super.cruiseSelected = "Mystery Cruise";
		super.numOfDays = 2;
		super.priceForAdult = 45.99;
		super.priceForchildren = 12.99;
		System.out.println("The cruise that you have selected is Mystery Cruise which is a  " + numOfDays
				+ "  day cruise\r\n" + "Price for Adults	(greater than 12)	: " + priceForAdult + " per day\r\n"
				+ "Price for kids above 5				: " + priceForchildren + " per day\r\n" + "");
		super.SpecialFeatureSelector("Casino Entry", 20.00);

	}

}
