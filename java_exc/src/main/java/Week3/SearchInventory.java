package Week3;

import javax.sound.sampled.Line;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class SearchInventory {

    public static void main(String[] args) {

        List<Product> products = getInventory();

        System.out.println("Inventory");

        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i).getName() + " : " + products.get(i).getPrice());
        }

    }
    public static List<Product> getInventory() {

        List<Product> product = new ArrayList<>();

        Product apple = new Product(123, "apple", 1.99);
        Product banana = new Product(111, "banana", 1.50);
        Product mango = new Product(84, "mango", 1.30);
        Product guava = new Product(893, "guava", 1.25);
        Product strawberry = new Product(48, "strawberry", 1.10);

        product.add(apple);
        product.add(banana);
        product.add(mango);
        product.add(guava);
        product.add(strawberry);

        return product;






    }
}


