import java.util.Scanner;

public class TestScores {
	
	  private double score1;
	    private double score2;
	    private double score3;
	    
	    
	    
	    public static void main(String[] args) {

	        double test1;
	        double test2;
	        double test3;

	        // Create a scanner for keyboard input.
	        Scanner keyboard = new Scanner(System.in);

	        System.out.print("Enter test score: ");
	        test1 = keyboard.nextDouble();

	        System.out.print("Enter test score: ");
	        test2 = keyboard.nextDouble();

	        System.out.print("Enter test score: ");
	        test3 = keyboard.nextDouble();

	        // close scanner
	        keyboard.close();

	        TestScores scores = new TestScores(test1, test2, test3);
	        //TestScores scores = classProgram.new TestScores(test1, test2, test3);

	        // Display average
	        System.out.println("The average test score: "
	                + scores.getAverageScore());
	    }

	  

		public TestScores(double score1, double score2, double score3) {
	        this.score1 = score1;
	        this.score2 = score2;
	        this.score3 = score3;
	    }

		public double getScore1() {
			return score1;
		}

		public void setScore1(double score1) {
			this.score1 = score1;
		}

		public double getScore2() {
			return score2;
		}

		public void setScore2(double score2) {
			this.score2 = score2;
		}

		public double getScore3() {
			return score3;
		}

		public void setScore3(double score3) {
			this.score3 = score3;
		}
		
		public double getAverageScore() {
			return (score1 + score2 + score3) / 3;
		}


	 	
	
	

	

}
