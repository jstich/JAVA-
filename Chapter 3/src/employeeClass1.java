
public class employeeClass1 {
	 
	 private String nameField;
	 private int idNumber;
	 private String department;
	 private String position;
	 
	 public String getNameField() {
		return nameField;
	}

	public void setNameField(String nameField) {
		this.nameField = nameField;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int string) {
		this.idNumber = string;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public static char[] getPosition1() {
		return Position;
	}

	private static final char[] Position = null;

	public employeeClass1(String string, int i, String string2, String string3) {
		// TODO Auto-generated constructor stub
	}

	
	public static void main(String[] args) {
	        
	        // create employee objects
	        employeeClass1 emp1 = new employeeClass1("Susan Meyers", 47899, "Accounting", "Vice President");
	        employeeClass1 emp2 = new employeeClass1("Mark Jones", 39119, "IT", "Programmer");
	        employeeClass1 emp3 = new employeeClass1("Joy Rodgers", 81774, "Manufacturing", "Engineer");
	
	        //  store employees
	        employeeClass1[] Emps = new employeeClass1[3];
	        emp1.setNameField("Susan Meyers");
	        emp1.setIdNumber(47899);
	        emp1.setDepartment("Accounting");
	        emp1.setPosition("Vice Prsident");
	        
	        emp2.setNameField("Mark Jones");
	        emp2.setIdNumber(39119);
	        emp2.setDepartment("IT");
	        emp2.setPosition("Programmer");
	        
	        emp3.setNameField("Joy Rodgers");
	        emp3.setIdNumber(81774);
	        emp3.setDepartment("Manufacturing");
	        emp3.setPosition("Engineer");
	        
	        // display employee records
	        for(int i = 0; i < 3; i++)
	        {
	            System.out.println(emp1.getNameField());
	            System.out.println(emp1.getIdNumber());
	            System.out.println(emp1.getDepartment());
	            System.out.println(emp1.getPosition());
	            System.out.println("");
	            
	            System.out.println(emp2.getNameField());
	            System.out.println(emp2.getIdNumber());
	            System.out.println(emp2.getDepartment());
	            System.out.println(emp2.getPosition());
	            System.out.println(emp3.getNameField());
	            System.out.println(emp3.getIdNumber());
	            System.out.println(emp3.getDepartment());
	            System.out.println(emp3.getPosition());
	        }  
	        
	    }

	
	}


