package ecommerce;

import ecommerce.customer.Customer;
import ecommerce.order.Order;
import ecommerce.product.Product;

public class ECommerceApplication {
    public static void main(String[] args) {
        Product p = new Product("Shirt", 15, 750);
        Order o = new Order(p, 2);
        Customer c = new Customer("Aishwarya", 19, "95786553", "aish@gmail.com");

        System.out.println("----------------------------------------------------------------------");
        p.displayProductDetails();

        System.out.println("----------------------------------------------------------------------");
        o.executeOrder();

        System.out.println("----------------------------------------------------------------------");
        c.fetchcustomerdetails();
    }
}


/*
 * javac ecommerce/*.java ecommerce/customer/*.java ecommerce/order/*.java ecommerce/product/*.java
    java ecommerce.ECommerceApplication


    OUTPUT: 

    ----------------------------------------------------------------------
Name: Shirt
Price: 750.0
Quantity: 15
----------------------------------------------------------------------
Order placed successfully!
Product: Shirt
Quantity remaining: 13
Total price: 1500.0
----------------------------------------------------------------------
Customer name: Raj
Age: 19
Mobile no: 9500365553
Mail id: raj@gmail.com

 * 
 */