import java.util.Scanner; //import the scanner class
public class ProgramingChallenge8 {

	public static void main(String[] args) {

		//declare variables
		final double stateTaxPercent = 0.055;
		final double countyTaxPercent = 0.02;
		double purchaceAmount;
		double countyTax;
		double stateTax;
		double totalTax;
		double totalSale;
		
		//creating a scanner object
		Scanner scanner = new Scanner( System.in);
		
		//Gets input data
		System.out.println("Please enter a purchase amount:" );
		purchaceAmount = scanner.nextDouble();
		
		//Calculate county tax
		countyTax = countyTaxPercent * purchaceAmount;
		
		//Calculate county state 
		stateTax = stateTaxPercent * purchaceAmount;
		
		//Calculate total tax
		totalTax = stateTax;
		
		//Calculate total sale
		totalSale = totalTax + purchaceAmount;
		
		//Display output
		System.out.println("Purchase amount:" + purchaceAmount + "\n State Sales Tax:" + stateTax +
				"\n County Sales Tax:" + countyTax  +"\n Total Sales Tax:" + totalTax + "\n Total Sale:" + totalSale);
		

		
	}

}
