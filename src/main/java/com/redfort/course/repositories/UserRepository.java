package com.redfort.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redfort.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
