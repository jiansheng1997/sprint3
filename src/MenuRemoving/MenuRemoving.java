package MenuRemoving;
import java.util.LinkedList;
import java.util.Scanner;
import menuadding.Menu;

public class MenuRemoving {

    LinkedList<Menu> lMenu=new LinkedList<>(); 
    
    public MenuRemoving(){
        lMenu.add(new Menu("A0001", "Pikachu Meat", 5.90, "Best meat ever", 120, "Available"));
        lMenu.add(new Menu("A0002", "Vege Pizza", 10.90, "Best pizza ever", 343, "Available"));
        lMenu.add(new Menu("A0003", "Croissant bread", 2.45, "Best bread ever", 75, "Available"));
        System.out.println("Please select the following: ");
        System.out.println("1. Remove item from menu");
        System.out.print("Your choice: ");
    }
    
    public void removeItemFunction(){
        System.out.println("\nThese are the items that can be removed.");
        for (Menu a : lMenu)
            System.out.printf("%-7s\t%-20s\tRM %7.2f\t%-20s\t%4d kcal\t%-10s\n", a.getFoodCode(), a.getFoodName(), a.getPrice(), a.getDescription(), a.getCalories(), a.getStatus());
        System.out.print("\nEnter the food code to remove: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while(input.trim().isEmpty()){
            System.out.print("Blank is not allowed!\nEnter the food code to remove: ");
            input = scanner.nextLine();
        }
        removeItem(input);
    }
    
    public void removeItem(String input){
        int count = 0;
        do{
            for (int i = 0 ; i < lMenu.size() ; i++){
            if(input.equals(lMenu.get(i).getFoodCode())){
                lMenu.remove(i);
                count++;
            }
        }
        if (count == 1){
            System.out.println("Item successfully removed.\n");
            displayMenu();
        }
        else{
            System.out.print("Item not found!\tEnter the food code to remove: ");
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextLine();
        }
       }while(count == 0);
    }
    
    public void displayMenu(){
        System.out.println("LATEST MENU\n===========");
        for (Menu a : lMenu)
            System.out.printf("%-7s\t%-20s\tRM %7.2f\t%-20s\t%4d kcal\t%-10s\n", a.getFoodCode(), a.getFoodName(), a.getPrice(), a.getDescription(), a.getCalories(), a.getStatus());
    }
    
   
    public static void main(String[] args) {
        MenuRemoving menuRemove = new MenuRemoving();
        Scanner scanner1 = new Scanner(System.in);
        scanner1.useDelimiter("");
        while(!scanner1.hasNext("1")){                         
            System.out.print("Your choice: ");
            scanner1.nextLine();
        }
        int choice = scanner1.nextInt();
        menuRemove.removeItemFunction();
    }
    
}
