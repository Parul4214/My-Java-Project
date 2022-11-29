package assignmentWeek10;

public class FamilySuite extends Hotel {

	boolean familySuite() {

		Hotel hotelObj = new Hotel();
		hotelObj.memberCount();
		if (hotelObj.adultCount + hotelObj.kidsCount > 8 || hotelObj.adultCount + hotelObj.kidsCount < 0) {
			System.out.println("The Family suite is not suitable for the number of guests entered.\n"
					+ "Please select again or select separate rooms one at a time");
			return false;
		} else {
			System.out.println("Family Room Selected");
		}
		return true;

	}

}
