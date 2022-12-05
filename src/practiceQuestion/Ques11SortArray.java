package practiceQuestion;

public class Ques11SortArray {

	public static void main(String[] args) {
		int[] sampleArray = { 2, 8, 98, 200, 56, 3, -8, -42 };

		for (int i = 0; i < sampleArray.length; i++) {
			for (int j = i + 1; j < sampleArray.length; j++) {
				if (sampleArray[j] < sampleArray[i]) {
					int tempArray = sampleArray[j];
					sampleArray[j] = sampleArray[i];
					sampleArray[i] = tempArray;
				}
			}
		}
		for (int i = 0; i < sampleArray.length; i++)
			System.out.print(sampleArray[i] + " ");
	}
}
