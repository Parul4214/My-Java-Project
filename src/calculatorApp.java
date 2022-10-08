
public class calculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 4;
		int b = 7;

		String calculator = "/";

		switch (calculator) {
		case "+":
			System.out.println(a + "+" + b + "=" + (a + b));
			break;
		case "-":
			System.out.println(a + "-" + b + "=" + (a - b));
			break;
		case "*":
			System.out.println(a + "*" + b + "=" + (a * b));
			break;
		case "/":
			System.out.println(a + "/" + b + "=" + (a / b));
			break;
		default:
			break;
		}

	}

}
