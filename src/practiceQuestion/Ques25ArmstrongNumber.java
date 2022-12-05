package practiceQuestion;

import java.util.Scanner;

public class Ques25ArmstrongNumber {

	public static void main(String[] args) {
		
		System.out.println("number you want to check ");
		int num= 100;
		int arm=0;
		while (num<1000) {
			arm=armstrongNum(num);
			if(arm==num)
				System.out.println(num);
			num++;
		}}
	
		

		
	static int armstrongNum(int givenNum) {
		int tempNum=0 , remainder, armstrongNum=0;
		tempNum=givenNum;
						
		while(givenNum>0) {
			remainder=givenNum%10;
			armstrongNum=(remainder*remainder*remainder)+armstrongNum;
			givenNum=givenNum/10;
		}
		
		if(armstrongNum==tempNum) {
			//System.out.println("Number is armstrong number");
		}else {
			//System.out.println("Number is not armstrog number");
		}
		return armstrongNum;

	}

}
