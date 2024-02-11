/*
 * Write a program to print the area of a rectangle by creating a class named 'Area' 
 * taking the values of its length and breadth as parameters of its constructor and having a method named 'returnArea' 
 * which returns the area of the rectangle. 
 * Length and breadth of rectangle are entered through keyboard.
 */

 import java.util.Scanner;


public class RectangleAreaInput {
    
    
static class Area {
    double length;
    double breadth;

    // Constructor with parameters to initialize length and breadth
    public Area(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate and return the area of the rectangle
    public double returnArea() {
        return length * breadth;
    }
}
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input length and breadth from the user
        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        // Create an object of the 'Area' class with user input values
        Area rectangle = new Area(length, breadth);

        // Calculate and print the area of the rectangle
        double area = rectangle.returnArea();
        System.out.println("Area of the rectangle: " + area);

        // Close the scanner
        scanner.close();
    }
}


/*
 * OUTPUT : 
 Enter length of the rectangle: 5
Enter breadth of the rectangle: 8
Area of the rectangle: 40.0

 */