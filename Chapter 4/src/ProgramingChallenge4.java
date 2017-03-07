
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
 

public class ProgramingChallenge4{
	
	private double quant;
	private double discount;
	private double totalAmount;
	
  

public ProgramingChallenge4() {
	// TODO Auto-generated constructor stub
	
}

/**
 * @return the total
 */
public double getTotalAmount() {
	double retailPrice = 99;
	double amountOfOrder = quant * retailPrice;
	double discountAmount = amountOfOrder * discount; 
	double totalAmount = amountOfOrder - discountAmount;
	return totalAmount;
}

/**
 * @param total the total to set
 */
public void setTotalAmount(double total) {
	this.totalAmount = total;
}

/**
 * @return the discount
 */
public double getDiscount() {
	if (quant < 10)
   		discount = 0;
   	else if (quant < 20)
   		discount = 0.2;
   	else if (quant < 50)
   		discount = 0.3;
   	else if (quant < 100)
   		discount = 0.4;
   	else discount = 0.5;
	return discount;
}

/**
 * @param discount the discount to set
 */
public void setDiscount(double discount) {
	this.discount = discount;
	
}

/**
 * @return the quant
 */
public double getQuant() {
	return quant;
}

/**
 * @param quantity the quant to set
 */
public void setQuant(double quantity) {
	this.quant = quantity;
}
   
   
  
     
}