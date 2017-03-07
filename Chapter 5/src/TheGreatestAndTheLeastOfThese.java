import java.util.Scanner;

class Main{
        public static void main(String args[]){
                int highest=0, lowest=0, num=0;
                Scanner scan = new Scanner(System.in);
                highest = lowest = scan.nextInt();
                for(int i=1; i<10; i++){
                       System.out.print("Enter a number:");
                       num = scan.nextInt();
                       if (num > highest){
                           highest = num;
                       }
                       if(num < lowest){
                           lowest = num;
                    }
                    System.out.println("Highest number is: " + highest);
                    System.out.println("Lowest number is: " + lowest);
               }
        }
}