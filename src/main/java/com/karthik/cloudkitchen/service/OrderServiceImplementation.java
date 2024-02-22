package com.karthik.cloudkitchen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karthik.cloudkitchen.model.Orders;
import com.karthik.cloudkitchen.repository.OrderRepository;

@Service
public class OrderServiceImplementation implements OrderService {
    // @SuppressWarnings("unused")
    @Autowired
    private OrderRepository orderrepo;

    @SuppressWarnings("null")
    @Override
    public void saveorder(Orders orders) {
        orderrepo.save(orders);
    }
}
