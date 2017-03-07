import java.util.Scanner; 

public class DriverExamLauncher
{
   public static void main(String[] args)
   {
      System.out.println("    Driver's License Exam "); 
      Scanner input = new Scanner(System.in); 

      System.out.println(" 20 Multiple-Choice Questions "); 
      System.out.println("       Mark A, B, C, D   "); 

      //Inputting string
      String[] answers = new String[20]; 
      String answer; 

      for (int i = 0; i < 20; i++)
      {
         do
         {
            System.out.print((i+1) + ": "); 
            answer = input.nextLine(); 
         } while (!isValidAnswer(answer)); 

         answers[i] = answer; 
      }

      //Process
      DriverExam exam = new DriverExam(answers); 

      //Results
      System.out.println("  RESULTS  "); 

      //Outputting total correct
      System.out.println("Total Correct: " + exam.totalCorrect()); 

      //Outputting total incorrect
      System.out.println("Total Incorrect: " + exam.totalIncorrect()); 

      String passed = exam.passed() ? "YES" : "NO"; 

      //Result pass or fail
      System.out.println("Passed: " + passed); 

      if (exam.totalIncorrect() > 0)
      {
          System.out.println("The incorrect answers are: "); 

          int missedIndex; 

          for (int i = 0; i < exam.totalIncorrect(); i++)
          {
            missedIndex = exam.questionsMissed()[i]+1; 
            System.out.print(" " + missedIndex); 
          }
      }
   } //end of main function

   //Returns true when answer is valid
   public static boolean isValidAnswer (String answer)
   {
      return "A".equalsIgnoreCase(answer) || 
         "B".equalsIgnoreCase(answer)
         || "C".equalsIgnoreCase(answer) || 
         "D".equalsIgnoreCase(answer); 
   }
} //end of Test class