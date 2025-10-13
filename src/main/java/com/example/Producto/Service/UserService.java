package com.example.Producto.Service;

import java.util.List;

import com.example.Producto.dto.UserDto;

public interface UserService {
    public List<UserDto> getAllUser(); 
    public UserDto saveUser(UserDto userDto);
    public UserDto getUserByUsername(String username);   
}
