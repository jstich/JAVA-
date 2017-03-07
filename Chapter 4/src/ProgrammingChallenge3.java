import java.util.Scanner;

public class ProgrammingChallenge3 {
	 private double score;
	 private char grade;
	 
	  //The setScore method accepts an argument for the score field.
	   public void SetScore(double test)
	   {
	      score = test / 3;
	   }

	    //The getScore method returns the score field.
	   public double getScore()
	   {
	      return score;
	   }
	    
	   
	   //The getLetterGrade returns the letter  grade for the test score.
	   public char getLetterGrade()
	   {

	      if (score < 60)
			{
	         grade = 'F';
			}
	      else if (score < 70)
				{
		         grade = 'D';
				}
		  else if (score < 80)
				{
			       grade = 'C';
			  	}    
		  else if (score < 90)
				{
				   grade = 'B';
				}
		  else
				{ 
				   grade = 'A';
				}
			
	      return grade;
	   }

	

}

