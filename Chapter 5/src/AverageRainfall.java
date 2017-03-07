/**
 * 
 */

/**
 * @author jts5b_000
 *
 */
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;



public class AverageRainfall {

	public static void main(String[] args) {
		
		int years;												// Variable to hold the amount of years
		
		final int MONTHS = 12; 									// Constant to hold the amount of months in a year
		
		int totalMonths = 0;									// Months accumulator variable
		
		double monthlyRain;										// Holds the amount of rain in inches for each month
		
		double totalRainfall = 0;								// Holds the total rainfall
		
		NumberFormat df = DecimalFormat.getInstance();		    // Decimal formating
		df.setMaximumFractionDigits(2);			
		
		// Create Scanner object
		Scanner input = new Scanner(System.in);
		
		
		
		System.out.println("Enter the number of years: ");
		years = input.nextInt();
		
		do{
				System.out.println("error fam");
				
				System.out.println("Enter the number of years: ");
				years = input.nextInt();
			
		}while(years < 0);
		System.out.println("Enter the rainfall amount for each month ");
		// Construct for-loop for each year
		for(int i=0; i < years; i++){
			for(int j=1; j<MONTHS+1; j++){
				
				
				System.out.println("Enter Rain for month " + j);
				monthlyRain = input.nextDouble();
				while(monthlyRain < 0){
					System.out.println("Enter Rain for month " + j);
					monthlyRain = input.nextDouble();
				}
				totalRainfall += monthlyRain;
			}
			totalMonths += MONTHS;
		}
		
		double avgRainfall = totalRainfall/totalMonths;		// Holds the average rainfall
		
		// Newline1
		System.out.println("");
		// Display rainfall data
		System.out.println("Total Months: " + totalMonths + "\nTotal Rainfall: " + df.format(totalRainfall) + " inches" +
				"\nAverage Rainfall: " + df.format(avgRainfall) + " inches");
	}
}