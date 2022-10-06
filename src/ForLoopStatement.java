
public class ForLoopStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int actual_capacity = 10;

		for (int consumed_drinks = 1; consumed_drinks <= actual_capacity; consumed_drinks++) {
			System.out.println("I can drink " + (actual_capacity - consumed_drinks) + " more times");
			if (consumed_drinks == actual_capacity) {

				System.out.println("Needs break now");
			} else {
				System.out.println("Keep enjoying your drinks");
			}
		}

	}

}
