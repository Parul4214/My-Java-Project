//To find max and minimum number in an array
package learnArray;

public class ArrayExample2 {

	public static void main(String[] args) {

		int[] givenValue = { -42, -10, 2, 6, 85 };
		int maxValue = 0;
		int minValue = givenValue[0];
		// for loop to input values
		for (int i = 0; i < givenValue.length; i++) {
			if (givenValue[i] > maxValue) {
				maxValue = givenValue[i];
			}
			if (givenValue[i] < minValue) {
				minValue = givenValue[i];
			}
		}
		System.out.println("Maximum value is :" + maxValue);
		System.out.println("Minimum value is :" + minValue);
	}
}