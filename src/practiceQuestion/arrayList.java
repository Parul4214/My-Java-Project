package practiceQuestion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class arrayList {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(10);
		list.add(5);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list); // print the sorted list

		ArrayList<String> nameList = new ArrayList<>();

		nameList.add("Parul");
		nameList.add("Amar");
		nameList.add("Aman");
		nameList.add("Harjot");
		System.out.println(nameList);
		System.out.println(nameList.get(2));

		ArrayList<Item> cars = new ArrayList<Item>();

		String[] names = { "volvo", "Honda", "Mazda", "Toyota", "Land rover" };
		int[] prices = { 100, 200, 300, 400, 500 };

		for (int i = 0; i < 5; i++) {
			Item item1 = new Item(names[i], prices[i]);
			cars.add(item1);
		}
		Item item1 = new Item("amar", 123123);
		cars.add(2, item1);

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
		ArrayList<Integer> values = new ArrayList<>();

		values.add(10);
		values.add(20);
		values.add(15);
		values.add(16);
		values.add(12);
		values.add(11);
		values.add(5);
		values.add(89);
		values.add(45);
		values.add(56);
		values.add(23);
		values.add(13);
		values.add(4);
		values.add(78);

		// while(values.size()>0)
		int tempvar = values.get(0);

		// System.out.println(values);

		for (int j = 0; j < values.size(); j++)
			if (values.get(j) < tempvar)
				tempvar = values.get(j);

		System.out.println("smallest number is " + tempvar);
	}
}
