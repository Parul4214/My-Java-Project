
public class EvenOdd {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		
//		
//		int num=20;
//		
//		if(num%2==0)
//			System.out.println("Number is even");
//		else
//			System.out.println("Number is odd");
//
//	}
//
	
	String checkEvenOdd(int num) {
	
		if(num%2==0)
			return "a";
			//System.out.println("Number is even");
		else
			return "b"; //System.out.println("Number is odd");	
	}
	
	void tablePrint(int x) {
	

		for (int a = 1; a <= 10; a++) {

			System.out.println(x + "x" + a + "=" + x * a);
		}
	}
	
}
