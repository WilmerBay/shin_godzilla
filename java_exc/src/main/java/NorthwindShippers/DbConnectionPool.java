package NorthwindShippers;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DbConnectionPool {
    private static BasicDataSource dataSource;

    static {
        dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/northwind");
        dataSource.setUsername("root");         // <- your username
        dataSource.setPassword("sqlpassword");  // <- your password
    }

    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
}
