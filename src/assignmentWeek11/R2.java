//Rocket-2 (R-2)
//The R2 Rocket heavier than the R-1 but much safer and can carry a lot more cargo with the following features 
//•	Can carry to a total of 29 tonnes. 
//•	It costs $120 Million to build
//•	Weighs 18 tonnes. 
//•	It has a greater chance of crashing while landing than while launching, but just like the R-1 both chances depend on the amount of cargo carried.
//

package assignmentWeek11;

public class R2 extends Rocket{
	
	@Override
	public boolean launch() {
		double launchXploChance = 4 * ((r1RocketWeight - 10) / r1CargoLimit);
		System.out.println("launch Explosion chnaces	:" + launchXploChance + "%");
		return true;
	}
	
	@Override
	public boolean land() {
		double landCrashChance = 8 * ((r1RocketWeight - 10) / r1CargoLimit);
		System.out.println("Crash Landing chnaces		:" + landCrashChance + "%");
		return true;
	}

}
