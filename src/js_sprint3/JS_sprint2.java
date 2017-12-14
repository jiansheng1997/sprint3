
package js_sprint3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class JS_sprint2 {

    Calendar cal = Calendar.getInstance();
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        
  List<Order_Delivery> Delivery_order = Arrays.asList(new Order_Delivery("D123",sdf.format(cal.getTime()),"Setapak"," ","michelle")
                                                      ,new Order_Delivery("D231",sdf.format(cal.getTime()),"Subang Jaya"," ","Jason")
                                                      ,new Order_Delivery("D265",sdf.format(cal.getTime()),"Kepong"," ","Peter"));
    
    public void delivery_time(){
       System.out.print("Enter your DeliveryID:");
       Scanner scanner = new Scanner (System.in);
       String deliveryid = scanner.next();
       while(deliveryid.length()!= 4||deliveryid.equals(" "))
        {
        System.out.print("Invalid Input! \nEnter your DeliveryID: ");
        deliveryid = scanner.next();
        }
       while(!deliveryid.equals(Delivery_order.get(0).getDeliveryID())&&!deliveryid.equals(Delivery_order.get(1).getDeliveryID())&&!deliveryid.equals(Delivery_order.get(2).getDeliveryID()))
       {
           System.out.print("Delivery ID not found! \nEnter your DeliveryID: ");
           deliveryid = scanner.next();
         while(deliveryid.length()!= 4||deliveryid.equals(" "))
         {
         System.out.print("Invalid Input! \nEnter your DeliveryID: ");
         deliveryid = scanner.next();
         }
       }
        for (int i = 0; i <Delivery_order.size(); i++) {
            if(deliveryid .equals(Delivery_order.get(i).getDeliveryID()) ){
                 cal.setTime(cal.getTime());
                cal.add(Calendar.MINUTE, 30);
                String reachtime = sdf.format(cal.getTime());
                System.out.println("Welcome "+ Delivery_order.get(i).getCustomer()+",");
                System.out.println("Your food order was order at:"+Delivery_order.get(i).getOrder_time()+" and will be arrived in "+reachtime);
                System.out.println("Your food order will be deliver to "+Delivery_order.get(i).getDelivery_address());
                System.out.println("If the information is wrong, please feedback us immediately.Thank you");

 
            }
        }
     
    
    }
    
    
    public static void main(String[] args) throws ParseException {
       
        JS_sprint2 js = new JS_sprint2();
        js.delivery_time();
        
    }
    
}
