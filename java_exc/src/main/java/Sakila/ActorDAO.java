package Sakila;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ActorDAO {

    public List<Actor> findByLastName(String lastName) {
        List<Actor> matches = new ArrayList<>();
        String sql = "SELECT actor_id, first_name, last_name FROM actor WHERE last_name = ?";

        try (
                Connection conn = DbConnectionPool.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)
        ) {
            stmt.setString(1, lastName);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                matches.add(new Actor(
                        rs.getInt("actor_id"),
                        rs.getString("first_name"),
                        rs.getString("last_name")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return matches;
    }

    public List<String> findMoviesByActor(String first, String last) {
        List<String> movies = new ArrayList<>();
        String sql = """
            SELECT f.title
            FROM film f
            JOIN film_actor fa ON f.film_id = fa.film_id
            JOIN actor a ON fa.actor_id = a.actor_id
            WHERE a.first_name = ? AND a.last_name = ?
        """;

        try (
                Connection conn = DbConnectionPool.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)
        ) {
            stmt.setString(1, first);
            stmt.setString(2, last);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                System.out.println("Movies:");
                do {
                    movies.add(rs.getString("title"));
                } while (rs.next());
            } else {
                System.out.println("No matches!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return movies;
    }
}
