import java.util.Scanner;


public class ChargeAccount {
    static int[] validChargeAccountNumbers = {
        5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 8080152,
        4562555, 5552012, 5050552, 7825877, 1250255, 1005231, 6545231,
        3852085, 7576651, 7881200, 4581002
    };

    public static void main(String[] args) {
    	ChargeAccount account = new ChargeAccount();
    	Scanner in = new Scanner(System.in);
        // ask the user for an account number
        System.out.print("Enter the account number: ");

        // get the number from the user
        int number = in.nextInt();

        // check to see if the number is valid
        if (ChargeAccount.isValid(number) == true) 
        {
                System.out.println("Fraud account detected.");
        } else 
        {
                System.out.println("That number is invalid.");
        }
    }

    public static boolean isValid(int number) {
        for (int i = 0; i < validChargeAccountNumbers.length; i++) {
            //checks if the numbers were in the list
            if (validChargeAccountNumbers[i] == number) {
                return true;
            }
        }
        return false;
    }

}