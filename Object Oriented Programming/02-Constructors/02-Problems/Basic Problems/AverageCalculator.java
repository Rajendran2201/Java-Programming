/*
 * Print the average of three numbers entered by user
 *  by creating a class named 'Average' having a method to calculate and print the average.
 */

 import java.util.Scanner;
public class Average{
    
    static class Average {
    // Method to calculate and print the average of three numbers
    public void calculateAndPrintAverage(double num1, double num2, double num3) {
        double average = (num1 + num2 + num3) / 3.0;
        System.out.println("Average of the three numbers: " + average);
    }
}
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three numbers from the user
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double number3 = scanner.nextDouble();

        // Create an object of the 'Average' class
        Average averageCalculator = new Average();

        // Calculate and print the average using the method
        averageCalculator.calculateAndPrintAverage(number1, number2, number3);

        // Close the scanner
        scanner.close();
    }
}


/*
 * Enter the first number: 4
Enter the second number: 5
Enter the third number: 6
Average of the three numbers: 5.0
 */