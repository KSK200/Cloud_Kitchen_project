package com.karthik.cloudkitchen.service;

import java.util.Optional;

import com.karthik.cloudkitchen.model.orders;

public interface OrderService {
    
    public static void saveorder(orders order) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveorder'");
    }
    Optional<orders>  getOrder(long orderId);
    Iterable<orders> getAllOrders();
    boolean orderExist(long orderId);
    boolean deleteOrder(long order_id);
    void  updateOrder( orders orderDetails);

}
