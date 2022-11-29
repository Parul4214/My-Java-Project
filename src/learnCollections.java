import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class learnCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> accountList = new HashMap<>();

		accountList.put("1111", "parul");
		accountList.put("2222", "jasmeet");
		accountList.put("3333", "harjot");
		accountList.put("4444", "aman");
		System.out.println(accountList.get("3333"));

		System.out.println(accountList);

		accountList.put("3333", "raman");

		System.out.println(accountList.get("3333"));
/////////////////////////////	// iterate through Hashmap entry set ////////////////////////////////////////////////
		for (Map.Entry<String, String> set : accountList.entrySet()) {
			System.out.println(set.getKey() +" "+ set.getValue());
		}

		// using keyset and value iteration over keys and values
///////////////////////////////////////////////////////////////////////////////
		for (String i : accountList.keySet()) {
			System.out.println(i);
		}

		for (String name : accountList.values()) {
			System.out.println(name);
		}
		
		

	}

}
