
class PayrollClass{
    int[] employeeID = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
    int NUM_EMPLOYEES = employeeID.length;

    int[] hours = new int[NUM_EMPLOYEES];
    double[] payRate = new double[NUM_EMPLOYEES];
    double[] wages = new double[NUM_EMPLOYEES];

    // setHours method - will reassign the whole array of `hours` with the provided argument `time` ;
    public void setHours(int[] time) {
        hours = time;
        
    }

    // setHours method - will set working hours in one of an array `hours` elements specified by the provided index - number of an employee it refers to
    public void setHours(int employeeNumber, int workedHours) {
        hours[employeeNumber] = workedHours;
    }

    // setPayRate method - same as above
    public void setPayRate(int employeeNumber, double payRate) {
        wages[employeeNumber] = payRate;
    }

    // setWage method - same as above
    public void setWage(int employeeNumber, double wage) {
        wages[employeeNumber] = wage;
    }

    // getWage method - will return the wage for employee given by an index in array number
    public double getWage(int employeeNumber) {
        return wages[employeeNumber];
    }

    //getEmployeeID method - will return an ID of employee given by an index in array number
    public int getEmployeeID(int employeeNumber) {
        return employeeID[employeeNumber];
    }

    //getEmployeeIndexFromID method - will return the index of employee given by his ID number - this is inverse function of the function 'getEmployeeID'
    public int getEmployeeIndexFromID(int employeeID) {
        int index = 0;
     
        return index;
    }

	public void setPayRate(double[] pay) {
		// TODO Auto-generated method stub
		
	}
}