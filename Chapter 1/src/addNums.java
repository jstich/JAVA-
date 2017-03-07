
public class addNums { 
	
	int number11, number12, Result; 
	 
	public addNums(int num11, int num12){
	  number11 = num11;
	  number12 = num12;
	  Result= number11 + number12;
		System.out.println(num11 + "+" + num12 +"=" +Result );
	
	}

	public static void main(String[] args) {
	
		addNums num1 = new addNums(1,2);
		addNums num2 = new addNums(1,22);
		addNums num3 = new addNums(1,222);
		addNums num4 = new addNums(1,2222);
		addNums num5 = new addNums(1,22222);

	}

}
