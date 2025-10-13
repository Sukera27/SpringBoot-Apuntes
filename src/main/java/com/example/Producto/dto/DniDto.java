package com.example.Producto.dto;

import com.example.Producto.persistance.model.Dni;

import lombok.Data;

@Data
public class DniDto {
    Integer dniId;
    String number;
    String frontImg;
    String backImg;

    public DniDto(Dni dni) {
        this.dniId = dni.getDniId();
        this.number = dni.getNumber();
        this.frontImg = dni.getFrontImg();
        this.backImg = dni.getBackImg();
    }
}
