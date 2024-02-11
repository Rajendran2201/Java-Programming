/*
 * Print the sum, difference and product of two complex numbers by creating a class named 'Complex' 
 * with separate methods for each operation whose real and imaginary parts are entered by user.
 */

 import java.util.Scanner;



public class ComplexOperations {
    
    
   static class Complex {
        double real;
        double imaginary;

    // Method to set the real and imaginary parts of a complex number
    public void setComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }


    // Method to calculate and print the sum of two complex numbers
    public void calculateAndPrintSum(Complex num1, Complex num2) {
        double sumReal = num1.real + num2.real;
        double sumImaginary = num1.imaginary + num2.imaginary;
        System.out.println("Sum: " + sumReal + " + " + sumImaginary + "i");
    }


    // Method to calculate and print the difference of two complex numbers
    public void calculateAndPrintDifference(Complex num1, Complex num2) {
        double diffReal = num1.real - num2.real;
        double diffImaginary = num1.imaginary - num2.imaginary;
        System.out.println("Difference: " + diffReal + " + " + diffImaginary + "i");
    }


    // Method to calculate and print the product of two complex numbers
    public void calculateAndPrintProduct(Complex num1, Complex num2) {
        double productReal = (num1.real * num2.real) - (num1.imaginary * num2.imaginary);
        double productImaginary = (num1.real * num2.imaginary) + (num1.imaginary * num2.real);
        System.out.println("Product: " + productReal + " + " + productImaginary + "i");
    }
}
    
    
    
    
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first complex number
        System.out.println("Enter the real and imaginary parts of the first complex number:");
        System.out.print("Real part: ");
        double real1 = scanner.nextDouble();
        System.out.print("Imaginary part: ");
        double imaginary1 = scanner.nextDouble();

        // Input for the second complex number
        System.out.println("\nEnter the real and imaginary parts of the second complex number:");
        System.out.print("Real part: ");
        double real2 = scanner.nextDouble();
        System.out.print("Imaginary part: ");
        double imaginary2 = scanner.nextDouble();

        // Create objects of the 'Complex' class for the two complex numbers
        Complex complexNumber1 = new Complex();
        Complex complexNumber2 = new Complex();

        // Set the real and imaginary parts for both complex numbers
        complexNumber1.setComplexNumber(real1, imaginary1);
        complexNumber2.setComplexNumber(real2, imaginary2);

        // Create an object of the 'Complex' class for the result
        Complex result = new Complex();

        // Calculate and print the sum, difference, and product using the methods
        System.out.println("\nOperations on the complex numbers:");
        result.calculateAndPrintSum(complexNumber1, complexNumber2);
        result.calculateAndPrintDifference(complexNumber1, complexNumber2);
        result.calculateAndPrintProduct(complexNumber1, complexNumber2);

        // Close the scanner
        scanner.close();
    }
}


/*
 * OUTPUT : 
 * 
 * 
Enter the real and imaginary parts of the first complex number:
Real part: 4
Imaginary part: 5
Enter the real and imaginary parts of the second complex number:
Real part: 1
Imaginary part: 2
Operations on the complex numbers:
Sum: 5.0 + 7.0i
Difference: 3.0 + 3.0i
Product: -6.0 + 13.0i
 */