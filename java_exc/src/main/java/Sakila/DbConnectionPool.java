package Sakila;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DbConnectionPool {
    private static BasicDataSource dataSource;

    static {
        dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/sakila");
        dataSource.setUsername("root");
        dataSource.setPassword("sqlpassword");
        dataSource.setMinIdle(5);
        dataSource.setMaxIdle(10);
        dataSource.setMaxOpenPreparedStatements(100);
    }

    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
}

