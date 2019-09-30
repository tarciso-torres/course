package com.redfort.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redfort.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
