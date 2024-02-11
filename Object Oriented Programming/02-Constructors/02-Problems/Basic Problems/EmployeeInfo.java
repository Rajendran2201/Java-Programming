/*Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
Name        Year of joining        Address
Robert            1994                64C- WallsStreat
Sam                2000                68D- WallsStreat
John                1999                26B- WallsStreat
*/

public class EmployeeInfo {

  static class Employee {
      String name;
      int yearOfJoining;
      String address;

      // Constructor with parameters to initialize employee information
      public Employee(String name, int yearOfJoining, String address) {
          this.name = name;
          this.yearOfJoining = yearOfJoining;
          this.address = address;
      }

      // Method to display employee information
      public void displayInfo() {
          System.out.println("Name: " + name);
          System.out.println("Year of Joining: " + yearOfJoining);
          System.out.println("Address: " + address);
          System.out.println();
      }
  }

  public static void main(String[] args) {
      // Create objects of the 'Employee' class for three employees
      Employee employee1 = new Employee("Robert", 1994, "64C- WallsStreat");
      Employee employee2 = new Employee("Sam", 2000, "68D- WallsStreat");
      Employee employee3 = new Employee("John", 1999, "26B- WallsStreat");

      // Display employee information
      System.out.println("Employee Information:");
  

      employee1.displayInfo();
      employee2.displayInfo();
      employee3.displayInfo();
  }
}


/*
 * OUTPUT : 
 * 
Employee Information:
Name: Robert
Year of Joining: 1994
Address: 64C- WallsStreat
Name: Sam
Year of Joining: 2000
Address: 68D- WallsStreat
Name: John
Year of Joining: 1999
Address: 26B- WallsStreat

 */