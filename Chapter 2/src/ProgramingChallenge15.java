import java.util.Scanner;
public class ProgramingChallenge15 {

	public static void main(String[] args) {
		
		//Create a scanner object
		Scanner scanner = new Scanner(System.in);
		
		//Declare variable
		double sugar = 1.5;
		double butter = 1;
		double flour = 2.75;
		double numOfCookies = 48;
	
		
		System.out.println("Please enter the number of cookies" );
		numOfCookies = scanner.nextInt();
		sugar = (1.5 / 48) * numOfCookies;
		butter = (1.0 / 48.0) * numOfCookies;
		flour = (2.75 / 48) * numOfCookies;
		
		//Display information
		System.out.println(" For " + numOfCookies + " you will need " + sugar + " cups of sugar, " + butter + " cups of butter " + flour + " cups of flour ");

	}

}
