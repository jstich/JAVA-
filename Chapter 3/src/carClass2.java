
public class carClass2 {
	//fields
	private int yearModel;
	private String make;
	private int speed;

		//get and setters
		public carClass2(){
			
			}
	
	
		public int getYearModel() {
			return yearModel;
		}
		public void setYearModel(int yearModel) {
			this.yearModel = yearModel;
		}
		public String getMake() {
			return make;
		}
		public void setMake(String make) {
			this.make = make;
		}
		public int getSpeed() {
			return speed;
		}
		public void setSpeed(int speed) {
			this.speed = speed;
		}
		public int getaccelerate(){
			return speed  += 5;
		}
		
		public int  getbrake(){
			return speed  -= 5;
		}
		
		
		
		
	

}
