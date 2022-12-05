package learnCasting;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal animal = new Lion();// upcasting

		animal.eat();
		animal.sleep();

		//downcasting
		
		//when we want to access from child class with parents class ref variable
		Lion lion = (Lion) animal; // Java doesn't know that it is pointing to lion class so we have to add cast
		lion.eat();
		lion.sleep();
		lion.roar();
		
		lion.tempControl();
		
		
	//	Mammal mammal =new Mammal();
		
		Mammal mammal= new Lion();		
		((Lion) mammal).roar();
	}
	
	
	

}
