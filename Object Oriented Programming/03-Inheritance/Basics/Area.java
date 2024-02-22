/*

Define a base class for Circle and a sub-class for Sphere. Define a variable (radius) of DOUBLE datatype and find the area of the Circle and Sphere using the Object of Sub-class

*/

import java.util.Scanner;

class Area {
    static class AreaCircle {
        protected double radius;

        void display() {
            double area = Math.PI * radius * radius;
            System.out.println("The area of the circle is " + area);
        }
    }

    static class AreaSphere extends AreaCircle {
        AreaSphere(double radius) {
            this.radius = radius;
        }

        void print() {
            double area = 4 * Math.PI * radius * radius;
            System.out.println("The area of the Sphere is " + area);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();
        AreaSphere obj = new AreaSphere(radius);
        obj.display();
        obj.print();
    }
}


/*



OUTPUT : 

Enter the radius: 3.21
The area of the circle is 32.37128486185458
The area of the Sphere is 129.48513944741833

*/
