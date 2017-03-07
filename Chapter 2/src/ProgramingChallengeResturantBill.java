import java.util.Scanner;
public class ProgramingChallengeResturantBill {

	public static void main(String[] args) {
		
		//Declare variables
		Scanner scanner = new Scanner(System.in);
		double mealCost;
		double tax;
		double totalCost;
		double tip;
		double totalBill;
		
		System.out.println("Enter the cost of the meal: " );
		mealCost = scanner.nextDouble();
		
		//calculate tax
		tax = 7.5 * mealCost;
		
		totalCost = mealCost + tax;
		tip = 0.18 * totalCost;
		
		totalBill = totalCost + tip;
		
		System.out.println("Cost of meal: $ " + mealCost);
		System.out.println("Tax: $ " + tax);
		System.out.println("Tip: $ " + tip);
		System.out.println("Total Bill: $ " + totalBill);
	}

}
