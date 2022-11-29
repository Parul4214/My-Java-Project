package assignmentWeek11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

	public static ArrayList<Item> loadItems() {
		ArrayList<Item> itemListArray = new ArrayList<Item>();
		File fileRead = new File("C:\\Users\\romyk\\OneDrive\\Documents\\phase-1.txt");
		try (Scanner scn = new Scanner(fileRead)) {
			while (scn.hasNextLine()) {
				String itemRead = scn.nextLine();
				String[] splitString = itemRead.split("=");
				Item itemObj = new Item();
				// System.out.println(itemList);

				itemObj.name = splitString[0];
				itemObj.weight = Integer.valueOf(splitString[1]);
				itemListArray.add(itemObj);
//				System.out.println(itemObj.name);
//				System.out.println(itemObj.weight);
			}

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		}
		return itemListArray;
	}

	public static ArrayList<Item> loadU1(ArrayList<Item> itemsList) {
		ArrayList<Item> r1RocketCount = new ArrayList<Item>();
		
		
		
		while (itemsList.size() > 0) {
			System.out.println("\n============  new Rocket started loading =======");
		Rocket rocket1 = new R1();
		Item itemObj = new Item();
			for (int i = 0; i < itemsList.size(); i++) {
				if (rocket1.canCarry(itemsList.get(i))) 
				{
					rocket1.carry(itemsList.get(i));
					itemsList.remove(i);
				} 				
			}
			itemObj.weight=rocket1.r1RocketWeight;
			r1RocketCount.add(itemObj);
			//rocket1.launch();
			//rocket1.land();
		}
		return r1RocketCount;
	}

	public static ArrayList<Item> loadU2(ArrayList<Item> itemsList) {
		ArrayList<Item> r2RocketCount = new ArrayList<Item>();
		
		
		System.out.println("inside load u2:" + itemsList.size());
		while (itemsList.size() > 0) {
			System.out.println("\n============  new Rocket 2 started loading =======");
		Rocket rocket2 = new R2();
		Item itemObj = new Item();
			for (int i = 0; i < itemsList.size(); i++) {
				if (rocket2.canCarry(itemsList.get(i))) 
				{
					rocket2.carry(itemsList.get(i));
					itemsList.remove(i);
				} 				
			}
			itemObj.weight=rocket2.r2RocketWeight;
			r2RocketCount.add(itemObj);
			//rocket2.launch();
			//rocket2.land();
		}
		return r2RocketCount;
	}


	public void runSimulation(ArrayList<Item> rocketList) {
		System.out.println("inside simulation");
		for (int i = 0; i < rocketList.size(); i++) {
			Rocket rocket1 = new R1();
			rocket1.launch();
		}

	}
}
