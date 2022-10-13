
public class ChocolateProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 5 chocolates to a box which already has 27 chocolate

		for (int chocolate = 27; chocolate <= 63; chocolate = chocolate + 5) {

			if (chocolate == 27)
				System.out.println("Initially " + chocolate + " chocolates in box");
			else
				System.out.println(" 5 more chocolates added, current total is " + chocolate);
			if (chocolate + 5 > 63)
				System.out.println("No more chocolates can be added");
		}
	}
}
