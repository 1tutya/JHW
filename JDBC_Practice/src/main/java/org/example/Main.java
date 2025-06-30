package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String DBUrl = "jdbc:mysql://localhost:3306/php_test";
        String DBUser = "root";
        String DBPass = "root";

        try {
            Connection conn = DriverManager.getConnection(DBUrl, DBUser, DBPass);
            Statement stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM orders");

            List<Order> orders = new ArrayList<>();
            while (res.next()) {
                int id = res.getInt("id");
                String product = res.getString("product");
                int quantity = res.getInt("quantity");
                int price = res.getInt("price");
                Date created_at = res.getDate("created_at");

                orders.add(new Order(id, product, quantity, price, created_at));
            }

            orders.forEach(System.out::println);

            res.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
