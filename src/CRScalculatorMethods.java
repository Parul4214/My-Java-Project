import java.util.Scanner;

public class CRScalculatorMethods {

//	PhD	25
//	Master’s Degree	23
//	Two or more university degrees/diplomas at the bachelor’s level one of which is a three year or longer duration 	22
//	12th+ Three Years or longer Degree /Diploma	21

	int crs_education() {
		int edu_points = 0;
		System.out.println("Choose your Education Level:\n" + "1: PhD \n" + "2: Master’s Degree \n"
				+ "3: Two or more university degrees/diplomas \n" + "4: 12th+ Three Years or longer Degree /Diploma");
		Scanner myObj = new Scanner(System.in);
		int edu_input = myObj.nextInt();
		switch (edu_input) {
		case 1:
			edu_points = 25;
			break;
		case 2:
			edu_points = 23;
			break;
		case 3:
			edu_points = 22;
			break;
		case 4:
			edu_points = 21;
			break;
		default:
			System.out.println("invalid entry, Make valid selection");
			edu_points = 555;
			break;
		}
		return edu_points;
	}

	int crs_expr() {
		int expr_points = 0;
		System.out.println("Enter your Experience in years:");
		Scanner myObj = new Scanner(System.in);
		int expr_input = myObj.nextInt();
		if (expr_input >= 0 && expr_input <= 3)
			expr_points = 0;
		else if (expr_input >= 4 && expr_input <= 5)
			expr_points = 13;
		else if (expr_input >= 6)
			expr_points = 15;
		else
			expr_points = 555;
		return expr_points;
	}

	//////////////////////////////////////////////////////////////////////////////

	int crs_age() {
		int age_points = 0;
		System.out.println("Enter your age in years: ");
		Scanner myObj = new Scanner(System.in);
		int age_input = myObj.nextInt();

		if (age_input >= 0 && age_input <= 17)
			age_points = 0;
		else if (age_input >= 18 && age_input <= 35)
			age_points = 12;
		else if (age_input > 36 && age_input <= 47)
			age_points = 47 - age_input;
		else if (age_input > 47)
			age_points = 0;
		else
			age_points = 555;
		return age_points;
	}

//	MODULE	SCORE&POINT	SCORE&POINT
//	LISTENING	8 & above 6 pts	7.5 -5pts
//	SPEAKING	7 & above 6 pts	6.5 -5pts
//	READING	7 & above 6 pts	6.5 -5pts
//	WRITING	7 & above 6 pts	6.5 -5pts

	int crs_ielts() {
		int ielts_points = 0;
		System.out.println("Enter your IELTS Score for Listening :");
		Scanner myObj = new Scanner(System.in);
		double listening_score = myObj.nextDouble();
		if (listening_score >= 8 && listening_score <= 9) {
			ielts_points = ielts_points + 6;
		} else if (listening_score == 7.5) {
			ielts_points = ielts_points + 5;
		}

		System.out.println("Enter your IELTS Score for Speaking :");
		double speaking_score = myObj.nextDouble();
		if (speaking_score >= 7 && speaking_score <= 9) {
			ielts_points = ielts_points + 6;
		} else if (speaking_score == 6.5) {
			ielts_points = ielts_points + 5;
		}

		System.out.println("Enter your IELTS Score for Reading :");
		double reading_score = myObj.nextDouble();
		if (reading_score >= 7 && reading_score <= 9) {
			ielts_points = ielts_points + 6;
		} else if (reading_score == 6.5) {
			ielts_points = ielts_points + 5;
		}

		System.out.println("Enter your IELTS Score for Writing :");
		double writing_score = myObj.nextDouble();
		if (writing_score >= 7 && writing_score <= 9) {
			ielts_points = ielts_points + 6;
		} else if (writing_score == 6.5) {
			ielts_points = ielts_points + 5;
		}

		return ielts_points;

	}

//	if you have a relative  in Canada(Parents, Grand Parents, Brother, Sister, Aunt, Uncle, Nephew or Niece) who is a Canadian Citizen or PR holder, we will score 5 points 
//	Study in Canada for two years will score 5 points
//	Work in Canada for one year at NOC 0, A, B will score 10 points
	

	int crs_adaptability() {
		int adapt_points = 0;
		int rel_points = 0;
		int study_points = 0;
		int work_points = 0;
		Scanner myObj = new Scanner(System.in);
		
		
		System.out.println("if you have a relative  in Canada(Parents, Grand Parents, Brother, Sister, Aunt, Uncle, Nephew or Niece) who is a Canadian Citizen or PR holder, we will score 5 points ");
		String relatives_input=myObj.next();
		
		while(!(relatives_input.equals("Y") || relatives_input.equals("N"))) {
			System.out.println("Invalid input. Please select Y/N ");
			relatives_input=myObj.next();

		}
		if	(relatives_input.equals("Y"))
				rel_points=5;
		
		
		System.out.println("Study in Canada for two years (Y/N)");
		String study_input=myObj.next();
		
		while(!(study_input.equals("Y") || study_input.equals("N"))) {
			System.out.println("Invalid input. Please select Y/N ");
			study_input=myObj.next();
		}	
		if(study_input.equals("Y"))
			study_points=5;
		
		System.out.println("Work in Canada for one year at NOC 0, A, B (Y/N)");
		String work_input=myObj.next();
		

		while(!(work_input.equals("Y") || work_input.equals("N"))) {
			System.out.println("Invalid input. Please select Y/N ");
			work_input=myObj.next();
		}	
		if(work_input.equals("Y"))
			work_points=5;

		adapt_points = rel_points + study_points + work_points;
		return adapt_points;
	

}
}