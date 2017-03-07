import java.util.Scanner;

     public class PayRollClass6
     {
        private String EmployeeName;
        private int IDnumber;
        private double HourlyPayRate;
        private double TotalHoursWorked;
        private double TotalGrossPay;

        public String getEmployeeName() {
return EmployeeName;
}

public void setEmployeeName(String employeeName) {
EmployeeName = employeeName;
}

public int getIDnumber() {
return IDnumber;
}

public void setIDnumber(int iDnumber) {
IDnumber = iDnumber;
}

public double getHourlyPayRate() {
return HourlyPayRate;
}

public void setHourlyPayRate(double hourlyPayRate) {
HourlyPayRate = hourlyPayRate;
}

public double getTotalHoursWorked() {
return TotalHoursWorked;
}

public void setTotalHoursWorked(double totalHoursWorked) {
TotalHoursWorked = totalHoursWorked;
}

public double getTotalGrossPay() {
return TotalHoursWorked * HourlyPayRate;
}



        public static void main(String[] args)
        {
            String EmployeeName;
            int IDnumber;
            double TotalHoursWorked;
            double HourlyPayRate;
            double TotalGrossPay;

           Scanner keyboard = new Scanner(System.in);

            System.out.print("Enter employee's name:");
            EmployeeName = keyboard.nextLine();

            System.out.print("Enter employee's ID number:" );
            IDnumber = keyboard.nextInt();

            System.out.print("Enter hourly rate:");
            HourlyPayRate = keyboard.nextDouble();

            System.out.print("Enter number of hours worked:");
            TotalHoursWorked = keyboard.nextDouble();

            PayRollClass6 pay = new PayRollClass6();
            pay.setEmployeeName(EmployeeName);
            pay.setIDnumber(IDnumber);
            pay.setHourlyPayRate(HourlyPayRate);
            pay.setTotalHoursWorked(TotalHoursWorked);


            System.out.print(EmployeeName + ", " + "employee number "+ IDnumber + ", made $" + pay.getTotalGrossPay() + " in gross pay."); 
        }
     }