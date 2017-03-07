import java.util.Scanner;

public class ProgramingChallenge3Launcher {

	
		 public static void main(String[] args) {
				Scanner keyboard = new Scanner(System.in);
				ProgrammingChallenge3 num = new ProgrammingChallenge3();
				double test = 0;
				int i = 0;
				while (i <  3) {
					System.out.print("Ente grade for test "+ (i+1) + " : ");
					test  += keyboard.nextDouble();
					++i;
				}
				num.SetScore(test);
				
				
				//output 
				
			System.out.print("AVG: " + num.getScore() + " Letter Grade is: "  + num.getLetterGrade());
			keyboard.close();
			
			}

	}

