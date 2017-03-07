import java.util.Scanner;

public class ProgramingChallenge9 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner( System.in);
		
		//Declare variables 
		double userMiles;
		double userGallons;
		double milesPerGallon;
		 
		System.out.println("Enter the miles: ");
		userMiles = scanner.nextDouble();
		
		System.out.println("Enter gallons of gas used: ");
		userGallons = scanner.nextDouble();
		
		milesPerGallon = userMiles / userGallons;
		
		System.out.println("Miles per gallon: " + milesPerGallon);

	}

}
