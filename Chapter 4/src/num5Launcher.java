import java.util.Scanner;

public class num5Launcher {

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		ProgramingChallenge5 num = new ProgramingChallenge5();
		int checksWritten;
		
		System.out.print("Please enter the number of checks written for the month: ");
		checksWritten = keyboard.nextInt();
		num.setChecksWritten(checksWritten);
	
		
		System.out.println("The service fees for the month are $" + num.getCharge() + ".");
	}
}
