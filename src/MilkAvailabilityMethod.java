import java.util.Scanner;

public class MilkAvailabilityMethod {

	boolean isMilkAvailable()

	{
		System.out.println("Do you have Milk Avaialbilty: True / False");
		Scanner sc = new Scanner(System.in);
		boolean doYouHaveMilk = sc.nextBoolean();

		if (doYouHaveMilk) {
			return true;
		}
		return false;
	}

}
