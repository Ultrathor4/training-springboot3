package com.ultrathor4.training.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ultrathor4.training.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
