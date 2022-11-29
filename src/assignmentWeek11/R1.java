// R1 Rocket
//Rocket cost = $100 Million
//Rocket weight = 10 Tonnes
//Max weight (with cargo) = 18 Tonnes
//Chance of launch explosion = 5% * (cargo carried / cargo limit)
//Chance of landing crash = 1% * (cargo carried / cargo limit)

package assignmentWeek11;

public class R1 extends Rocket {

	@Override
	public boolean launch() {
		double launchXploChance = 5 * ((r1RocketWeight - 10) / r1CargoLimit);
		System.out.println("launch Explosion chnaces	:" + launchXploChance + "%");
		return true;
	}
	
	@Override
	public boolean land() {
		double landCrashChance = 1 * ((r1RocketWeight - 10) / r1CargoLimit);
		System.out.println("Crash Landing chnaces		:" + landCrashChance + "%");
		return true;
	}

	

	

}
