import java.util.Scanner;

//Create a String Array with repetitive element based upon the count present in element
//Take input from scanner and check if name is present and how many time name is present

public class RepetitiveNameArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int counter = 0;

		String[] class_names = { "Parul", "Jasmeet", "Harinder", "Parul", "Shanthi", "Parul", "Harinder" };
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Please enter the Name (CASE SENSITIVE)");
		String entered_name = sc.next();
		// System.out.println(entered_name);

		// for loop limit depends on array length

		for (int index_i = 0; index_i < class_names.length; index_i++) {

			if (entered_name.equals(class_names[index_i])) // When Parul matches with any of class name array
				counter++; // if condition met, count will increment by 1
		}
		if (counter != 0) {
			System.out.println("Given Name is Present " + counter + " times");
		} else {
			System.out.println("Given Name is not Present");
		}

	}

}
