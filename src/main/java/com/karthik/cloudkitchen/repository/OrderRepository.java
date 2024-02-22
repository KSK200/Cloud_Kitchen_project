package com.karthik.cloudkitchen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.karthik.cloudkitchen.model.Orders;

public interface OrderRepository extends JpaRepository<Orders, Long> {
    
    // Optional<User> findByUsernameAndPassword(String username, String password);

}