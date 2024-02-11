/*
The Matrix class has methods for each of the following:
1 - get the number of rows
2 - get the number of columns
3 - set the elements of the matrix at given position (i,j)
4 - adding two matrices. If the matrices are not addable, "Matrices cannot be added" will be displayed.
5 - multiplying the two matrices
 */
import java.util.Scanner;

public class MatrixExample2 {
    
    
static class Matrix {
    private int numRows;
    private int numColumns;
    private int[][] elements;

    // Constructor to initialize the number of rows and number of columns
    public Matrix(int numRows, int numColumns) {
        this.numRows = numRows;
        this.numColumns = numColumns;
        this.elements = new int[numRows][numColumns];
    }

    // Method to get the number of rows
    public int getNumRows() {
        return numRows;
    }

    // Method to get the number of columns
    public int getNumColumns() {
        return numColumns;
    }

    // Method to set the element at a given position (i, j)
    public void setElement(int i, int j, int value) {
        if (i >= 0 && i < numRows && j >= 0 && j < numColumns) {
            elements[i][j] = value;
        } else {
            System.out.println("Invalid position. Unable to set element.");
        }
    }

    // Method to add two matrices
    public Matrix addMatrices(Matrix matrix2) {
        if (this.numRows != matrix2.numRows || this.numColumns != matrix2.numColumns) {
            System.out.println("Matrices cannot be added. Number of rows or columns mismatch.");
            return null;
        }

        Matrix resultMatrix = new Matrix(numRows, numColumns);

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                resultMatrix.setElement(i, j, this.elements[i][j] + matrix2.elements[i][j]);
            }
        }

        return resultMatrix;
    }

    // Method to multiply two matrices
    public Matrix multiplyMatrices(Matrix matrix2) {
        if (this.numColumns != matrix2.numRows) {
            System.out.println("Matrices cannot be multiplied. Number of columns of the first matrix must be equal to the number of rows of the second matrix.");
            return null;
        }

        Matrix resultMatrix = new Matrix(this.numRows, matrix2.numColumns);

        for (int i = 0; i < this.numRows; i++) {
            for (int j = 0; j < matrix2.numColumns; j++) {
                int sum = 0;
                for (int k = 0; k < this.numColumns; k++) {
                    sum += this.elements[i][k] * matrix2.elements[k][j];
                }
                resultMatrix.setElement(i, j, sum);
            }
        }

        return resultMatrix;
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

    public void inputMatrix() {
            Scanner scanner = new Scanner(System.in);

            for (int i = 0; i < numRows; i++) {
                for (int j = 0; j < numColumns; j++) {
                    System.out.print("Element at position (" + (i + 1) + ", " + (j + 1) + "): ");
                    elements[i][j] = scanner.nextInt();
                }
            }
        }
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of rows and columns for the first matrix
        System.out.print("Enter the number of rows for the first matrix: ");
        int numRows1 = scanner.nextInt();
        System.out.print("Enter the number of columns for the first matrix: ");
        int numColumns1 = scanner.nextInt();

        // Create an object of the 'Matrix' class for the first matrix
        Matrix matrix1 = new Matrix(numRows1, numColumns1);

        // Input elements of the first matrix
        System.out.println("Enter the elements of the first matrix:");
        matrix1.inputMatrix();

        // Display the first matrix
        System.out.println("\nFirst Matrix:");
        matrix1.displayMatrix();

        // Input the number of rows and columns for the second matrix
        System.out.print("\nEnter the number of rows for the second matrix: ");
        int numRows2 = scanner.nextInt();
        System.out.print("Enter the number of columns for the second matrix: ");
        int numColumns2 = scanner.nextInt();

        // Create an object of the 'Matrix' class for the second matrix
        Matrix matrix2 = new Matrix(numRows2, numColumns2);

        // Input elements of the second matrix
        System.out.println("Enter the elements of the second matrix:");
        matrix2.inputMatrix();

        // Display the second matrix
        System.out.println("\nSecond Matrix:");
        matrix2.displayMatrix();

        // Add matrices and display the result
        System.out.println("\nAdding Matrices:");
        Matrix resultAddition = matrix1.addMatrices(matrix2);
        if (resultAddition != null) {
            System.out.println("Result of Addition:");
            resultAddition.displayMatrix();
        }

        // Multiply matrices and display the result
        System.out.println("\nMultiplying Matrices:");
        Matrix resultMultiplication = matrix1.multiplyMatrices(matrix2);
        if (resultMultiplication != null) {
            System.out.println("Result of Multiplication:");
            resultMultiplication.displayMatrix();
        }

        // Close the scanner
        scanner.close();
    }
}




/*
 * 
 * OUTPUT : 
 * 

Enter the number of rows for the first matrix: 2
Enter the number of columns for the first matrix: 2
Enter the elements of the first matrix:
Element at position (1, 1): 1
Element at position (1, 2): 1
Element at position (2, 1): 1
Element at position (2, 2): 1
First Matrix:
Matrix:
1 1 
1 1 

Enter the number of rows for the second matrix: 2
Enter the number of columns for the second matrix: 2
Enter the elements of the second matrix:
Element at position (1, 1): 2
Element at position (1, 2): 2
Element at position (2, 1): 2
Element at position (2, 2): 2
Second Matrix:
Matrix:
2 2 
2 2 

Adding Matrices:
Result of Addition:
Matrix:
3 3 
3 3 

Multiplying Matrices:
Result of Multiplication:
Matrix:
4 4 
4 4 

 */