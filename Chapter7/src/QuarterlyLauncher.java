import java.util.Scanner;

public class QuarterlyLauncher {

	public static void main(String[] args){
        @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        
        System.out.println("------------------------------------------");
        Quartley sales = new Quartley();
        sales.getInputs();
        System.out.println("------------------------------------------");
        System.out.println("                  Menu");
        System.out.println("------------------------------------------");
        System.out.println("1. Display Input");
        System.out.println("2. Display Average Sales");
        System.out.println("3. Display Total Sales");
        System.out.println("4. Highest Sales Per Quarter");
        System.out.println("5. Increase/Decrease in Sales Per Quarter");
        System.out.println("6. Exit");
        while(true){
            System.out.print(">");    
            switch(in.nextInt()){
                case 1:System.out.println("\nInput Data:");
                sales.displayAsTable(Quartley.Quarters,sales.names,sales.convertToString(sales.figure));
                break;
                case 2:System.out.println("\nAverage Sales Per Quarter:");
                sales.displayAsTable(args,new String[]{"Average"},sales.convertToString(sales.avgSalesPerQtr()));
                break;
                case 3:System.out.println("\nTotal Sales Per Quarter:");
                sales.displayAsTable(args,new String[]{"Total"},sales.convertToString(sales.totalSalesPerQtr()));
                break;
                case 4:System.out.println("\nHighest Sales Per Quarter:");
                sales.displayAsTable(args,sales.names,sales.convertToString(sales.highestSalesPerQtr()));
                break;
                case 5:System.out.println("\nIncrease/Decrease in Sales Per Quarter:");
                sales.displayAsTable(args,sales.names,sales.convertToString(sales.diffSales()));
                break;
                default:return;
            }
        }
    }
}

