import java.util.Random;
public class LotteryClass {
//instance field
private static  int lotteryNumbers [];


//Create random lottery numbers method array
public  int [] getRandomNumbers(){
    lotteryNumbers = new int [5];
    Random r = new Random();
    for(int i = 0; i < 5; i++)
        lotteryNumbers[i] = r.nextInt(10);

    return lotteryNumbers;
}

public int compareNumbers(int[] usersNumbers) {

            int matchedNums = 0;
            if (usersNumbers.length == lotteryNumbers.length) {
                for (int i = 0; i < lotteryNumbers.length; i++) {
            if (usersNumbers[i] == lotteryNumbers[i]) {
                matchedNums ++;
                    }
                }
            }

            return matchedNums;}

// Display the random lottery numbers for the user
public static int [] getLotteryNumbers() {
    return lotteryNumbers;
}
}