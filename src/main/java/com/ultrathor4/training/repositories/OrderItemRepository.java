package com.ultrathor4.training.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ultrathor4.training.entities.OrderItem;
import com.ultrathor4.training.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
