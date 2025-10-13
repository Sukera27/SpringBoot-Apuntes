package com.example.Producto.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Producto.persistance.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
   User findByUsername(String username);
}
