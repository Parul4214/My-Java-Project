package assignmentWeek11;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Simulation simObj= new Simulation();
		ArrayList<Item> itemListArray = new ArrayList<Item>();
		
		
		itemListArray = Simulation.loadItems();
		
		ArrayList<Item> r1List = new ArrayList<Item>();
		r1List= Simulation.loadU1(itemListArray);
		simObj.runSimulation(r1List);
		
		
		ArrayList<Item> r2List = new ArrayList<Item>();
		r2List= Simulation.loadU2(itemListArray);
		simObj.runSimulation(r2List);
		
	
	}

}
