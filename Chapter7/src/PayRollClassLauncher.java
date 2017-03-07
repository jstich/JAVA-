
import java.util.Scanner;

public class PayRollClassLauncher
{
   public static void main(String[] args)
   {
      final int NUM_EMPLOYEES = 7;
      int[] time = new int[NUM_EMPLOYEES];
      double[] pay = new double[NUM_EMPLOYEES];

      // Create new Scanner object
      Scanner keyboard = new Scanner(System.in);

      // Create employee object
      PayrollClass[] employee = new PayrollClass[NUM_EMPLOYEES];

      // A loop that creates objects for each element
      for (int i = 0; i < employee.length; i++)
         employee[i] = new PayrollClass();


      for (int i = 0; i < employee.length; i++)
      {
         System.out.print("Enter hours for Employee #" + employee[i].getEmployeeID(i) +
                           ": ");
         time[i] = keyboard.nextInt();
         employee[i].setHours(time);

         System.out.print("Enter how much Employee #" + employee[i].getEmployeeID(i) +
                          " makes per hour: ");
         pay[i] = keyboard.nextDouble();
         employee[i].setPayRate(pay);

      }

      for (int i = 0; i < employee.length; i++)
      {
         System.out.println("Employee #" + employee[i].getEmployeeID(i) + 
                            " Wages: " + employee[i].getWage(i));

      }    

   }

 }