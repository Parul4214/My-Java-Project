package assignmentWeek7Constructor;

import java.text.DecimalFormat;

public class RevisedCruisePackageMain {

	public static void main(String[] args) {
		
		RevisedCruiseDetails scenic_cruise= new RevisedCruiseDetails("Scenic Cruise",43.99,12.99,3);
		RevisedCruiseDetails sunset_cruise= new RevisedCruiseDetails("Sunset Cruise",52.99,15.99,1);
		RevisedCruiseDetails discovery_cruise=new RevisedCruiseDetails("Discovery Cruise",39.99,9.99,4);
		RevisedCruiseDetails mystery_cruise=new RevisedCruiseDetails("Mystery Cruise",45.99,12.99,2);
		
		//Creating array of object
		
		RevisedCruiseDetails[] cruiseDatabase= {scenic_cruise, sunset_cruise, discovery_cruise,mystery_cruise};
		

		
		
		
		
		
		
	}

}
