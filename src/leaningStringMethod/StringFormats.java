//Write your first and Last name and replace Last name with *
//Print first name
//Find length of your name
//Just print your first name
//Replace all e with another character in your name

package leaningStringMethod;

public class StringFormats {

	public static void main(String[] args) {

		// Write your first and Last name and replace Last name with *

		String my_name = "Parul Verma";
		System.out.println("My updated name with hidden last name: " + my_name.substring(0, 5) + " " +  my_name.substring(6, 11).replaceAll("\\w", "*"));

		System.out.println(my_name.indexOf("Parul"));
		System.out.println(my_name.indexOf("Verma"));
				
		// Just print your first name
		String first_name = my_name.substring(0, 5);
		System.out.println("Print my First Name: "+ first_name);

		// Find length of your name

		System.out.println("Length of name is: " + (my_name.replace(" ", "")).length());

		// Replace all r with another character in your name
		
		System.out.println("Replaced name is: "+ my_name.replace("r", "h"));
		
	}

}
