
public class DivisionBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1= 15;
		int num2= 18;

		if(num1%3==0 && num2%3==0)
			System.out.println("both numbers divisible by 3");
		if(num1%3!=0 && num2%3!=0)
			System.out.println("both numbers are not divisible by 3");
		if(num1%3==0 && num2%3!=0)
			System.out.println("Num1 is divisible by 3 but num2 is not");
		if(num1%3!=0 && num2%3==0)
			System.out.println("Num1 is not divisible by 3 but num2 is divisible");
	
	}

}
