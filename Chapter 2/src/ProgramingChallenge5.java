import java.util.Scanner;
public class ProgramingChallenge5 {

	public static void main(String[] args) {
		  Scanner keyboard = new Scanner(System.in);
		  
		    System.out.print("Enter how many cookies you ate: ");
		 
		    int cookieCount = keyboard.nextInt();
		 
		    int servingSize = 40/10;
		    int caloriesPerCookie = 300/servingSize;
		    int totalCalories = cookieCount * caloriesPerCookie;
		 
		    System.out.println("Total calories consumed: " + totalCalories);
		  }
		}