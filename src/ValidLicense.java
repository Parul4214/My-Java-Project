
public class ValidLicense {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=18;
		
		String Curr_lic ="G1";
		String Level_G1 = "G1";
		String Level_G2 = "G2";
		String Level_G = "G";
		
		
		if(age>=18) {
			if(Curr_lic.equals(Level_G1))
				System.out.println("G2 can be issued");
			 if(Curr_lic.equals(Level_G2))
				System.out.println("G can be issued");
			  if(Curr_lic.equals(Level_G))
				System.out.println("Already have full license");
			else
				System.out.println("invalid entry");
		

	}
		else
			System.out.println("License cannot be issued under age of 18");


	}

}
