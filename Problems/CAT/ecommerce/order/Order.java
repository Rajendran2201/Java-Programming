package ecommerce.order;

import ecommerce.product.Product;

public class Order {
    private String pname;
    private int xqnty;
    private Product product;

    public Order(Product product, int xqnty) {
        this.product = product;
        this.pname = product.getName();
        this.xqnty = xqnty;
    }

    public void executeOrder() {
        if (product.reduceQuantity(xqnty)) {
            System.out.println("Order placed successfully!");
            System.out.println("Product: " + pname);
            System.out.println("Quantity remaining: " + product.getQuantity());
            System.out.println("Total price: " + (product.getPrice() * xqnty));
        } else {
            System.out.println("Sorry, we are out of stock ;(");
        }
    }
}
