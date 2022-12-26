package com.microService.orderservice.repository;

import com.microService.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
    Order order = new Order();
}
