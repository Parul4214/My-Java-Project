package practiceQuestion;

public class Ques8SmallestLargestArray {

	public static void main(String[] args) {

		int[] sampleArray = { 20, 2, 56, 98, 5, 7 };

		int minVal = sampleArray[0];
		int maxVal = 0;

		for (int i = 0; i < sampleArray.length; i++) {
			if (sampleArray[i] > maxVal) {
				maxVal = sampleArray[i];
			}
			if (sampleArray[i] < minVal) {
				minVal = sampleArray[i];
			}
		}
		System.out.println("Max val is: " + maxVal);
		System.out.println("Min val is: " + minVal);
	}
}
