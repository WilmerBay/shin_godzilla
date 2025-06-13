package NorthwindShippers;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ShipperDAO {

    public int insert(String name, String phone) {
        String sql = "INSERT INTO shippers (CompanyName, Phone) VALUES (?, ?)";

        try (
                Connection conn = DbConnectionPool.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)
        ) {
            stmt.setString(1, name);
            stmt.setString(2, phone);
            stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                return rs.getInt(1); // return new ShipperID
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return -1; // failure
    }

    public List<Shipper> getAll() {
        List<Shipper> shippers = new ArrayList<>();
        String sql = "SELECT * FROM shippers";

        try (
                Connection conn = DbConnectionPool.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()
        ) {
            while (rs.next()) {
                shippers.add(new Shipper(
                        rs.getInt("ShipperID"),
                        rs.getString("CompanyName"),
                        rs.getString("Phone")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return shippers;
    }

    public boolean updatePhone(int id, String phone) {
        String sql = "UPDATE shippers SET Phone = ? WHERE ShipperID = ?";

        try (
                Connection conn = DbConnectionPool.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)
        ) {
            stmt.setString(1, phone);
            stmt.setInt(2, id);

            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public boolean delete(int id) {
        String sql = "DELETE FROM shippers WHERE ShipperID = ?";

        try (
                Connection conn = DbConnectionPool.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)
        ) {
            stmt.setInt(1, id);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
}
