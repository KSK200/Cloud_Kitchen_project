package com.karthik.cloudkitchen.model;

import java.sql.Date;
import java.util.*;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long order_id;

    private String CustomerName;
    private String PhoneNumber;
    private List<String> dishList;
    private Date DeliveryDate;
    private String No_people;
    private String CatererName;
    
    public Orders(Long order_id, String customerName, String phoneNumber, List<String> dishList, Date deliveryDate,
            String no_people, String catererName) {
        this.order_id = order_id;
        CustomerName = customerName;
        PhoneNumber = phoneNumber;
        this.dishList = dishList;
        DeliveryDate = deliveryDate;
        No_people = no_people;
        CatererName = catererName;
    }

    public Long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public List<String> getDishList() {
        return dishList;
    }

    public void setDishList(List<String> dishList) {
        this.dishList = dishList;
    }

    public Date getDeliveryDate() {
        return DeliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        DeliveryDate = deliveryDate;
    }

    public String getNo_people() {
        return No_people;
    }

    public void setNo_people(String no_people) {
        No_people = no_people;
    }

    public String getCatererName() {
        return CatererName;
    }

    public void setCatererName(String catererName) {
        CatererName = catererName;
    }

    @Override
    public String toString() {
        return "Orders [order_id=" + order_id + ", CustomerName=" + CustomerName + ", PhoneNumber=" + PhoneNumber
                + ", dishList=" + dishList + ", DeliveryDate=" + DeliveryDate + ", No_people=" + No_people
                + ", CatererName=" + CatererName + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((order_id == null) ? 0 : order_id.hashCode());
        result = prime * result + ((CustomerName == null) ? 0 : CustomerName.hashCode());
        result = prime * result + ((PhoneNumber == null) ? 0 : PhoneNumber.hashCode());
        result = prime * result + ((dishList == null) ? 0 : dishList.hashCode());
        result = prime * result + ((DeliveryDate == null) ? 0 : DeliveryDate.hashCode());
        result = prime * result + ((No_people == null) ? 0 : No_people.hashCode());
        result = prime * result + ((CatererName == null) ? 0 : CatererName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Orders other = (Orders) obj;
        if (order_id == null) {
            if (other.order_id != null)
                return false;
        } else if (!order_id.equals(other.order_id))
            return false;
        if (CustomerName == null) {
            if (other.CustomerName != null)
                return false;
        } else if (!CustomerName.equals(other.CustomerName))
            return false;
        if (PhoneNumber == null) {
            if (other.PhoneNumber != null)
                return false;
        } else if (!PhoneNumber.equals(other.PhoneNumber))
            return false;
        if (dishList == null) {
            if (other.dishList != null)
                return false;
        } else if (!dishList.equals(other.dishList))
            return false;
        if (DeliveryDate == null) {
            if (other.DeliveryDate != null)
                return false;
        } else if (!DeliveryDate.equals(other.DeliveryDate))
            return false;
        if (No_people == null) {
            if (other.No_people != null)
                return false;
        } else if (!No_people.equals(other.No_people))
            return false;
        if (CatererName == null) {
            if (other.CatererName != null)
                return false;
        } else if (!CatererName.equals(other.CatererName))
            return false;
        return true;
    }

    


    
}
