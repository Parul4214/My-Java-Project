package learningHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LearnHashMap {

	public static void main(String[] args) {
		HashMap<String, String> exampleList = new HashMap<>();

		exampleList.put("001", "parul");
		exampleList.put("002", "Amar");
		exampleList.put("003", "Hello");
		exampleList.put("004", "World");

		//System.out.println(exampleList);

		for (Map.Entry<String, String> list : exampleList.entrySet()) {
			System.out.print(list.getKey() + " ");
			System.out.println(list.getValue() + " ");

		}
		
//		exampleList.remove("001");
//		System.out.println(exampleList);
//		exampleList.clone();
//		System.out.println(exampleList);
//		exampleList.clear();
//		System.out.println(exampleList);
		
//	exampleList.toString();
//	System.out.println(exampleList);
	}

}
