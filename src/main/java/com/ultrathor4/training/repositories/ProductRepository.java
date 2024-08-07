package com.ultrathor4.training.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ultrathor4.training.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
