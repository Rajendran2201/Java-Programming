
public class EmployeeManagerExample {
    
  static class Employee {
   // Properties
   private String name;
   private double salary;

   // Constructor
   public Employee(String name, double salary) {
       this.name = name;
       this.salary = salary;
   }

   // Method to display employee information
   public void displayInfo() {
       System.out.println("Name: " + name);
       System.out.println("Salary: $" + salary);
   }

   // Method to increment salary based on a given percentage
   public void incrementSalary(double percentage) {
       salary += (salary * percentage / 100);
   }
}

static class Manager extends Employee {
   // Bonus for managers
   private double bonus;

   // Constructor for Manager
   public Manager(String name, double salary, double bonus) {
       // Call the constructor of the parent class (Employee)
       super(name, salary);
       this.bonus = bonus;
   }

   // Method to display manager information including bonus
   @Override
   public void displayInfo() {
       super.displayInfo();
       System.out.println("Bonus: $" + bonus);
   }

   // Method to increment salary for managers (including bonus)
   public void incrementSalary(double percentage, double bonusPercentage) {
       // Increment base salary
       super.incrementSalary(percentage);
       // Increment bonus
       bonus += (bonus * bonusPercentage / 100);
   }
}

   
   public static void main(String[] args) {
       // Create an instance of the Employee class
       Employee employee = new Employee("John Doe", 50000);

       // Display employee information
       System.out.println("Employee Information:");
       employee.displayInfo();

       // Increment employee salary by 10%
       employee.incrementSalary(10);
       System.out.println("\nAfter Increment:");
       employee.displayInfo();

       // Create an instance of the Manager class
       Manager manager = new Manager("Alice Manager", 70000, 5000);

       // Display manager information (including bonus)
       System.out.println("\nManager Information:");
       manager.displayInfo();

       // Increment manager salary by 8% (base salary) and 5% (bonus)
       manager.incrementSalary(8, 5);
       System.out.println("\nAfter Increment:");
       manager.displayInfo();
   }
}
