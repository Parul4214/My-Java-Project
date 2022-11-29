package practiceQuestion;

import java.util.Scanner;

public class ReversePalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a name you want to check");

		String name = sc.nextLine();
		System.out.println(name);
		String reverseName = "";

		////////////// Using String concatenation operator//////////////////////

//		for (int i=name.length()-1; i>=0; i--) {
//			reverseName=reverseName+name.charAt(i);
//			System.out.println(reverseName);
//	}
//		
//		if(name.equalsIgnoreCase(reverseName)) {
//			System.out.println("String is Palindrome");
//		}else {
//			System.out.println("String is not Plaindrome");
//		}
		/////////////// Using character array////////////////////////////

//		char[] stringTochar=name.toCharArray();
//		int length=stringTochar.length;
//		
//		for(int i=length-1; i>=0; i--) {
//			reverseName=reverseName+stringTochar[i];
//			System.out.println(reverseName);
//		}

		////////////////// Using String buffer Class/////////////

		StringBuffer sb = new StringBuffer(name);
		// StringBuffer revName= sb.reverse();
		String rev = String.valueOf(sb.reverse());

		System.out.println(rev);

		if (name.equalsIgnoreCase(rev)) {
			System.out.println("String is palidrome");
		} else {
			System.out.println("String is not palindrome");
		}

	}
}
