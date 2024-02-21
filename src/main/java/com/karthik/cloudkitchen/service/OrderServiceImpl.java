package com.karthik.cloudkitchen.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karthik.cloudkitchen.model.orders;
import com.karthik.cloudkitchen.repository.OrdersRepository;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    public OrdersRepository ordersRepository;

    public OrderServiceImpl(OrdersRepository ordersRepository){
        this.ordersRepository=ordersRepository;
    }
    @Override
    public void saveorder(orders order) {
        OrdersRepository.saveorder(order);
    }

    @Override
    public Optional<orders> getOrder(long orderId) {
       return ordersRepository.findById(orderId);
    }

    @Override
    public Iterable<orders> getAllOrders() {
        // TODO Auto-generated method stub
        return ordersRepository.findAll();
    }

    // @SuppressWarnings("unused")
    // @Override
    // public boolean orderExist(long orderId){
    //      if(ordersRepository.findById(orderId)!=null){
    //         return true;
    //      }
    //      return false;
    // }

    @Override
    public boolean deleteOrder(long order_id) {
        // TODO Auto-generated method stub
        if(orderExist(order_id)){
            ordersRepository.deleteById(order_id);
            return true;
        }else{
            return false;
        }
    }

    @SuppressWarnings("null")
    @Override
    public void updateOrder(orders orderDetails) {
        ordersRepository.save(orderDetails);
        
    }
    @Override
    public boolean orderExist(long orderId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'orderExist'");
    }
    
    
}
