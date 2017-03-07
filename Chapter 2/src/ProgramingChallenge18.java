
public class ProgramingChallenge18 {

	public static void main(String[] args) {
		
		//declaring variable
		int numberOfSharesPurchased = 1000;
		double priceBoughtPerShare = 32.87;
		double amountPaidForStock = numberOfSharesPurchased * priceBoughtPerShare;
		double commissionForBuying = 0.02 * amountPaidForStock;
		
		
		int numberOfSharesSold = 1000;
		double priceSoldPerShare = 33.92;
		double amountRecivedForStock = numberOfSharesSold * priceSoldPerShare;
		double commissionForSelling = 0.02 * amountRecivedForStock;
		
		double totalProfit = (amountRecivedForStock - commissionForSelling) - (amountPaidForStock - commissionForBuying);
		
		System.out.println("The amount of money Joe paid for stock is " + amountPaidForStock);
		System.out.println("The amount of commission earned when buying the stock: $ " + commissionForBuying);
		System.out.println("The amount Joe recived for the stock: $ " + amountRecivedForStock);
		System.out.println("The amount of commission for joe selling the stock: $ " + commissionForSelling );
		System.out.println("The amount of profit joe made: $" + totalProfit);
		

	}

}

   
	