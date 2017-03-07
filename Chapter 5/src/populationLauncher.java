import javax.swing.JOptionPane;
public class populationLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double userInputDouble= -1; // store user input as a double
		
		//make a population object
		population pop = new population();
		
		while(userInputDouble < 2){
			//get the starting population from the user
			userInputDouble = Integer.parseInt(JOptionPane.showInputDialog("Whats is the starting size of the population?"));
			pop.setStartingNum(userInputDouble);
			//display a friendly message
			if(userInputDouble < 2){
			JOptionPane.showMessageDialog(null," population must be greater than 2");
			}
		}
		
		//reset input double 
		userInputDouble = -1;
		
		while (userInputDouble < 0){
		//get the average daily increase 
		userInputDouble = Double.parseDouble(JOptionPane.showInputDialog("what is the average daily increase?"));
		pop.setAvgDailyIncrease(userInputDouble);
		if (userInputDouble < 0){
			JOptionPane.showMessageDialog(null," percentage increase must be greater than 1");
			}
		}
		//reset input double
		userInputDouble = -1;
		
		while(userInputDouble <0){
			//Get the number of days the organisms will multiply
			userInputDouble = Integer.parseInt(JOptionPane.showInputDialog("What is the number of days the organism will multiply?"));
			pop.setNumDaysMultiplied(userInputDouble);
			if (userInputDouble < 0){
				JOptionPane.showMessageDialog(null," day increase must be greater than 1");
		}
	}
		
		pop.setCurrentPopulation();
		pop.displayPopulationSize();
		
	}

}

