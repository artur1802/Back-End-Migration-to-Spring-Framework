package com.example.backend.dao;

import com.example.backend.entities.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*") // "*" allows requests from any origin.
public interface CartItemRepository extends JpaRepository<CartItem, Long> {


}