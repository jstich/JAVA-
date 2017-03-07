import java.util.Scanner;

public class Circle {
	
	private final double PI = 3.14159;
    private double radius;
	
	public static void main(String[] args) {

	    // Create a Scanner object for keyboard input.
	    Scanner keyboard = new Scanner(System.in);

	    // Ask user to input circle radius
	    System.out.print("Enter the radius of a circle: ");
	    double radius = keyboard.nextDouble();

	    // close keyboard
	    keyboard.close();

	    // Create a Circle object passing in user input
	    Circle circle = new Circle(radius);
	   // Circle circle = circleClass.new Circle(radius);

	    // Display circle information
	    System.out.println("Area is " + circle.getArea());
	    System.out.println("Diameter is " + circle.getDiameter());
	    System.out.println("Circumference is " + circle.getCircumference());

	}

    

    public Circle() {
        radius = 0.0;
    }

    public Circle(double r) {
        radius = r;
    }

    public void setRadius(double r) {
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public double getDiameter() {
        return radius * 2;
    }

    public double getCircumference() {
        return 2 * PI * radius;
    }
}
//public static void main(String[] args) {
//
//    // Create a Scanner object for keyboard input.
//    Scanner keyboard = new Scanner(System.in);
//
//    // Ask user to input circle radius
//    System.out.print("Enter the radius of a circle: ");
//    double radius = keyboard.nextDouble();
//
//    // close keyboard
//    keyboard.close();
//
//    // Create a Circle object passing in user input
//    Circle circleClass = new Circle();
//    Circle circle = circleClass.new Circle(radius);
//
//    // Display circle information
//    System.out.println("Area is " + circle.getArea());
//    System.out.println("Diameter is " + circle.getDiameter());
//    System.out.println("Circumference is " + circle.getCircumference());
//
//}
























//public class Circle {
//
//	private double radius;
//	private final double PI = 3.14159;
//	private double circumference;
//	public Circle ( double radiusGiven){
//		radius = radiusGiven;
//	}
//	
//	public Circle(){
//		radius = 0.0;
//	}
//	
//	public void setRadius( double radiusGiven){
//		radius = radiusGiven;
//	}
//	
//	
//
//	public double getRadius() {
//		return radius;
//	}
//
//	private double getArea(){
//		return PI * radius *radius;
//	}
//	
//	private double getDiameter(){
//		return radius * 2;
//	}
//	
//	private double getCircumference(){
//		return 2 * PI * radius;
//	}
//	
//	public double getPI() {
//		return PI;
//	}
//	
//
//	
//	}
