/*
 * Create a class called 'Matrix' containing constructor that 
 * initializes the number of rows and number of columns of a new Matrix object. 
 * The Matrix class has the following information:
1 - number of rows of matrix
2 - number of columns of matrix
3 - elements of matrix in the form of 2D array

 */


 import java.util.Scanner;



public class MatrixExample {
    
   static class Matrix {
        int numRows;
        int numColumns;
        int[][] elements;

    // Constructor to initialize the number of rows and number of columns
    public Matrix(int numRows, int numColumns) {
        this.numRows = numRows;
        this.numColumns = numColumns;
        this.elements = new int[numRows][numColumns];
    }

    // Method to input elements of the matrix
    public void inputMatrix() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the elements of the matrix:");

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                System.out.print("Element at position (" + (i + 1) + ", " + (j + 1) + "): ");
                elements[i][j] = scanner.nextInt();
            }
        }

        // Close the scanner
        scanner.close();
    }

    // Method to display the matrix
    public void displayMatrix() {
        System.out.println("Matrix:");

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                System.out.print(elements[i][j] + " ");
            }
            System.out.println();
        }
    }
}
    
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of rows and columns from the user
        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int numColumns = scanner.nextInt();

        // Create an object of the 'Matrix' class
        Matrix matrix = new Matrix(numRows, numColumns);

        // Input elements of the matrix
        matrix.inputMatrix();

        // Display the matrix
        matrix.displayMatrix();

        // Close the scanner
        scanner.close();
    }
}



/*
 * OUTPUT : 
 * 
Enter the number of rows: 2
Enter the number of columns: 3
Enter the elements of the matrix:
Element at position (1, 1): 1
Element at position (1, 2): 2
Element at position (1, 3): 3
Element at position (2, 1): 4
Element at position (2, 2): 5
Element at position (2, 3): 6
Matrix:
1 2 3
4 5 6 
 */

