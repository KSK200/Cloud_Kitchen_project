package com.karthik.cloudkitchen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.karthik.cloudkitchen.model.dishes;

/**
 * DishesRepository
 */
public interface DishesRepository extends JpaRepository<dishes,Long>{
    
    
}