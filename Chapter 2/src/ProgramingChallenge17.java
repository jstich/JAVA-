import javax.swing.JOptionPane;
public class ProgramingChallenge17 {

	public static void main(String[] args) {
		
		String name;
	      name= JOptionPane.showInputDialog("Enter your name");

	      String age;
	      age= JOptionPane.showInputDialog("Enter your age");

	      String city;
	      city= JOptionPane.showInputDialog("Enter the name of a city");

	      String college;
	      college= JOptionPane.showInputDialog("Enter the name of a college");

	      String profession;
	      profession= JOptionPane.showInputDialog("Enter profession");

	      String animal;
	      animal= JOptionPane.showInputDialog("Enter a type of animal");

	      String pet;
	      pet= JOptionPane.showInputDialog("Enter a pet name");

	      String str="There once was a person named "+ name+ " \n who lived in CITY. At the age of "+age+ ", "+ name +" went to college at \n"+ college+" ."+ name +" graduated and went to work as a \n"+ profession +" . Then, "+ name+" adopted a(n) "+ animal +" \n named "+ pet+ ". They both lived happily ever after!";
	      JOptionPane.showMessageDialog(null, str);
		
	}

}
