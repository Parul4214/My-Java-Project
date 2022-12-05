package practiceQuestion;

public class Ques3MaxNumArray {

	public static void main(String[] args) {
	
		int[] numValue= {60, 50, 40, 10 , 100, 120};
		
		int maxvalue=0;
		int minValue=numValue[0];
		
		
		for(int i=0; i<numValue.length; i++) {
			 
			if(numValue[i]>maxvalue) {
				maxvalue=numValue[i];
			}
			if (numValue[i]<minValue) {
				minValue=numValue[i];
			}
			
		}
		System.out.println("Maximum value of the array is: "+ maxvalue);
		System.out.println("Minimum value of the array is: "+ minValue);

	}

}
