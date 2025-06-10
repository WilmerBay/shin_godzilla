package NorthwindTraders;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ProductDao dao = new ProductDao();
        List<Product> products = dao.getAll();

        for (Product p : products) {
            System.out.println(p);
        }
    }
}
