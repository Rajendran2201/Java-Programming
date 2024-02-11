/*Write a program to print the area of a rectangle by creating a class named 'Area' having two methods.
 First method named as 'setDim' takes length and breadth of rectangle as parameters and 
 the second method named as 'getArea' returns the area of the rectangle. 
 Length and breadth of rectangle are entered through keyboard. */

import java.util.Scanner;
public class RectangleAreaProgram {
    
static class Area {
    
    int length;
    int breadth;

    // Method to set dimensions (length and breadth) of the rectangle
    public void setDim(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate and return the area of the rectangle
    public int getArea() {
        return length * breadth;
    }
}


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an instance of the 'Area' class
        Area rectangle = new Area();

        // Input length and breadth from the user
        System.out.print("Enter length of rectangle: ");
        int length = scanner.nextInt();

        System.out.print("Enter breadth of rectangle: ");
        int breadth = scanner.nextInt();

        // Set dimensions of the rectangle
        rectangle.setDim(length, breadth);

        // Calculate and print the area of the rectangle
        int area = rectangle.getArea();
        System.out.println("Area of rectangle: " + area);

    }
}


/*

OUTPUT : 

Enter length of rectangle: 4
Enter breadth of rectangle: 6
Area of rectangle: 24

 */