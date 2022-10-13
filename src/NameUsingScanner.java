import java.util.Scanner;

//To print name using scanner class

public class NameUsingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String my_Name = "";
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter your name");
		my_Name = sc.next();

		System.out.println(my_Name);
	}

}
