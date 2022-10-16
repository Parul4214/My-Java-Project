import java.util.Scanner;

public class MilkAvilabiltyMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// boolean doYouHaveMilk=sc.hasNext();
		// instantiating the class using reference variable myObj

		MilkAvailabilityMethod milkavailableObj = new MilkAvailabilityMethod();

		boolean check_availability = milkavailableObj.isMilkAvailable();
		if (check_availability)
			System.out.println("Milk available");
		else if (!check_availability)
			System.out.println("Sorry !!! No more milk");

	}
}
