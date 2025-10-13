package com.example.Producto.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Producto.Service.UserService;
import com.example.Producto.dto.UserDto;

import lombok.AllArgsConstructor;

@CrossOrigin
@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/users")
public class UserController {

    UserService userService;    
    
    @GetMapping("/")
    public ResponseEntity<List<UserDto>> getAllUsers() {
        return ResponseEntity.ok().body(userService.getAllUser());
    }

    @PostMapping("/")
    public ResponseEntity<UserDto> crearUser(@RequestBody UserDto userDto) {
        return ResponseEntity.ok().body(userService.saveUser(userDto));
    }
    @GetMapping("/{username}")
    public ResponseEntity<UserDto> getUserByUsername(@PathVariable String username) {
        return ResponseEntity.ok().body(userService.getUserByUsername(username));
    }
}
