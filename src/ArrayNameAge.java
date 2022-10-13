//To print name and age

public class ArrayNameAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ageList = { 5, 10, 20 };
		String[] nameList = { "Jasmeet", "Lekshmi", "Parul" };
		
		//System.out.println(nameList[0]);
		
		//System.out.println("Age of " + nameList[2] + " is "+ (ageList[0] + ageList[2]));
		
	/*	for(int i=1; i<=nameList.length; i++)
			System.out.println(nameList[i-1]);
*/
		/*if(nameList.length<=0)
			System.out.println("Print reverse order");*/
		for(int i=nameList.length-1;i>=0; i--)
			System.out.println(nameList[i]);
		
		
		
	}

}
