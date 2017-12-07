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
    
    public String confirmation(int c){
        String message="";
        if(c==1){
            message="Order Successful!";
        }else if(c==2){
            message="Order Cancel";
        }
        return message;
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
        boolean ck=true;
Customer c=new Customer();
        c.initializeCustomer();
        int no;
        Scanner sc=new Scanner(System.in);
        Order od=new Order();
        do{
        System.out.println("\n1. Make Order");
        System.out.println("2. Retrieve customer info");
        System.out.println("0. Exit");  
        System.out.print("Enter your choice:");
        no=sc.nextInt();        
        if(no==1){
         Restaurant r=new Restaurant();
         no=r.ChooseRes();
         System.out.println();
         r.ChooseMenu((no-1));
         System.out.println();
         r.displayOrderList();
        }
        else if (no==2){
            ck=choice2();
        
        } else{
        ck=false;
        }
            
        }while(ck==false);
    }
    
    
    
       public static boolean choice2(){
          String phoneNo;
                  Customer c=new Customer();
          Scanner sc=new Scanner(System.in);
          Customer cc=new Customer();
          int count=0;
          boolean ck=true;
do{
           
          System.out.print("Enter the customer phone number to retrieve the customer information :");
          phoneNo=sc.next();
          cc=c.retrieveInfo(phoneNo);
           count++;
           if(count==3){
         System.out.println("\nThe phone number cannot found.");
         ck=false;
            break;
           }
        }while(cc==null);
        if(ck==true)
          c.DisplayCustInfo(cc);
        
        return ck;
        }

}

