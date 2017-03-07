import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;




public class PenniesForPay {

	public static void main(String[] args, Scanner input) {
		// Declare var to store number of days worked
		int numDays = 0;
		
		// User salary
		double salary = 0.01;
	    double totalSalary = 0.01;
		
		// Create scanner object
		Scanner keyboard = new Scanner(System.in);
		
		
		
	    	
	    
		while (numDays <= 0);{
			System.out.println("error fam");
			
			System.out.println("Enter the number of years: ");
			numDays = input.nextInt();
		}
	    
		
	    // Decimal formating for salary variables
	    NumberFormat df = DecimalFormat.getInstance();
	    df.setMaximumFractionDigits(2);
		
	
	    
	    
	    
		// Prompt user for input
		System.out.print("Enter the number of days worked: ");
		numDays = keyboard.nextInt();
		
		// Input validation: Input must not be less than 1
	    while (numDays < 1){
	    	System.out.print("Enter the number of days worked: ");
			numDays = keyboard.nextInt();
	    }
		
		// Display table header
		System.out.println("Day  " + "   Salary     " + "Total Salary");
		
		// Display number of days
		int day = 1;
		
		// Construct while loop to display days, daily salary, and total salary.
		while (numDays > 0){
			System.out.println(day + "       $" + salary + "       $" + df.format(totalSalary));
			salary *= 2;
			totalSalary += salary;
			day++;
			numDays--;
		}
	}
}