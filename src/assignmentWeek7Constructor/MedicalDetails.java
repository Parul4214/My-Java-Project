package assignmentWeek7Constructor;

public class MedicalDetails {
	
	private int height;
	private double weight;
	private int age;
	public MedicalDetails(int height, double weight, int age) {
		
		this.height = height;
		this.weight = weight;
		this.age = age;
	}
	public void setAge(int newAge) {
		this.age=newAge;
	
	}
	public void getAge() {
		this.age = age;
		
		System.out.println("New age updated: "+ age);
	}
	
	public void setweight(int newWeight) {
		this.weight=weight;
		if(newWeight>weight){
							System.out.println("Please focus on diet and do more physical activity");
			}else {
				System.out.println("You are healthy");
			}
		
	
	}
}
		


