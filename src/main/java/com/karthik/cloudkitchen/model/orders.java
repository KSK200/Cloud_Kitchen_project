package com.karthik.cloudkitchen.model;

import java.time.LocalDate;

import java.util.List;

import com.karthik.cloudkitchen.service.OrderServiceImpl;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

public class orders {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="order_id")
    private long order_id;
    private long caterer_id;
    private long customer_id;
    private LocalDate delivery_date;
    private int no_of_people;
    @OneToMany(mappedBy = "order_id")
    private List<dishes> dishes;
    
    public orders(long order_id, long caterer_id, long customer_id, LocalDate delivery_date, int no_of_people,
            List<com.karthik.cloudkitchen.model.dishes> dishes) {
        this.order_id = order_id;
        this.caterer_id = caterer_id;
        this.customer_id = customer_id;
        this.delivery_date = delivery_date;
        this.no_of_people = no_of_people;
        this.dishes = dishes;
    }
    public long getOrder_id() {
        return order_id;
    }
    public void setOrder_id(long order_id) {
        this.order_id = order_id;
    }
    public long getCaterer_id() {
        return caterer_id;
    }
    public void setCaterer_id(long caterer_id) {
        this.caterer_id = caterer_id;
    }
    public long getCustomer_id() {
        return customer_id;
    }
    public void setCustomer_id(long customer_id) {
        this.customer_id = customer_id;
    }
    public LocalDate getDelivery_date() {
        return delivery_date;
    }
    public void setDelivery_date(LocalDate delivery_date) {
        this.delivery_date = delivery_date;
    }
    public int getNo_of_people() {
        return no_of_people;
    }
    public void setNo_of_people(int no_of_people) {
        this.no_of_people = no_of_people;
    }
    public List<dishes> getDishes() {
        return dishes;
    }
    public void setDishes(List<dishes> dishes) {
        this.dishes = dishes;
    }
    @SuppressWarnings("null")
    public void createOrder(OrderServiceImpl orderServiceImpl) {
        orderServiceImpl.ordersRepository.save(this);
    }
    @SuppressWarnings("null")
    public void addOrder(OrderServiceImpl orderServiceImpl) {
        orderServiceImpl.ordersRepository.createOrder(orderServiceImpl, this);
    } 
}
