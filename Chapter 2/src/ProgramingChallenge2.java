
public class ProgramingChallenge2 {

	public static void main(String[] args) {
		String firstName;
		String middleName;
		String lastName;
		
		firstName = "Jacob ";
		middleName= "Thomas ";
		lastName= "Stich ";
		
	char firstLetter ;
	char middleLetter ; 
	char lastLetter ; 
	
	firstLetter= firstName.charAt(0);
	middleLetter= middleName.charAt(0);	
	lastLetter= lastName.charAt(0);
	
	System.out.println("MY name is " + firstName + middleName + lastName ) ;
	System.out.println("These are my initials: " + firstLetter + middleLetter + lastLetter);
	
	}

}
