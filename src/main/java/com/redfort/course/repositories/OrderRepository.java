package com.redfort.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redfort.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
