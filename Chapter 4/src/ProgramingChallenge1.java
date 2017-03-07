import java.util.Scanner;
public class ProgramingChallenge1 {
	
	public int number;

	public static void main(String[] args) {
	
	   //Create a scanner object to read input
	   Scanner keyboard = new Scanner(System.in);
	   
	    ProgramingChallenge1 num = new ProgramingChallenge1();
	    
		// Get a number from the user.
	    System.out.print("Enter a number in the range of 1 - 10: ");
        
	    // User inputed number
	    int numbers1 = keyboard.nextInt(); 

	    num.setNumber(numbers1);
	    
	    num.getNumber();
	    
	    //close stream
	    keyboard.close();

	  

	  
	    
	}

	public ProgramingChallenge1() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the number
	 */
	public void getNumber() {
		switch (number){
    	case 1:
    		System.out.println("Roman Numeral for 1 is: I");
    		break;
    	case 2:
    		System.out.println("Roman Numeral for 2 is: II");
    		break;
    	case 3:
    		System.out.println("Roman Numeral for 3 is: III");
    		break;
    	case 4:
    		System.out.println("Roman Numeral for 4 is: IV");
    		break;
    	case 5:
    		System.out.println("Roman Numeral for 5 is: V");
    		break;
    	case 6:
    		System.out.println("Roman Numeral for 6 is: VI");
    		break;	
    	case 7:
    		System.out.println("Roman Numeral for 7 is: VII");
    		break;
    	case 8:
    		System.out.println("Roman Numeral for 8 is: VIII");
    		break;
    	case 9:
    		System.out.println("Roman Numeral for 9 is: IX");
    		break;
    	case 10:
    		System.out.println("Roman Numeral for 10 is: X");
    		break;
    	
    	default:
    		System.out.println("Please try a Number between 1 - 10!");
    }
    
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}

		
	}


