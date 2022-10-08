
public class bucketProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// fills the tank to its capacity using 10L bucket
	int tank_capacity=100;
	int bk_capacity = 10;

		for (int bk_counter = 0; bk_capacity*bk_counter <= tank_capacity; bk_counter ++) {
			System.out.println("Water filled " + ( bk_capacity*bk_counter) + " Liters");
				if(bk_capacity*bk_counter >= tank_capacity)
					System.out.println("Tank full");
		}
	}

}
