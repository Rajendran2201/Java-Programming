/*Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. 
Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student. */

public class StudentExample {
  static class Student {
  String name;
  int roll_no;
}
  public static void main(String[] args) {
      // Create an object of the 'Student' class
      Student studentObject = new Student();

      // Assign values to the 'name' and 'roll_no' variables
      studentObject.name = "John";
      studentObject.roll_no = 2;

      // Display the values
      System.out.println("Name: " + studentObject.name);
      System.out.println("Roll No: " + studentObject.roll_no);
  }
}

/*
 * OUTPUT : 
 
 Name: John
Roll No: 2
 * 
 */