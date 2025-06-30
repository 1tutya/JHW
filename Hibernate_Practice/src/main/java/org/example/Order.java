package org.example;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
@Entity
@Table(name = "orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String product;
    private Integer quantity;
    private Integer price;
    private Date created_at;

    public Order(String product, Integer quantity, Integer price, Date created_at) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
        this.created_at = created_at;
    }
}
