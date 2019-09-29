package com.redfort.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redfort.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
