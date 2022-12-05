package practiceQuestion;

import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		ArrayList<Item> cars = new ArrayList<Item>();
		
		String[] names = { "volvo", "Honda", "Mazda", "Toyota", "Land rover" };
		int[] prices = {100,200,300,400,500};
		
		for (int i = 0; i < 5; i++) {
			Item item1 = new Item(names[i], prices[i]);
			cars.add(item1);
		}
		Item item1 = new Item("amar",123123);
		cars.add(2,item1);

		for (int i = 0; i < cars.size(); i++) {

			System.out.print(cars.get(i).getName() + " ");
			System.out.println(cars.get(i).getWeight());

		}
		cars.remove(2);
		for (int i = 0; i < cars.size(); i++) {

			System.out.print(cars.get(i).getName() + " ");
			System.out.println(cars.get(i).getWeight());

		}
		System.out.println("size of itmlist  " + cars.size());

	
	
	
	
	
	
	
//	ArrayList<Integer> values = new ArrayList<>();
//	
//	values.add(10);
//	values.add(20);
//	values.add(15);
//	values.add(16);
//	values.add(12);
//	values.add(11);
//	values.add(5);
//	values.add(89);
//	values.add(45);
//	values.add(56);
//	values.add(23);
//	values.add(13);
//	values.add(4);
//	values.add(78);
//	
//	//while(values.size()>0)
//	int tempvar = values.get(0);
//	
//	
//		//System.out.println(values);
//		
//	for(int i=0; i< values.size();i++)
//		if(values.get(i)<tempvar)
//			tempvar=values.get(i);
//	
//	System.out.println("smallest number is " + tempvar);
//	
	}

}
