package DealershipWorkshop;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LeaseDao {
    public void saveLease(String vin, String customerName, String leaseStart, String leaseEnd, double monthlyPayment) {
        String sql = "INSERT INTO lease_contracts (VIN, customer_name, lease_start, lease_end, monthly_payment) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DbConnectionPool.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, vin);
            stmt.setString(2, customerName);
            stmt.setString(3, leaseStart); // format: yyyy-MM-dd
            stmt.setString(4, leaseEnd);
            stmt.setDouble(5, monthlyPayment);

            stmt.executeUpdate();
            System.out.println("Lease contract saved.");

        } catch (SQLException e) {
            System.out.println("Failed to save lease contract: " + e.getMessage());
        }
    }
}
