package com.productapplication.orderservice.orderservice.repository;

import com.productapplication.orderservice.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
