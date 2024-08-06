package com.ultrathor4.training.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ultrathor4.training.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Object> {

}
