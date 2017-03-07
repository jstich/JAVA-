import java.util.Scanner;

public class ProgramingChallenge2 {

	private int seconds;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		int seconds;

		ProgramingChallenge2 num = new ProgramingChallenge2();
		System.out.println ("Enter a number of seconds:"); 
		seconds = input.nextInt(); 
		 num.setSeconds(seconds);
		 num.getSeconds();
	

		}

	public ProgramingChallenge2() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the seconds
	 */
	public void getSeconds() {
		int minutes, hours, days; 
		minutes = seconds / 60; 
		hours = seconds / 3600; 
		days = seconds / 86400; 


		if (seconds < 60) 
		{ 
			System.out.println ("The time entered is:" + seconds + "seconds"); 
		} 

		else if (seconds >= 60 && seconds < 3600) 
		{ 
			System.out.println ("The time entered is:" + seconds + "seconds"); 
			System.out.println ("The time entered is: " + minutes + " minutes"); 
		} 

		else if (seconds >=3600 && seconds < 86400) 
		{ 
			System.out.println ("The time entered is:" + seconds + "seconds"); 
			System.out.println ("The time entered is: " + minutes + " minutes");
			System.out.println ("The time entered is " + hours + " hours");
		} 

		else if (seconds >=86400) 
		{ 

			System.out.println ("The time entered is:" + seconds + "seconds"); 
			System.out.println ("The time entered is: " + minutes + " minutes");
			System.out.println ("The time entered is " + hours + " hours");
			System.out.println ("The time entered is: " + days + " days"); 
		} 
	}

	/**
	 * @param seconds the seconds to set
	 */
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	} 

		
	}


