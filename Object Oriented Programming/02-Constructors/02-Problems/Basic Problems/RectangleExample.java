/*
 * Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively 
 * by creating a class named 'Rectangle' with a method named 'Area' 
 * which returns the area and length and breadth passed as parameters to its constructor.
 */

 

 public class RectangleExample {
    
    
  static class Rectangle {
      double length;
      double breadth;

  // Constructor with parameters to initialize length and breadth
  public Rectangle(double length, double breadth) {
      this.length = length;
      this.breadth = breadth;
  }

  // Method to calculate and return the area of the rectangle
  public double calculateArea() {
      return length * breadth;
  }
}


  public static void main(String[] args) {
      // Create objects of the 'Rectangle' class for two rectangles
      Rectangle rectangle1 = new Rectangle(4, 5);
      Rectangle rectangle2 = new Rectangle(5, 8);

      // Calculate and print the area of the first rectangle
      double area1 = rectangle1.calculateArea();
      System.out.println("Area of Rectangle 1: " + area1);

      // Calculate and print the area of the second rectangle
      double area2 = rectangle2.calculateArea();
      System.out.println("Area of Rectangle 2: " + area2);
  }
}



 /*
  * OUTPUT : 
Area of Rectangle 1: 20.0
Area of Rectangle 2: 40.0
  */