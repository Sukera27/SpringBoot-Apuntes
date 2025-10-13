package com.example.Producto.dto;

import java.util.List;

import com.example.Producto.persistance.model.User;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDto {
    Integer userId;
    String username;
    String email;
    DniDto documentDni;
    String password;    
    List<ProductoDto> products;

    public  UserDto(User user) {
        this.userId = user.getUserId();
        this.username = user.getUsername();
        this.email = user.getEmail();
        this.password = user.getPassword();
        this.documentDni = user.getDocumentDni() != null ? new DniDto(user.getDocumentDni()) : null;
    }
}
