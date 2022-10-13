import java.util.Scanner;

//To add 3 number and store in 4th number
public class UseScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 0;
		int y = 0;
		int z = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter first number");
		x = sc.nextInt();

		System.out.println("Please enter second number");
		y = sc.nextInt();

		System.out.println("Please enter third number");
		z = sc.nextInt();

		int num = x + y + z;
		System.out.println("Here is the result " + num);

	}

}
