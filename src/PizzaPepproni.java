//a program to prepare the bill for a pizza shop

import java.util.Scanner;

public class PizzaPepproni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double final_bill = 0;// to calculate fractional value
		int pepproni_flag = 2;
		int cheese_flag = 2;

		Scanner myObj = new Scanner(System.in); // object used to access scanner class

		System.out.println("Choose Pizza Size: \n" + "Small :S \n" + "Medium:M \n" + "Large :L");
		String pizza_size = myObj.nextLine(); // string type input from user
		if (pizza_size.equals("S") || pizza_size.equals("M") || pizza_size.equals("L"))

		{
			while (pepproni_flag == 2) {
				System.out.println("Want Pepproni ? \n" + "Yes: Y \n" + "No : N");
				String pepproni = myObj.nextLine();
				if (pepproni.equals("Y"))
					pepproni_flag = 1;
				else if (pepproni.equals("N"))
					pepproni_flag = 0;
				else
					System.out.println("Invalid Selection, Press Y for Yes or N for No");

			}

			while (cheese_flag == 2) {
				System.out.println("Want Cheese ? \n" + "Yes: Y \n" + "No : N");
				String cheese = myObj.nextLine(); // getting input from user
				if (cheese.equals("Y"))
					cheese_flag = 1;
				else if (cheese.equals("N"))
					cheese_flag = 0;
				else
					System.out.println("Invalid Selection, Press Y for Yes or N for No");
			}

			if (cheese_flag == 1)
				final_bill = final_bill + 1;
		}

		myObj.close(); // all the inputs received from user, scanner class closed

		switch (pizza_size) {

		case "S":
			System.out.print("Small Pizza Selected ");
			final_bill = final_bill + 15;
			if (pepproni_flag == 1) {
				System.out.print("with pepproni ");
				final_bill = final_bill + 2;
			}
			if (cheese_flag == 1)
				System.out.print("with extra cheese");

			break;

		case "M":
			System.out.print("Medium Pizza Selected ");
			final_bill = final_bill + 20;
			if (pepproni_flag == 1) {
				System.out.print("with pepproni ");
				final_bill = final_bill + 3;
			}
			if (cheese_flag == 1)
				System.out.print("with extra cheese");
			break;

		case "L":
			System.out.print("Large Pizza Selected ");
			final_bill = final_bill + 25;
			if (pepproni_flag == 1) {
				System.out.print("with pepproni ");
				final_bill = final_bill + 3;
			}
			if (cheese_flag == 1)
				System.out.print("with extra cheese");
			break;

		default:
			System.out.println("\nInvalid Selection, Start over again");
			break;
		}
		if (final_bill != 0)
			System.out.println("\nFinal Bill is: $" + final_bill);

	}

}
