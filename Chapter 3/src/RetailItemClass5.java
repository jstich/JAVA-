
public class RetailItemClass5 {
   //fields
	private String Description;
	private double UnitsOnHand;

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public double getUnitsOnHand() {
		return UnitsOnHand;
	}

	public void setUnitsOnHand(double unitsOnHand) {
		UnitsOnHand = unitsOnHand;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	private double Price;
	
	public static void main(String[] args)
	   {
	      //Create the objects
	      RetailItemClass5 one = new RetailItemClass5();
	      RetailItemClass5 two = new RetailItemClass5();
	      RetailItemClass5 three = new RetailItemClass5();
	       
	      // Set item one info.
	      one.setDescription("Jacket");
	      one.setUnitsOnHand(12);
	      one.setPrice(59.95);
	       
	      // Set item two info.
	      two.setDescription("Designer Jeans");
	      two.setUnitsOnHand(40);
	      two.setPrice(34.95);
	       
	      // Set item three info.
	      three.setDescription("Shirt");
	      three.setUnitsOnHand(20);
	      three.setPrice(24.95);
	       
	      System.out.println("Description" + "\t\t\t" +"Units On Hand" + "\t\t" + "Price");
	      System.out.println("------------------------------------------------------------");
	      
	      //Display object 1 info
	      //System.out.print("         Item 1 Information"         );
	      //System.out.print("====================================");
	      System.out.print(" Item 1: " + one.getDescription() + "            Units on hand: "  + one.getUnitsOnHand() +  "    Price: " + one.Price);
	       
	      //Display object 2 info
	    //  System.out.print("         Item 2 Information"         );
	      
	      System.out.print("\n Item 2: " + two.getDescription() + "    Units on hand: "  + two.getUnitsOnHand() + "    Price: "          + two.Price);
	       
	      //Display object 3 info
	      //System.out.print("         Item 3 Information"         );
	     // System.out.print("====================================");
	      System.out.print("\n Item 3: " + three.getDescription() + "	           Units on hand: "  + three.getUnitsOnHand() + "    Price: "          + three.Price);
	       
	       
	   }
	}

			


