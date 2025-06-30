package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Order {
    private int id;
    private String product;
    private int quantity;
    private int price;
    private Date created_at;
}
