package DealershipWorkshop;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SalesDao {
    public void saveSale(String vin, String customerName, String saleDate, double salePrice) {
        String sql = "INSERT INTO sales_contracts (VIN, customer_name, sale_date, sale_price) VALUES (?, ?, ?, ?)";

        try (Connection conn = DbConnectionPool.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, vin);
            stmt.setString(2, customerName);
            stmt.setString(3, saleDate); // format: yyyy-MM-dd
            stmt.setDouble(4, salePrice);

            stmt.executeUpdate();
            System.out.println("Sale contract saved.");

        } catch (SQLException e) {
            System.out.println("Failed to save sale contract: " + e.getMessage());
        }
    }
}
