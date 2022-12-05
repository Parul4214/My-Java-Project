package practiceQuestion;

public class Ques4ArrayDescendingOrder {

	public static void main(String[] args) {

		int[] sampleArray = { 2, 7, 10, 5, 4, 98, 43 };

		for (int i = 0; i < sampleArray.length; i++) {
			for (int j = i + 1; j < sampleArray.length; j++) {

//					if(sampleArray[i]>sampleArray[j]) {
//						int tempVar=sampleArray[j];
//						sampleArray[j]=sampleArray[i];
//						sampleArray[i]=tempVar;

				if (sampleArray[i] < sampleArray[j]) {
					int tempVar = sampleArray[j];
					sampleArray[j] = sampleArray[i];
					sampleArray[i] = tempVar;

				}
			}

		}
		for (int i = 0; i < sampleArray.length; i++)
			System.out.print(sampleArray[i] + " ");

	}

}
