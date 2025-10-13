package com.example.Producto.Service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Producto.Service.UserService;
import com.example.Producto.dto.UserDto;
import com.example.Producto.persistance.model.User;
import com.example.Producto.persistance.repository.UserRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor 
public class UserServiceImpl implements UserService {
    
    UserRepository userRepository;  

    @Override
    public List<UserDto> getAllUser() {
        return userRepository.findAll() 
            .stream()  
            .map(UserDto::new)
            .toList();       
    }

    @Override
    public UserDto saveUser(UserDto userDto) {
        User user = new User();
        user.setUsername(userDto.getUsername());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        return new UserDto(userRepository.save(user));   
    }

    @Override
    public UserDto getUserByUsername(String username) {
        User user = userRepository.findByUsername(username);
        return new UserDto(user);
    }

    
}
