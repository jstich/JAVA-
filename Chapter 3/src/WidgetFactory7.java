import java.util.Scanner;

public class WidgetFactory7 {
	
		double widgets;
		
		public WidgetFactory7(){
			widgets = 0;
		}
		
		public void SetWidgets(double num){
			widgets = num;
		}
		
		public void GetDays(){
			double days;
			days = widgets / 160;
			System.out.println("Number of days to produce is:  " + days + " days");
		}
		
		public static void main (String[] args){
			double number;
			Scanner keyboard = new Scanner(System.in);
			WidgetFactory7 num = new WidgetFactory7();
			System.out.println("enter the number of widgets:  ");
			number = keyboard.nextDouble();
			num.SetWidgets(number);
			num.GetDays();
		}
	}

