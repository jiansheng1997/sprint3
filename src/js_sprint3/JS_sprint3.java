/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js_sprint3;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;


public class JS_sprint3 {
  List<Deliveryman> deliveryman = Arrays.asList(new Deliveryman("ALI","Available","DE5692"),
                                                new Deliveryman("ABU","Deliver","DE1111"),
                                                new Deliveryman("JASON","Available","DE1212"), 
                                                new Deliveryman("AH MING","Available","DE9843"),
                                                new Deliveryman("THOMAS","Break","DE9413"));

    
  List<Order_Delivery> Delivery_order = Arrays.asList(new Order_Delivery("D123","12:00","Setapak"," ","michelle")
                                                      ,new Order_Delivery("D231","12:45","Subang Jaya"," ","Jason")
                                                      ,new Order_Delivery("D265","14:00","Kepong"," ","Peter"));
  
  public void displayAvailable(){
      int a =1;
      System.out.println("Assign deliveryman to deliver food order");
      System.out.println("Deliveryman that are available.");
      System.out.println("N0.\tID\tName\t\tStatus");
      for (int i = 0; i < deliveryman.size(); i++) {
          if(deliveryman.get(i).deliveryman_status.equals("Available"))
          {
              
              System.out.printf("%d\t%s\t%-10s\t%s\n",a,deliveryman.get(i).getDeliveryman_Code() ,deliveryman.get(i).deliveryman_name,deliveryman.get(i).deliveryman_status);
              a++;
          }
      }
    
} 
  public void displayOrder(){
      System.out.println("\nOrder that are still pending to deliver");
      int count =1;
      System.out.println("No.\tOrderID\tOrder Time\tOrder Destination");
      for (Order_Delivery d : Delivery_order){
          System.out.printf("%d.\t%s\t%s\t\t%s\n",count,d.getDeliveryID(),d.getOrder_time(),d.getDelivery_address());
          
          count++;
      }
  }
  public void assign(){
   Scanner scanner = new Scanner(System.in);
    System.out.print("\nEnter deliverymanID to choose which employee to deliver order:");
   String deliverymanid = scanner.next();
   String deliveryman_name= " ";
   while(deliverymanid.length()!=6||deliverymanid.equals(null)){
  System.out.print("Invalid Input! Please enter again!\nEnter deliverymanID to choose which employee to deliver order:");
   deliverymanid = scanner.next();
   }
  for (int i = 0; i < deliveryman.size(); i++) {
          if(deliverymanid.equals(deliveryman.get(i).getDeliveryman_Code()))
          {
               deliveryman_name =  deliveryman.get(i).getDeliveryman_name();
               deliveryman.get(i).setDeliveryman_Status("Deliver");
              
          }
      }
  System.out.println("\nDeliveryman "+deliveryman_name +" are assigned to deliver "+"order "+Delivery_order.get(0).getDeliveryID()+".");
  
  System.out.println("\nLatest status of every deliveryman");
   System.out.println("N0.\tID\tName\t\tStatus");
   int a=1;
      for (int i = 0; i < deliveryman.size(); i++) {
          
          {
              System.out.printf("%d\t%s\t%-10s\t%s\n",a,deliveryman.get(i).getDeliveryman_Code() ,deliveryman.get(i).deliveryman_name,deliveryman.get(i).deliveryman_status);
              a++;
          }
      }
  }
  
  
    public static void main(String[] args) {
       JS_sprint3 js3 = new JS_sprint3();
       js3.displayAvailable();
       js3.displayOrder();
       js3.assign();
    }
    
}
