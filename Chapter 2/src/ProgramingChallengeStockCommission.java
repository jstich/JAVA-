import javax.swing.JOptionPane;
public class ProgramingChallengeStockCommission {

	public static void main(String[] args) {
		
		//Declare Variables
		double stockTotal = 25.50 * 1000;
		double stockComission = 0.02 * stockTotal;
		double totalAmount = stockTotal + stockComission;
		
		//Display Results
		JOptionPane.showMessageDialog(null, "Kathryan paid $" + stockTotal + " for the shares. She paid $" + stockComission + " to her " + " stock broker paying a total of $" + totalAmount );
		
		System.exit(0);

	}

}
