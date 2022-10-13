import java.util.Scanner;

public class PhonePlans {

	//String return type with no arguments
	String os_selection() {
		int loop_flag = 2;
		String phone_brand = "Null";
		Scanner myObj = new Scanner(System.in);
		System.out.println("Please enter the Brand that you want to choose from: \n" + "Apple / Samsung");

		//loop used for valid input check, when any valid input received flag will turn o or 1 which will break the loop and program will continue further
		while (loop_flag == 2) {
			phone_brand = myObj.next();
			if (phone_brand.equals("Samsung"))
				loop_flag = 0;
			else if (phone_brand.equals("Apple"))
				loop_flag = 1;
			else
				System.out.println("Please Try Again - Apple or Samsung ??");
		}
		return phone_brand;
	}

	////////////////////// begining of method///////////////
	
	//this method receives string argument/ parameter, based on that it will ask user to select device from available models under that brand
	
	//return type with arguments
	int product_selection(String phone_brand) {

		Scanner myObj = new Scanner(System.in);
		int phone_model_flag = 10;			//flag value initialized to 10 for error checking/invalid input check

		if (phone_brand.equals("Samsung")) {
			// System.out.println("samsung selected");

			System.out.println(
					"Please select the model that you want to buy\n" + "S22 \n" + "S22+ \n" + "S22Ultra \n" + "S22FE");
			String phone_model = myObj.next();
			//based on user input switch to appropriate case
			switch (phone_model) {
			case "S22":
				phone_model_flag = 0;
				break;
			case "S22+":
				phone_model_flag = 1;
				break;
			case "S22Ultra":
				phone_model_flag = 2;
				break;
			case "S22FE":
				phone_model_flag = 3;
				break;
			default:
				System.out.println("Invalid entry. Try Again");
				phone_model_flag = 10;
				break;
			}
		}
		//if the received argument is APPLE ,continue with following code
		else if (phone_brand.equals("Apple")) {
			System.out.println("Please select the iPhone model that you want to buy\n" + "14 \n" + "14Pro \n"
					+ "14ProMax \n" + "14Mini");
			String phone_model = myObj.next();

			switch (phone_model) {
			case "14":
				phone_model_flag = 4;
				break;
			case "14Pro":
				phone_model_flag = 5;
				break;
			case "14ProMax":
				phone_model_flag = 6;
				break;
			case "14Mini":
				phone_model_flag = 7;
				break;
			default:
				System.out.println("Invalid entry. Try Again");
				phone_model_flag = 10;
				break;
			}

		}

		return phone_model_flag;		//if user make valid selection phone_model_flag will vary 0-7, any invalid input will turn flag 10
	}
	/////////////////////////// end of 2nd method///////////////////////////

		//this method is return type without argument 
	int service_selector() {
		int service_flag = 10;
		Scanner myObj = new Scanner(System.in);
		System.out.println("Please select the Service Provider: \n" + "Bell \n" + "Rogers \n" + "Telus");
		String service_selection = myObj.next();

			//compared the user input with appropriate case and update the flag accordingly
		switch (service_selection) {
		case "Rogers":
			service_flag = 0;
			break;
		case "Bell":
			service_flag = 1;
			break;
		case "Telus":
			service_flag = 2;
			break;
		default:
			service_flag = 10;		//invalid input check
			System.out.println("Invalid Entry, Try Again");
			break;
		}
		return service_flag;
	}

}
