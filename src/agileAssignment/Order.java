/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agileAssignment;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user1
 */
public class Order {
    
    private String foodNm;
    private int qty;
    private double price;
    private double totalP=0;
    
    private ArrayList<Order> orderList;
    private String restaurantNm;
    
    public Order(){}
    
    public Order(String fn,int q,double p){
        foodNm=fn;
        qty=q;
        price=p;
    }
    
    public String getFoodNm(){
        return foodNm;
    }
    
    public int getQty(){
        return qty;
    }
        
     public double getPrice(){
        return price;
    }
    
     
     
    public void setOrderList(ArrayList<Order> od){
        orderList=od;
    }
    
    
    public ArrayList<Order> getOrderList(){
        return orderList;
    }    
    
    public double calTotal(ArrayList<Order> od){
        for(int i=0;i<od.size();i++){
            totalP+=(od.get(i).getPrice()*od.get(i).getQty());
        }
        
        return totalP;
    }
    
    public void setResNm(String rs){
        restaurantNm=rs;
    }
    
    public String getResNm(){
        return restaurantNm;
    }    
    
    
    public static void main(String []args){
        int no;
        Scanner sc=new Scanner(System.in);
        Order od=new Order();
        Restaurant r=new Restaurant();
        no=r.ChooseRes();
        System.out.println();
        r.ChooseMenu((no-1));
        System.out.println();
        r.displayOrderList();
        
        
    }
}
