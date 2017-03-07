
public class ProgramingChallengeEnergyDrinkComsumption {

	public static void main(String[] args) {
		
		//declare variables
		int survyedCustomers = 15000;
		double energyDrinkCustomers = 0.18 * survyedCustomers;
		double citrusFlavoredCustomers = 0.58 * energyDrinkCustomers;
		
		//out put
		System.out.println("Out of " + survyedCustomers + " customers, " + (int)energyDrinkCustomers + " buy one or two energy " + "drinks. And out of those " + 
		(int)citrusFlavoredCustomers + " prefer citrus flavored energy drinks ");
		

	}

}
