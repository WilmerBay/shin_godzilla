package NorthwindTraders;

import java.sql.*;

public class NorthwindTraders {
    public static void main(String[] args) throws SQLException {
        if (args.length != 2) {
            System.out.println("Usage: java NorthwindTraders <username> <password>");
            return;
        }

        String username = args[0];
        String password = args[1];

        // Connect to Northwind DB
        String url = "jdbc:mysql://localhost:3306/northwind";

        try (
                Connection connection = DriverManager.getConnection(url, username, password);
                PreparedStatement stmt = connection.prepareStatement(
                        "SELECT ProductID, ProductName, UnitPrice, UnitsInStock FROM Products");
                ResultSet rs = stmt.executeQuery()
        ) {
            while (rs.next()) {
                System.out.printf("Product Id: %d\nName: %s\nPrice: %.2f\nStock: %d\n------------------\n",
                        rs.getInt("ProductID"),
                        rs.getString("ProductName"),
                        rs.getDouble("UnitPrice"),
                        rs.getInt("UnitsInStock"));
            }
        } catch (SQLException e) {
            System.err.println("Database error: " + e.getMessage());
        }
    }
}

