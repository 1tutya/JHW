package org.example.mvc.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class OrderDto {
    private Integer id;
    @NotBlank(message = "Product shouldn`t be empty")
    @Pattern(regexp = "^[А-Яа-яЁё]+$", message = "Product name should contain only one russian word!")
    private String product;
    @NotNull(message = "Quantity shouldn`t be empty!")
    @Positive(message = "Quantity should be a positive number!")
    private Integer quantity;
    @NotNull(message = "Price shouldn`t be empty!")
    @Positive(message = "Price should be a positive number!")
    private Integer price;
}
