
public class AndOROperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		boolean hasSugar=true;
		boolean hasCream=true;
		boolean hasMilk=true;
		boolean hasTeaBags=false;
	boolean hasElectricity=true;
	
	if((hasMilk||hasSugar) && hasTeaBags && hasElectricity) {

		System.out.println("We can make tea");
	}else {
		
		System.out.println("We cannot drink tea");
	}

}
}
