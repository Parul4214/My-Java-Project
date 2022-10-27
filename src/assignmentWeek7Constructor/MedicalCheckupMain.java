package assignmentWeek7Constructor;

public class MedicalCheckupMain {

	public static void main(String[] args) {
		
		
		MedicalDetails medicaldetailsObj= new MedicalDetails(160, 59.9, 27);
		medicaldetailsObj.setAge(29);
		medicaldetailsObj.getAge();
		
		medicaldetailsObj.setweight(64);

	}

}
