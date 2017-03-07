import javax.swing.JOptionPane;
public class ProgramingChallengeMaleAndFemalePercentages {

	public static void main(String[] args) {
		//Declare variables
		String userOutputString;
		int numberOfMales;
		int numberOfFemales;
		int totalNumberOfStudents;
		double malePercentage;
		double femalePercentage;
		
		userOutputString = JOptionPane.showInputDialog(" Please enter the number of males in the class ");
		numberOfMales = Integer.parseInt(userOutputString);
		
		userOutputString = JOptionPane.showInputDialog(" Please enter the number of females in the class ");
		numberOfFemales = Integer.parseInt(userOutputString);
		
		totalNumberOfStudents = numberOfMales + numberOfFemales;
		
		malePercentage = ((double)numberOfMales / totalNumberOfStudents) * 100 ;
		femalePercentage = ((double)numberOfFemales / totalNumberOfStudents) * 100 ;
		
		//System.out.println("There are " + totalNumberOfStudents + " students in the class. " + malePercentage + "% of all the " + " students are boys and " + femalePercentage + "% of them are girls"  );
		
		JOptionPane.showMessageDialog(null, "There are " + totalNumberOfStudents + " students in the class. " + malePercentage + "% of all the " + " students are boys and " + femalePercentage + "% of them are girls");
		
		System.exit(0);
	}

}
