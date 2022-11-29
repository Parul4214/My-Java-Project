package assignmentWeek10;

public class DeluxSuite extends Hotel {
	boolean deluxSuite() {
		
		Hotel hotelObj=new Hotel();
		hotelObj.memberCount();		
		if (hotelObj.adultCount + hotelObj.kidsCount > 4 || hotelObj.adultCount + hotelObj.kidsCount < 0) {
			System.out.println("The Delux suite is not suitable for the number of guests entered.\n"
					+ "Please select again or select separate rooms one at a time");
			return false;
		} else {
			System.out.println("Delux Room Selected");
		}
		return true;

	}

}
