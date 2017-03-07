import java.util.Scanner;
public class ProgramingChallengeStringManipulator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		// declare variables
		String userFavoriteCity;
		
		System.out.println("Please enter the name of your favorite city: ");
		userFavoriteCity = scanner.nextLine();
		
		System.out.println("The number of characters in" + userFavoriteCity +"is " + userFavoriteCity.length() );
		System.out.println( userFavoriteCity +"Converted to uppercase is " + userFavoriteCity.toUpperCase() );
		System.out.println( userFavoriteCity +"Converted to lowercase is " + userFavoriteCity.toLowerCase() );
		System.out.println("The first character in " + userFavoriteCity + " is "+ userFavoriteCity.charAt( 0 ) );

		
		
	}

}
