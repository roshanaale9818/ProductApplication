package com.productapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.productapi.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
