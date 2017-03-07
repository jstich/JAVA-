import java.util.Scanner;

public class num2Launcher {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		int seconds;

		ProgramingChallenge2 num = new ProgramingChallenge2();
		System.out.println ("Enter a number of seconds:"); 
		seconds = input.nextInt(); 
		 num.setSeconds(seconds);
		 num.getSeconds();
	

		}

}
