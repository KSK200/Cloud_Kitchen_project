package com.karthik.cloudkitchen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.karthik.cloudkitchen.model.orders;
import com.karthik.cloudkitchen.service.OrderServiceImpl;

public interface OrdersRepository extends JpaRepository<orders,Long>{

    @SuppressWarnings("null")
    default void createOrder(OrderServiceImpl orderServiceImpl, orders order) {
        order.createOrder(orderServiceImpl);
    }

    @SuppressWarnings("null")
    default void addOrder(OrderServiceImpl orderServiceImpl, orders order) {
        orderServiceImpl.saveorder(order);
    }

    static void saveorder(orders order) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveorder'");
    }
    
}
