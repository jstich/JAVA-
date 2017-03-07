
import java.util.Scanner;
import java.util.Arrays;


public class LotteryLauncher{

public static void main(String[] args) {

    LotteryClass lottery = new LotteryClass();

    int lotteryNumbersCount = LotteryClass.getLotteryNumbers().length;

    System.out.println("The Pennsylvania Lottery\n");
    System.out.println("There are " + lotteryNumbersCount
            + " numbers in my lottery, they are 0 through 9. "
            + "See if you can win big CASH prizes!!!\n");

    // Asks the user to enter five numbers.
    Scanner keyboard = new Scanner(System.in);
    int numbers[] = new int[lotteryNumbersCount];

    for (int index = 0; index < numbers.length; index++) {
        System.out.print(String.format("Enter Number %d: ", index + 1));
        numbers[index] = keyboard.nextInt();
    }

    // Display the number of digits that match the randomly generated
    // lottery numbers.

    int match = lottery.compareNumbers(numbers);

    if (match == lotteryNumbersCount) {

        // If all of the digits match, display a message proclaiming the
        // user a grand prize winner.
        System.out.println("\nYOU WIN, GO SEE D. LEETE FOR YOUR GRAND PRIZE!!!");

    } else {

        System.out.println("\nThe winning numbers are " +  Arrays.toString(LotteryClass.getLotteryNumbers()) + 
                "\nYou matched " + match + " number(s).");

    }

  }
}