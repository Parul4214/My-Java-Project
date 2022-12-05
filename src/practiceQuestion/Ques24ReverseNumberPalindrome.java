package practiceQuestion;

import java.util.Scanner;

public class Ques24ReverseNumberPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number");

		int num = sc.nextInt();
		
		int originalNum=num;

		int reverseNum = 0;
		System.out.println(num);
       ////////////////////Using algorithm/////////////
		while (num != 0) {

			reverseNum = reverseNum * 10 + num % 10; 
			num = num / 10; 
		}
		System.out.println(reverseNum);
		
		if(originalNum==reverseNum) {
			System.out.println("Number is Palindrome");
		}else {
			System.out.println("Number isn't Palindrome");
		}
		///////USing String Buffer Class///////////////
		
//		StringBuffer sb= new StringBuffer(String.valueOf(num));
//		String reverse=String.valueOf(sb.reverse());
//		System.out.println(reverse);
//		
//		if(String.valueOf(num).equalsIgnoreCase(reverse)) {
//			System.out.println("Number is Palindrome");
//		}else {
//			System.out.println("Number isn't palindrome");
//		}
		
		//////////////////using Strig Builder Class///////////////
		
		StringBuilder sbuild=new StringBuilder();
		String numSting= String.valueOf(sbuild.append(num));
		String reverse=String.valueOf(sbuild.reverse());
		System.out.println(reverse);
		
//		if(numSting.equalsIgnoreCase(reverse)) {
//			System.out.println("Number is palindrome");
//		}else {
//			System.out.println("Num isn't palindrome");
//		}
//	}
	}
}
