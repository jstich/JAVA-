import java.util.Scanner;


public class DistanceTravled {
	
	public static void main(String[] args) {
		// Declare values to store user input.
		int speed = 0,
			hours = 0;
		
		// Create scanner object
		Scanner keyboard = new Scanner(System.in);
		
		
		// Prompt user for speed and hour values.
		System.out.print("Enter the speed: ");
		speed = keyboard.nextInt();
		
		// Input validation to ensure speed isn't a negative number
		while(speed < 0){
			System.out.print("Enter the speed: ");
			speed = keyboard.nextInt();
		}
		
		System.out.print("Enter the amount of hours traveled: ");
		hours = keyboard.nextInt();
		
		// Input validation: Hours must be greater than 1
		while(hours < 1){
			System.out.print("Enter the amount of hours traveled (MPH): ");
			hours = keyboard.nextInt();
			}
		
		// Display the table header for rendering report.
		System.out.println("Hours" + "             Distance Traveled");
		System.out.println("------------------------------------");
		
		// Declare counter variable to count loop iterations.
		int hr = 1;
		
		// Construct while-loop to display report data.
		while(hours >= 1){
			System.out.println("  " + hr + "                     " + hr * speed + " MPH");
			hr++;
			hours--;
		}
	}
}