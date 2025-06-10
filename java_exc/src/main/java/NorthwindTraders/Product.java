package NorthwindTraders;

public class Product {
    private int id;
    private String name;
    private double price;

    // Constructors, getters, setters

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // toString()
    public String toString() {
        return id + ": " + name + " ($" + price + ")";
    }
}

