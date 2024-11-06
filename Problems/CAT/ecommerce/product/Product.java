package ecommerce.product;

public class Product {
    private String name;
    private int qnty;
    private float price;

    public Product(String name, int qnty, float price) {
        this.name = name;
        this.qnty = qnty;
        this.price = price;
    }

    // Getter methods to access private fields
    public String getName() {
        return name;
    }

    public int getQuantity() {
        return qnty;
    }

    public float getPrice() {
        return price;
    }

    // Method to reduce quantity
    public boolean reduceQuantity(int amount) {
        if (qnty >= amount) {
            qnty -= amount;
            return true;
        }
        return false;
    }

    // Method to print product details
    public void displayProductDetails() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + qnty);
    }
}
