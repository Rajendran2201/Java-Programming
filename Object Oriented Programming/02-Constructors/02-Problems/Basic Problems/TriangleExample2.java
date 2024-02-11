/*
 * Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units 
 * by creating a class named 'Triangle' without any parameter in its constructor.
 */

 import java.lang.Math;



public class TriangleExample2 {
    
    // ----------------------- class -------------------------------
    static class Triangle {
    double side1, side2, side3;

    // Constructor with no parameters
    public Triangle() {
        // Assigning default values for sides
        this.side1 = 3;
        this.side2 = 4;
        this.side3 = 5;
    }

    // Method to calculate and print the area of the triangle
    public void calculateArea() {
        double s = (side1 + side2 + side3) / 2.0;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        System.out.println("Area of the triangle: " + area);
    }

    // Method to calculate and print the perimeter of the triangle
    public void calculatePerimeter() {
        double perimeter = side1 + side2 + side3;
        System.out.println("Perimeter of the triangle: " + perimeter);
    }
}
    
    // ------------- main function ---------------------------------
    
    public static void main(String[] args) {
        // Create an object of the 'Triangle' class
        Triangle triangle = new Triangle();

        // Calculate and print the area and perimeter
        triangle.calculateArea();
        triangle.calculatePerimeter();
    }
}

/*
 * OUTPUT : 
 * 
Area of the triangle: 6.0
Perimeter of the triangle: 12.0
 */
