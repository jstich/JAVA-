
public class ProgramingChallenge5
{
	private int checksWritten;
	private double charge;
	
	
	
	public int getChecksWritten() {
		return checksWritten;
	}



	public void setChecksWritten(int checksWritten) {
		this.checksWritten = checksWritten;
	}



	public double getCharge() {
		
		
		if(checksWritten < 20)
		{
			charge = checksWritten * 0.10;
		}
		else if(checksWritten < 40)
		{
			charge = checksWritten * 0.08;
		}
		else if(checksWritten < 60)
		{
			charge = checksWritten * 0.06;
		}
		else if(checksWritten >= 60)
		{
			charge = checksWritten * 0.04;
		}
		return charge;
	}

}