/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js_sprint3;

public class Order_Delivery {
   String deliveryID;
   String order_time;
   String delivery_address;
   String reach_time;
   String customer;
   
public Order_Delivery(){}
public Order_Delivery(String deliveryID,String order_time,String delivery_address,String reach_time,String customer){
    this.deliveryID=deliveryID;
    this.delivery_address=delivery_address;
    this.order_time=order_time;
    this.reach_time=reach_time;
    this.customer = customer;
}

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getDeliveryID() {
        return deliveryID;
    }

    public void setDeliveryID(String deliveryID) {
        this.deliveryID = deliveryID;
    }

    public String getOrder_time() {
        return order_time;
    }

    public void setOrder_time(String order_time) {
        this.order_time = order_time;
    }

    public String getDelivery_address() {
        return delivery_address;
    }

    public void setDelivery_address(String delivery_address) {
        this.delivery_address = delivery_address;
    }

    public String getReach_time() {
        return reach_time;
    }

    public void setReach_time(String reach_time) {
        this.reach_time = reach_time;
    }

    @Override
    public String toString() {
        return "DeliveryID: " +deliveryID +" Order time: "+order_time+" Address: "+delivery_address+" Reach Time: "+reach_time;
    }
    
}