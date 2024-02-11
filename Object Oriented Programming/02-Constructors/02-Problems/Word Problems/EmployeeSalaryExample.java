/*
 * Write a program by creating an 'Employee' class having the following methods and print the final salary.
1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
2 - 'AddSal()' which adds $10 to salary of the employee if it is less than $500.
3 - 'AddWork()' which adds $5 to salary of employee if the number of hours of work per day is more than 6 hours.
 */

 import java.util.Scanner;


public class EmployeeSalaryExample {
    static class Employee {
            double salary;
            int hoursOfWork;

    // Method to get information about the employee
    public void getInfo(double salary, int hoursOfWork) {
        this.salary = salary;
        this.hoursOfWork = hoursOfWork;
    }

    // Method to add $10 to salary if it is less than $500
    public void addSal() {
        if (salary < 500) {
            salary += 10;
        }
    }

    // Method to add $5 to salary if the number of hours of work per day is more than 6 hours
    public void addWork() {
        if (hoursOfWork > 6) {
            salary += 5;
        }
    }

    // Method to display the final salary
    public void displaySalary() {
        System.out.println("Final Salary: $" + salary);
    }
}

    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an object of the 'Employee' class
        Employee employee = new Employee();

        // Input salary and hours of work from the user
        System.out.print("Enter the salary: $");
        double salary = scanner.nextDouble();

        System.out.print("Enter the number of hours of work per day: ");
        int hoursOfWork = scanner.nextInt();

        // Call the 'getInfo' method to set the employee information
        employee.getInfo(salary, hoursOfWork);

        // Call the 'addSal' and 'addWork' methods
        employee.addSal();
        employee.addWork();

        // Display the final salary
        employee.displaySalary();

        // Close the scanner
        scanner.close();
    }
}


/*OUTPUT : 
 * 
Enter the salary: $567
Enter the number of hours of work per day: 10
Final Salary: $572.0
 */