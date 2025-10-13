package com.example.Producto.dto;

import com.example.Producto.persistance.model.Product;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductoDto {
    private Long id;
    private String name;
    private String description;
    private Double price;
    private String img;

    public ProductoDto(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.description = product.getDescription();
        this.price = product.getPrice();
        this.img = product.getImageUrl();
    }
}
