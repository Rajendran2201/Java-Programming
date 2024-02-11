//Add two distances in inch-feet by creating a class named 'AddDistance'.

import java.util.Scanner;

public class AddDistanceExample {
    
    
static class AddDistance {
    int feet;
    int inches;

    // Constructor with parameters to initialize distance in inch-feet
    public AddDistance(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    // Method to add two distances and return the result as a new 'AddDistance' object
    public AddDistance addDistances(AddDistance distance2) {
        int totalFeet = this.feet + distance2.feet;
        int totalInches = this.inches + distance2.inches;

        // Adjust total inches if it exceeds 12
        if (totalInches >= 12) {
            totalFeet += totalInches / 12;
            totalInches %= 12;
        }

        return new AddDistance(totalFeet, totalInches);
    }

    // Method to display distance in inch-feet
    public void displayDistance() {
        System.out.println("Feet: " + feet + " Inches: " + inches);
    }
}

    
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first distance
        System.out.println("Enter the first distance:");
        System.out.print("Feet: ");
        int feet1 = scanner.nextInt();
        System.out.print("Inches: ");
        int inches1 = scanner.nextInt();

        // Input for the second distance
        System.out.println("\nEnter the second distance:");
        System.out.print("Feet: ");
        int feet2 = scanner.nextInt();
        System.out.print("Inches: ");
        int inches2 = scanner.nextInt();

        // Create objects of the 'AddDistance' class for the two distances
        AddDistance distance1 = new AddDistance(feet1, inches1);
        AddDistance distance2 = new AddDistance(feet2, inches2);

        // Add distances and display the result
        AddDistance totalDistance = distance1.addDistances(distance2);

        System.out.println("\nTotal Distance:");
        totalDistance.displayDistance();

        // Close the scanner
        scanner.close();
    }
}


/*
 * OUTPUT : 
 * 
 * Enter the first distance:
Feet: 43
Inches: 45
Enter the second distance:
Feet: 321
Inches: 3
Total Distance:
Feet: 368 Inches: 0

 */