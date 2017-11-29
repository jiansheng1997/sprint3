package menuadding;
import java.util.*;
import menuadding.MenuAdding;

public class test {

    LinkedList<Menu> menuArray = new LinkedList<>();
    static int theselect=0;
    
    public test(){
        menuArray.add(new Menu("A0001", "Pikachu Meat", 5.90, "Best meat ever", 120, "Available"));
        menuArray.add(new Menu("A0002", "Vege Pizza", 10.90, "Best pizza ever", 343, "Available"));
        menuArray.add(new Menu("A0003", "Croissant bread", 2.45, "Best bread ever", 75, "Available"));
        
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        test t = new test();
        

        
        t.displayMenu();
        
        
    }

    private void displayMenu() {
        System.out.println("TO PROVE THAT THE ITEM IS ADDED\n===============================");
        for (Menu a : menuArray)
            System.out.printf("%s, %s, RM %.2f, %s, %d kcal, %s\n", a.foodCode, a.foodName, a.price, a.description, a.calories, a.status);System.out.println("Please select the following: ");
        System.out.println("1. Delete new item to menu");
        System.out.print("Your choice: ");
        Scanner ss = new Scanner(System.in);
        theselect = ss.nextInt();
        
        menuArray.remove(theselect);
        
        System.out.println("TO PROVE THAT THE ITEM IS ADDED\n===============================");
        for (Menu a : menuArray)
            System.out.printf("%s, %s, RM %.2f, %s, %d kcal, %s\n", a.foodCode, a.foodName, a.price, a.description, a.calories, a.status);

    }
    
}
