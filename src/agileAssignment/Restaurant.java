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
public class Restaurant {
    private String[] name={"Rapapa Restaurant","Mcd","KFC","Sushi Mentai","FunOK Restaurant"};
    private String[][] menu={{"Mushroom Chicken Pasta","Chicken Chop","Nasi Lemak","Black Pepper Chicken Rice"},
                             {"Filet-O-Fish","McChicken","Double CheeseBurger","GCB","Big Mac","Spicy Chicken McDeluxe"},
                             {"Chicken Zinger","Veg Zinger","Rice Meal Box","Hot & Crispy Chicken","Cheesy Wedges"},
                             {"Salmon","Kani Maki","Tamago Maki","Unagi","Inari Ebiko","Cheese Chu Maki","Tempura Udon"},
                             {"Chao Gui Diao","Wan Dan Hor","Yee Mee Soup with Egg","Fried Rice"}};
    private double[][] price={{5.00,5.50,3.50,5.80,},
                              {8.99,8.99,9.50,12.50,10.99,11.50,},
                              {5.30,7.00,8.80,6.60,5.00},
                              {2.80,2.80,1.80,3.80,1.80,2.80,9.90}, 
                              {6.50,4.80,4.60,5.00} };
            Scanner sc=new Scanner(System.in);
            int no;
            int rs;
            int qty;
            Order od=new Order();
    
     public Restaurant(){
        name=name;
        menu=menu;  
        
    }
    
     public void setResNo(int res){
         rs=res-1;
     }
     
    public Restaurant(String[] nm,String[][] mn){
        name=nm;
        menu=mn;
    }
    
    public int ChooseRes(){
        String res="\n";
       
        do{
        for(int i=0;i<name.length;i++){
        res+=(i+1)+". "+name[i]+"\n";
        }
        res+="Please select a Restaurant >";
        System.out.print(res);
        no=sc.nextInt();
        
        } while(no<1||no>name.length);
        setResNo(no);
        return no;
    }
    
    
    
      public void ChooseMenu(int res){
        
        ArrayList<Order> list=new ArrayList<Order>();
        int choice=1;
        int num=0;
        
        do{
            do{
            String m="\n\t\tMenu\t\t|\tPrice\n===================================================\n";
        for(int i=0;i<menu[res].length;i++){
            
        m+=(i+1)+". "+String.format("%-28s", menu[res][i])+" |  "+String.format("RM %.2f", price[res][i])+"\n";
        }
        System.out.println(m);
        System.out.print("Order >");
         no=sc.nextInt();
         do{
        System.out.print("Quantity(1 to 10) >");
         qty=sc.nextInt();
         }while(qty<1||qty>10);
         
         if(no>=1&&no<menu[res].length){
        // String fd=qty+" "+menu[res][(no-1)];
            Order od=new Order(menu[res][no-1],qty,price[res][no-1]);
             list.add(od);
                 
           System.out.print("Continue order? (Exit=0)>");
           choice=sc.nextInt();
           
         }

         
        }while(no<1||no>menu[res].length); 
        
      } while(choice!=0);
    
        od.setOrderList(list);
    
      }  
      
      
        public void displayOrderList(){
            int c;
            String ol="===================================================\nNo    Order List\t     　  |\tPrice\n===================================================\n";
        for(int i=0;i<od.getOrderList().size();i++){
            ol+=(i+1)+")  "+String.format("%-28s", od.getOrderList().get(i).getQty()+" "+od.getOrderList().get(i).getFoodNm())
                    +" | "+String.format("RM %.2f", od.getOrderList().get(i).getPrice())+"\n";
            
        }
        ol+="***************************************************\n\t\t\t\t | RM "+od.calTotal(od.getOrderList())+"\n***************************************************";
        do{
               System.out.println(ol);
               System.out.print("(1-Confirm 2-Cancel) >");
               c=sc.nextInt();
        }while(c!=1&&c!=2);
    }  
    
      
      
    public void setName(String[] nm){
        name=nm;
    }
    
    
}




