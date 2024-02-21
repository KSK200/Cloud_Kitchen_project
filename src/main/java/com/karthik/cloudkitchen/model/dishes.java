package com.karthik.cloudkitchen.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class dishes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long dish_id;
    private String dish_name;
    private double price;

    @ManyToOne
    @JoinColumn(name="order_id")
    private orders order_id;

    

    public dishes(long dish_id, String dish_name, double price, orders order_id) {
        this.dish_id = dish_id;
        this.dish_name = dish_name;
        this.price = price;
        this.order_id = order_id;
    }

    public long getDish_id() {
        return dish_id;
    }

    public void setDish_id(long dish_id) {
        this.dish_id = dish_id;
    }

    public String getDish_name() {
        return dish_name;
    }

    public void setDish_name(String dish_name) {
        this.dish_name = dish_name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public orders getOrder_id() {
        return order_id;
    }

    public void setOrder_id(orders order_id) {
        this.order_id = order_id;
    }

    
}
