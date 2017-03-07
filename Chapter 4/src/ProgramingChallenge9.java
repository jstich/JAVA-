import java.util.Scanner;


public class ProgramingChallenge9
{
	public static void main(String[ ] args)
	  {

               Scanner keyboard = new Scanner(System.in); 

                
		System.out.print("Enter air, water, or steel: ");
                String material;
                material = keyboard.nextLine();

                System.out.print("Enter distance: ");
                int distance;
                distance = keyboard.nextInt();
                
                switch (material)
                {
                case "air":
                int time;
                time = (distance / 1100);
                System.out.println("The total time traveled is " + time + ".");
                break;

                case "water":
                time = (distance / 4900);
                System.out.println("The total time traveled is " + time + ".");
                break;

                case "steel":
                time = (distance / 16400);
                System.out.println("The total time traveled is " + time + ".");
                break;
                }
    }
}
