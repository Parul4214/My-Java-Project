
public class CRScalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edu_points = 0;
		int expr_points = 0;
		int age_points = 0;
		int ielts_points = 0;
		int adapt_points = 0;
		int total_points = 0;

		CRScalculatorMethods crsObj = new CRScalculatorMethods();

	try {	edu_points = crsObj.crs_education();
		while (edu_points == 555)
			edu_points = crsObj.crs_education();
		System.out.println("Education points =" + edu_points);

		expr_points = crsObj.crs_expr();
		while (expr_points == 555)
			expr_points = crsObj.crs_expr();
		System.out.println("Experience points : " + expr_points);

		age_points = crsObj.crs_age();
		while (age_points == 555)
			age_points = crsObj.crs_age();
		System.out.println("Age points : " + age_points);

		ielts_points = crsObj.crs_ielts();
		while (ielts_points == 555)
			ielts_points = crsObj.crs_ielts();
		System.out.println("IELTS points : " + ielts_points);

		adapt_points = crsObj.crs_adaptability();
		while (adapt_points == 555)
			adapt_points = crsObj.crs_adaptability();
		System.out.println("Adapt point : " + adapt_points);
		
		 total_points=edu_points+expr_points+age_points+ielts_points+adapt_points;
		 System.out.println("Total Points :" + total_points);
		 if(total_points>=67)
		 System.out.println("You qualify to submit an Expression of Interest (EOI) to Immigration Canada");
		 else 
			 System.out.println("You do not meet the eligibility criteria");
	}
	catch (Exception e) {
		System.out.println("Invalid input, Start Over \n"
				+ "Please make valid selection (CASE SENSITIVE)");
	}
	}
	

}
