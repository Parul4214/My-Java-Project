package assignmentWeek11;

public class Rocket implements Spaceship {

	
	int r1RocketCost = 100;
	int r2RocketCost = 120;
	int r1RocketWeight = 10;
	int r2RocketWeight = 18;
	int r1CargoLimit = 8;
	int r1MaxWeight = 18;
	@Override
	public boolean launch() {
		
		return true;
	}

	@Override
	public boolean land() {
		
		return true;
	}

	@Override
	public boolean canCarry(Item item) {
		if (((item.weight / 1000) + r1RocketWeight) <= r1MaxWeight) {
			return true;
		} else
			return false;
	}

	
	@Override
	public int carry(Item item) {
		r1RocketWeight = r1RocketWeight + (item.weight / 1000);
		System.out.println(item.name + " "+ (item.weight / 1000)+" tons loaded successfully==now weight " + r1RocketWeight);

		return r1RocketWeight;
	}

}


//Rocket cost = $100 Million
//Rocket weight = 10 Tonnes
//Max weight (with cargo) = 18 Tonnes
//Chance of launch explosion = 5% * (cargo carried / cargo limit)
//Chance of landing crash = 1% * (cargo carried / cargo limit)
