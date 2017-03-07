import java.util.Scanner;

public class num1Launcher {

	public static void main(String[] args) {
		
		   //Create a scanner object to read input
		   Scanner keyboard = new Scanner(System.in);
		   
		    ProgramingChallenge1 num = new ProgramingChallenge1();
		    
			// Get a number from the user.
		    System.out.print("Enter a number in the range of 1 - 10: ");
	        
		    // User inputed number
		    int numbers1 = keyboard.nextInt(); 

		    num.setNumber(numbers1);
		    
		    num.getNumber();
		    
		    //close stream
		    keyboard.close();

		  

		  
		    
		}
}
