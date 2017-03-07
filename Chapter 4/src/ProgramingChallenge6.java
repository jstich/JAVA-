
public class ProgramingChallenge6

	{
		//instance variable
		   private double weight;
		   private int miles;
		   
		//constructor method
		   public ProgramingChallenge6(double w, int m)
		   {
		      weight = w;
		      miles = m;
		   }
		  
		//Return shipping charges
		   public double getShippingCharges()
		   {
		     
		    double charges;
		     
		      if (weight <= 2.0)
		      {
		         charges = (1.10 * (miles / 500 ));
		      }
		      else if ((weight > 2.0) && (weight <= 6.0))
		      {
		         charges = (2.30 * (miles / 500 ));
		      }
		      else if ((weight > 6.0) && (weight <=10.0))
		      {
		         charges = (3.50 * (miles/ 500 ));
		      }
		      else
		      {
		         charges = (4.70 * (miles / 500));
		      }
		 
		      return charges;
		   }
		}
