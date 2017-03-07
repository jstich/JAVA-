

public class CarClassLauncher {


	public static void main(String[] args) {
		
		carClass2 car1 = new carClass2();
		
		car1.setYearModel(03);
		car1.setMake("chevy");
		car1.setSpeed(30);
		
		
		System.out.println( "Current speed of the " + car1.getYearModel() + " " + car1.getMake() +  " is " + car1.getSpeed() );
		System.out.println( "Accelerating...." );
		for( int seconds = 1; seconds <= 5; seconds++ ){
			car1.getaccelerate();
			System.out.println( "Current speed of the " + car1.getYearModel() + " " + car1.getMake() + " is " + car1.getSpeed() );
			
		}
		System.out.println("Brakeing");
		
		for( int seconds = 1; seconds <= 5; seconds++ ){
			car1.getbrake();
			System.out.println( "Current speed of the " + car1.getYearModel() + " 888888" + car1.getMake() + " is " + car1.getSpeed() );
			
		}

	}

}
