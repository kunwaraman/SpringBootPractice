package com.example.springbootpractice.repository;

import com.example.springbootpractice.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
