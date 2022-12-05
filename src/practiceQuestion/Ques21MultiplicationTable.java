package practiceQuestion;

import java.util.Scanner;

public class Ques21MultiplicationTable {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter any number");
		int num=sc.nextInt();
		
		for(int i=0; i<=10; i++) {
			System.out.println(num + " x " + i + " = " + (num*i));
		}
	}

}
