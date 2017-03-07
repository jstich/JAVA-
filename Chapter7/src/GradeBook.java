
import java.util.Scanner;
import java.io.*;

public class GradeBook {

    public static void main(String[] args) throws IOException {

        Student[] students = new Student[5];

        getStudentData(students);

    }

    public static double getStudentData(Student[] array) {
        Scanner scan = new Scanner(System.in);
        String[] student = new String[5];
        double[] test = new double[4];
        for (int i = 0; i < student.length; i++) {
            System.out.println("Enter the name of the student : ");
            student[i] = scan.nextLine();
            for (int j = 0; j < test.length; j++) {
                System.out.println("Enter score " + (j + 1) + " for the student");
                test[j] = scan.nextDouble();
                scan.nextLine();
            }
            array[i] = new Student(student[i], test);
            for(Student student1 : array)
            {
                System.out.println(student1);
            }
        }
        return 0;

    }
}