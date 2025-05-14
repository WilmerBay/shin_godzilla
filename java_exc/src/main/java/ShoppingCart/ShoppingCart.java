package ShoppingCart;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Product> items;

    public ShoppingCart() {

        items = new ArrayList<>();
    }

    public void addItem(Product product) {

        items.add(product);
    }

    public void printReceipt() {

        double totalBeforeTax = 0.0;

        System.out.println("Receipt:");
        for (Product item : items) {
            double finalPrice = item.getFinalPrice();
            System.out.printf("- %s: $%.2f%n", item.name, finalPrice);
            totalBeforeTax += finalPrice;
        }

        double tax = totalBeforeTax * 0.21;
        double totalAfterTax = totalBeforeTax + tax;

        System.out.printf("%nSubtotal: $%.2f%n", totalBeforeTax);
        System.out.printf("Tax (21%%): $%.2f%n", tax);
        System.out.printf("Total: $%.2f%n", totalAfterTax);
        System.out.println("this is a test for the new branch created");
    }
}