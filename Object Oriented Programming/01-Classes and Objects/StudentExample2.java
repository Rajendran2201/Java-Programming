
/*
 * Assign and print the roll number, phone number and address of two students 
 * having names "Sam" and "John" respectively by creating two objects of class 'Student'.
 */
public class StudentExample2 {
  static class Student {
  String name;
  int rollNo;
  long phoneNumber;
  String address;
}
  public static void main(String[] args) {
      // Create objects of the 'Student' class for two students
      Student sam = new Student();
      Student john = new Student();

      // Assign values to the attributes of the 'sam' object
      sam.name = "Sam";
      sam.rollNo = 101;
      sam.phoneNumber = 1234567890;
      sam.address = "123 Main St, City";

      // Assign values to the attributes of the 'john' object
      john.name = "John";
      john.rollNo = 102;
      john.phoneNumber = 9876543210l;
      john.address = "456 Oak St, Town";

      // Display information for both students
      System.out.println("Student: " + sam.name);
      System.out.println("Roll No: " + sam.rollNo);
      System.out.println("Phone Number: " + sam.phoneNumber);
      System.out.println("Address: " + sam.address);
      System.out.println();

      System.out.println("Student: " + john.name);
      System.out.println("Roll No: " + john.rollNo);
      System.out.println("Phone Number: " + john.phoneNumber);
      System.out.println("Address: " + john.address);
  }
}

/*OUTPUT : 

Student: Sam
Roll No: 101
Phone Number: 1234567890
Address: 123 Main St, City
Student: John
Roll No: 102
Phone Number: 9876543210
Address: 456 Oak St, Town

 */