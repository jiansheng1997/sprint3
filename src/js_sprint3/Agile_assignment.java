
package js_sprint3;

import java.util.*;
public class Agile_assignment {
List<Deliveryman> deliveryman = Arrays.asList(new Deliveryman("Ali","Busy","1111"),
                                        new Deliveryman("Michelle","Available","1212"), 
                                        new Deliveryman("Micheal","Delivery","2121"));


    public void UpdateStatus(){
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your Employee ID:");
        String code = scanner.nextLine();
         while(!code.matches("\\d{4}")||code.equals(" "))
        {
        System.out.print("Please enter only 4 digit number! \nPlease enter your Employee ID: ");
        code = scanner.nextLine();
        }
        while(!code.equals(deliveryman.get(0).getDeliveryman_Code())&&!code.equals(deliveryman.get(1).getDeliveryman_Code())&&!code.equals(deliveryman.get(2).getDeliveryman_Code())){
            System.out.println("Invalid Employee ID. Please enter again");
            System.out.print("Please enter your Employee ID:");
            code = scanner.nextLine();
           while(!code.matches("\\d{4}")||code.equals(" "))
        {
        System.out.print("Please enter only 4 digit number! \nPlease enter your Employee ID: ");
        code = scanner.nextLine();
        }
        }
            
               
                for (int a=0;a<deliveryman.size();a++)
                {
                 if (code.equals(deliveryman.get(a).getDeliveryman_Code()))
                  {
                      
                     System.out.println("Welcome Back "+deliveryman.get(a).getDeliveryman_name()+" !");
                System.out.println("Your current status: "+deliveryman.get(a).getDeliveryman_Status());
                String name = deliveryman.get(a).getDeliveryman_name();
                System.out.print("1.Please choose choice between 1-3 to update the status. \n1.Available \n2.Delivery \n3.Break \nYour choice:");
                String status = scanner.nextLine();
                
            
             while(!status.matches("\\d{1}")||status.equals(" "))
             {
             System.out.print("Invalid input! \n1.Please choose choice between 1-3 to update the status. \n1.Available \n2.Delivery \n3.Break \nYour choice:");
             status = scanner.nextLine();
             }
             
             if(status.equals("1")){
                 status = "Available";
             }else if(status.equals("2")){
                 status = "Delivery";
             }else if(status.equals("3")){
                 status = "Break";
             }
             
              Deliveryman e = new Deliveryman(name,status,code);
              System.out.println("You have successfully update your status.");
              System.out.println(e.toString());
              System.exit(0);
                          
                      }
                } 
    }
    
    public static void main(String[] args) {
        Agile_assignment as = new Agile_assignment();
        as.UpdateStatus();
    }
    
}
