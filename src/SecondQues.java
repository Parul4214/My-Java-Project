
public class SecondQues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// write a prog to replace a with e

		String[] nameList = { "ram", "Sham", "Peter", "thomas" };

		System.out.println("replace a with e ");

		for (int i = 0; i < nameList.length; i++) {
			
			System.out.println(nameList[i].replaceAll("a", "e"));
		}
	}

}
