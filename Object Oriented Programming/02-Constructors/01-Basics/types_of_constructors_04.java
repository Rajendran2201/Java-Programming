public class types_of_constructors_04 {

    /*
    Types of Constructors :

    1. Default Constructors
    2. Parameterized Constructors
    3. Copy Constructors

     */

   static class MyClass {
        // Default constructor
        public MyClass() {
            System.out.println("Default constructor called.");
        }
    }

    static class Person {
        String name;
        int age;

        // Parameterized constructor
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    static class Point {
        int x;
        int y;

        // Default constructor
        public Point() {
            // Default values if needed
            this.x = 0;
            this.y = 0;
        }

        // Copy constructor
        public Point(Point other) {
            this.x = other.x;
            this.y = other.y;
        }
    }

    // Constructor Overoading
    static class Calculator {
        // Parameterized constructor for addition
        public Calculator(int a, int b) {
            System.out.println("Sum: " + (a + b));
        }

        // Parameterized constructor for multiplication
        public Calculator(double a, double b) {
            System.out.println("Product: " + (a * b));
        }
    }


        public static void main(String[] args) {
            // Test default constructor
            MyClass myObject = new MyClass();

            // Test parameterized constructor
            Person person = new Person("John Doe", 25);
            System.out.println("Person: " + person.name + ", Age: " + person.age);

            // Test copy constructor
            Point point1 = new Point();
            point1.x = 10;
            point1.y = 20;
            Point point2 = new Point(point1);
            System.out.println("Point 1: (" + point1.x + ", " + point1.y + ")");
            System.out.println("Point 2 (copy): (" + point2.x + ", " + point2.y + ")");

            // Test constructor overloading
            Calculator addCalculator = new Calculator(5, 3);
            Calculator multiplyCalculator = new Calculator(2.5, 4.0);
        }
    }


