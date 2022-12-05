//To sort an array
package learnArray;

public class ArrayExample3 {

	public static void main(String[] args) {

		int[] givenArray = { -50, -10, 2, 5, 89 };
		int tempArray;

		// for loop for input
		for (int i = 0; i < givenArray.length; i++) {
			// for inside for to compare elemets of an array
			for (int j = i + 1; j < givenArray.length; j++) {
				if (givenArray[j] < givenArray[i]) {
					tempArray = givenArray[j];
					givenArray[j] = givenArray[i];
					givenArray[i] = tempArray;
				}
			}
		}
			// for loop for output
			for (int i = 0; i < givenArray.length; i++) {
				System.out.print(givenArray[i] + " ");
			}
		}
	}

