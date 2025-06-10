package NorthwindTraders;
import java.sql.*;
import java.util.*;

public class ProductDao {
    private String url = "jdbc:mysql://localhost:3306/northwind";
    private String user = "root";
    private String password = "sqlpassword";

    public List<Product> getAll() {
        List<Product> products = new ArrayList<>();
        String sql = "SELECT ProductID, ProductName, UnitPrice FROM Products";

        try (
                Connection connection = DriverManager.getConnection(url, user, password);
                PreparedStatement statement = connection.prepareStatement(sql);
                ResultSet rs = statement.executeQuery()
        ) {
            while (rs.next()) {
                int id = rs.getInt("ProductID");
                String name = rs.getString("ProductName");
                double price = rs.getDouble("UnitPrice");

                products.add(new Product(id, name, price));
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }

        return products;
    }
}
