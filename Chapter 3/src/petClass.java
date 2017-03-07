
	import java.util.Scanner;

	public class petClass {
	
	//fields
	private String name;
	private String type;
	private int age;
	
	public static void main(String[] args) {
	
	//scanner to read input 
	@SuppressWarnings("resource")
	Scanner keyboard= new Scanner(System.in);
	
	//insatiates fields 
	petClass information = new petClass();
	System.out.print("Enter pet name: ");
	String name = keyboard.nextLine();
	information.setName(name);
	System.out.print("Enter pet type: ");
	String type = keyboard.nextLine();
	information.setType(type);
	System.out.print("Enter your pet age: ");
	int age = keyboard.nextInt();
	information.setAge(age);
	
	//print output 
	System.out.println("Name is: " + information.getName() + "\tis a : " + information.getType() + "\t the age is: " + information.getAge());
	
	//get and set elements
	}
	public petClass() {
	}

	public String getName() {
	return name;
	}

	public void setName(String name) {
	this.name = name;
	}

	public String getType() {
	return type;
	}

	public void setType(String type) {
	this.type = type;
	}

	public int getAge() {
	return age;
	}

	public void setAge(int age) {
	this.age = age;
	}
	}

