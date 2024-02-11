public class constructor_03 {
    // Define a class representing a 'Car'
    static class Car {
        // Fields or attributes
        String brand;
        String model;
        int year;

        // Constructor to initialize the object
        public Car(String brand, String model, int year) {
            this.brand = brand;
            this.model = model;
            this.year = year;
        }

        // Method to display information about the car
        public void displayInfo() {
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
            System.out.println("Year: " + year);
        }
    }


        public static void main(String[] args) {
            // Create an instance (object) of the Car class
            Car car1 = new Car("Toyota", "Camry", 2022);
            Car car2 = new Car("Honda", "Accord", 2021);
            Car car3 = new Car("Ford", "Mustang", 2020);

            // Access and display information about each car
            car1.displayInfo();
            car2.displayInfo();
            car3.displayInfo();
        }
    }


