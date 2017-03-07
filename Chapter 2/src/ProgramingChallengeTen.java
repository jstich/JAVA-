import java.util.Scanner;
public class ProgramingChallengeTen {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner (System.in);
		
		//Declare variables
		double firstScore;
		double secondScore;
		double thirdScore;
		double average;
		
		System.out.println("Please enter the first score");
		firstScore = scanner.nextDouble();
		
		System.out.println("Please enter the second score");
		secondScore = scanner.nextDouble();
		
		System.out.println("Please enter the third score");
		thirdScore = scanner.nextDouble();
		
		//calculate average
		average = (firstScore + secondScore + thirdScore) /3 ;
		
		//print out average
		System.out.println("The average of:" + firstScore+ ", " + secondScore + " and " + thirdScore + " is " + average);

	}

}
