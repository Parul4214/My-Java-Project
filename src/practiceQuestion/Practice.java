package practiceQuestion;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int armStrong = 0;
		System.out.println("Eneter the number you want to check ");
		int num = sc.nextInt();
		int tempNum=num;

		while (num > 0) {
			int remainder = num % 10;
			armStrong = (remainder * remainder * remainder) + armStrong;
			num = num / 10;
		}
		if(armStrong==tempNum) {
			System.out.println("Num is arm");
		}else {
			System.out.println("num is not arm");
		}
		
	}
}