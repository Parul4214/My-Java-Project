
public class PhonePlanMethodCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// All the product prices and their names are stored in corresponding arrays for
		// further use
		int[] prod_price = { 25, 35, 55, 20, 30, 40, 65, 25 };
		String[] prod_name = { "Samsung S22", "Samsung S22+", "Samsung S22 Ultra", "Samsung S22FE", "Iphone 14",
				"Iphone 14 Pro", "Iphone 14 Pro Max", "Iphone 14 Mini", };
		int[] service_provider_price = { 70, 80, 75 };
		String[] service_provider_name = { "Rogers", "Bell", "Telus" };

		// Phone plan class instantiated with reference variable phoneObj
		PhonePlans phoneObj = new PhonePlans();

		// os selection method invoked using reference variable and stored in new
		// variable of string type
		String os_var = phoneObj.os_selection();

		// method invoked by passing string received in previous method return
		int prod_flag = phoneObj.product_selection(os_var);
		while (prod_flag == 10) // loop used to keep asking user for correct input and code will not move
								// further until user give any possible valid input
			prod_flag = phoneObj.product_selection(os_var);

		int service_provider_flag = phoneObj.service_selector();
		while (service_provider_flag == 10) // valid input check
			service_provider_flag = phoneObj.service_selector();

		System.out.println(
				"You have selected " + prod_name[prod_flag] + " with " + service_provider_name[service_provider_flag]);
		System.out.println("Your Phone Tab will be    :$ " + prod_price[prod_flag]);
		System.out.println("Your Monthly Plan will be :$ " + service_provider_price[service_provider_flag]);
		System.out.println("Total Monthly Amount      :$"
				+ (prod_price[prod_flag] + service_provider_price[service_provider_flag]));

	}

}
