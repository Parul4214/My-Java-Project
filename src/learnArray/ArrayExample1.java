//Find name in the list of an array and replace 'a' with 'e'

package learnArray;

public class ArrayExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaring a string type of array and with variable name nameList and
		// populated with elements in it
		String[] namelist = { "Parul", "Jasmeet", "Manvir", "Java" };

		// iterate over an array using for loop
		for (int i = 0; i < namelist.length; i++) {
			System.out.print(namelist[i] + "→ ");
			System.out.print(namelist[i].replace("a", "e") + "\n");
		}
	}
}
