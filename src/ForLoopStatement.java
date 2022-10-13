import java.util.Scanner;

public class ForLoopStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int actual_capacity = 10;

		for (int consumed_drinks = 1; consumed_drinks <= actual_capacity; consumed_drinks++) {
			System.out.println("I can drink " + (actual_capacity - consumed_drinks) + " more times");
			if (consumed_drinks == actual_capacity) {

				System.out.println("Needs break now \n\n\n");
			} else {
				System.out.println("Keep enjoying your drinks");
			}
		}
		
		int var=0;
		Scanner sc = new Scanner (System.in);
		EvenOdd myObj =new EvenOdd ();
		
		System.out.println("enter num");
		var= sc.nextInt();
		
	if(myObj.checkEvenOdd(var).equals("a"))
System.out.println("even");
	if(myObj.checkEvenOdd(var).equals("b"))
	System.out.println("odd");
		
		
		
		
		
		sc.close();
		

}
}
