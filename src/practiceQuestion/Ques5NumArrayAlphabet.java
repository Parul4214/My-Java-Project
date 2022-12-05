package practiceQuestion;

public class Ques5NumArrayAlphabet {

	public static void main(String[] args) {
		int[] numAray = { 1, 2, 3, 4, 5 };
		char[] chrArray = { 'a', 'b', 'c', 'd', 'e' };

		System.out.println("NumArray : ");

		for (int i = 0; i < numAray.length; i++) {
			System.out.print(numAray[i] + " ");
			numAray[i] = chrArray[i];
		}

		System.out.println("\nConverted array from number to alphabet : ");
		for (int j = 0; j < numAray.length; j++) {
			System.out.print((char) numAray[j] + " ");
		}
	}
}
