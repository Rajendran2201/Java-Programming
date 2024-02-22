public class inheritance_05
{
    // Base class (Superclass)
   static class Vehicle {
        String brand;
        int year;

        // Constructor for the Vehicle class
        public Vehicle(String brand, int year) {
            this.brand = brand;
            this.year = year;
        }

        // Method in the Vehicle class
        public void displayInfo() {
            System.out.println("Brand: " + brand);
            System.out.println("Year: " + year);
        }
    }

    // Derived class (Subclass) inheriting from Vehicle
    static class Car extends Vehicle {
        int numberOfDoors;

        // Constructor for the Car class
        public Car(String brand, int year, int numberOfDoors) {
            // Call the constructor of the superclass (Vehicle)
            super(brand, year);
            
            this.numberOfDoors = numberOfDoors;
        }

        // Method in the Car class
        public void displayCarInfo() {
            // Call the method of the superclass (Vehicle)
            displayInfo();

            System.out.println("Number of Doors: " + numberOfDoors);
        }
    }

    // Main class to test the inheritance

        public static void main(String[] args) {
            // Create an instance of the Car class
            Car myCar = new Car("Toyota", 2022, 4);

            // Call methods from both the Vehicle and Car classes
            myCar.displayCarInfo();
        }
    }


