import java.util.Scanner;
import java.text.DecimalFormat;
public class num6Launcher {

	/**
	 * @param args
	 */
	
		
		 
		
		    public void main(String [] args)
		    {
		    //local variables
		        double weight;
		        int miles;
		         
		    //Create a Scanner object
		      Scanner keyboard = new Scanner(System.in);
		       
		    //Create a DecimalFormat object
		      DecimalFormat money = new DecimalFormat("0.00");
		       
		    //Get the package weight and miles shipped
		      System.out.print("Enter the package weight: ");
		      weight = keyboard.nextDouble();
		      System.out.print("Enter the miles shipped: ");
		      miles = keyboard.nextInt();
		       
		    //Create a ShippingCharges object
		      ProgramingChallenge6 myPackage = new ProgramingChallenge6  (weight, miles);
		       
		    //Display the total charges
		      System.out.println("Total Charges will be $" +
		            money.format(myPackage.getShippingCharges()));
		             
		    }
		

	}


