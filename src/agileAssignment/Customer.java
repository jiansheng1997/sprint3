/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agileAssignment;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Customer {
   private String custID;
   private String name;
   private String phoneNo;
   private String address;
   private String orderID;
   private ArrayList<Customer> cust=new ArrayList<Customer>();
    
    public Customer(){
    
    }

    public void initializeCustomer(){
        Customer c1=new Customer("C1000","OD100","Phuah Wai Yan","0191738031","Batu 9, Jalan Banting -Klang, Telok Panglima Garang Industrial Estate");
        Customer c2=new Customer("C1001","OD101","Quek Wei Jian","0141324324","28-01, Jalan Molek 1/10, Taman Molek");
        Customer c3=new Customer("C1002","OD131","Ng Yi Sam","0129274024","No 2754, 2nd floor, Jalan Chain Ferry Taman Inderawasih");
        Customer c4=new Customer("C1003","OD032","Seong Jian Sheng","0169274024","No 2754, 2nd floor, Jalan Chain Ferry Taman Inderawasih");
 
        cust.add(c1);
        cust.add(c2);
        cust.add(c3);
        cust.add(c4);
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }
    
    public Customer(String custID,String oID, String name, String phoneNo, String address) {
        this.custID = custID;
        this.name = name;
        this.orderID=oID;
        this.phoneNo = phoneNo;
        this.address = address;
    }

    public String getCustID() {
        return custID;
    }

    public void setCustID(String custID) {
        this.custID = custID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public Customer retrieveInfo(String phoneNo){
        Customer cus=null;
  
        for(int i=0;i<cust.size();i++){
        if(phoneNo.equals(cust.get(i).getPhoneNo()))
            cus=cust.get(i);   
        }
        return cus;
    }
    
    public void DisplayCustInfo(Customer c){
        System.out.println("Customer ID :"+c.getCustID());
        System.out.println("Name :"+c.getName());
        System.out.println("Order ID:"+c.getOrderID());
        System.out.println("Phone Number :"+c.getPhoneNo());
        System.out.println("Address :"+c.getAddress());
    }
}
