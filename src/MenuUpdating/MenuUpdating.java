package MenuUpdating;
import java.util.LinkedList;
import java.util.Scanner;

public class MenuUpdating {
    LinkedList<Menu> lMenu=new LinkedList<>(); 
    
    public MenuUpdating(){
        lMenu.add(new Menu("A0001", "Pikachu Meat", 5.90, "Best meat ever", 120, "Available"));
        lMenu.add(new Menu("A0002", "Vege Pizza", 10.90, "Best pizza ever", 343, "Available"));
        lMenu.add(new Menu("A0003", "Croissant bread", 2.45, "Best bread ever", 75, "Available"));
        System.out.println("Please select the following: ");
        System.out.println("1. Update item from menu");
        System.out.print("Your choice: ");
    }
    
    public void updateItemFunction(){
        System.out.println("\nThese are the items that can be updated.");
        System.out.printf("Food Code\tFood Name\t\tPrice\t\tDescription\t\tCalories\tStatus\n");
        System.out.println("=========\t=========\t\t=====\t\t===========\t\t========\t======");
        for (Menu a : lMenu)
            System.out.printf("%-15s\t%-20s\tRM %7.2f\t%-20s\t%4d kcal\t%-10s\n", a.getFoodCode(), a.getFoodName(), a.getPrice(), a.getDescription(), a.getCalories(), a.getStatus());
        System.out.print("\nEnter the food code to update: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while(!input.matches("A\\d{4}") || !findFood(input)){
            if (input.trim().isEmpty()) {
                System.out.print("Blank is not allowed!\nEnter the food code to update: ");
                input = scanner.nextLine();
            }
            else if(!input.matches(".\\d{4}")){
                System.out.print("Invalid food code format!\nEnter the food code to update: ");
                input = scanner.nextLine();
            }
            else{
                System.out.print("Food does not exist!\nEnter the food code to update: ");
                input = scanner.nextLine();
            }
        }
        updateItem(input);
    }
    
    public void updateItem(String input){
        
            int foodIndex=0 ,count = 0;
            for (int i = 0 ; i < lMenu.size() ; i++){
                if (lMenu.get(i).getFoodCode().equals(input)) {
                    foodIndex = i;
                    count++;
                }
            }
            if (count == 1) {
            System.out.printf("\nFood Name: %s\nPrice: RM%5.2f\nDescription: %s\nCalories: %d\nStatus: %s\n\n",lMenu.get(foodIndex).foodName, lMenu.get(foodIndex).price, lMenu.get(foodIndex).description, lMenu.get(foodIndex).calories, lMenu.get(foodIndex).status);
            System.out.println("Fields as below are available to be updated.\n1. Food Name\n2. Price\n3. Description\n4. Calories\n5. Status");
            System.out.print("Your selection: ");
            Scanner scanner = new Scanner(System.in);
            String selection = scanner.nextLine();
            while(!selection.matches("[1-5]")){
                System.out.print("Invalid selection!\nYour selection: ");
                selection = scanner.nextLine();
            }
            int choice = Integer.parseInt(selection);
            switch (choice) {
                case 1:
                    updateName(foodIndex);
                    break;
                case 2:
                    updatePrice(foodIndex);
                    break;
                case 3:
                    updateDescription(foodIndex);
                    break;
                case 4:
                    updateCalories(foodIndex);
                    break;
                default:
                    updateStatus(foodIndex);
                    break;
            }
            displayMenu();
        }
        
    }
    
    public void updateName(int position){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter new food name: ");
        String foodName = scanner.nextLine();
        while(!foodName.matches("[A-Za-z ]+") || foodName.trim().isEmpty()){
            System.out.print("Alphabets only!\nPlease enter new food name: ");
            foodName = scanner.nextLine();
        }
        lMenu.set(position, new Menu(lMenu.get(position).getFoodCode(),foodName, lMenu.get(position).getPrice(), lMenu.get(position).getDescription(), lMenu.get(position).getCalories(), lMenu.get(position).getStatus()));
        System.out.println("\nMenu updated successfully.");
    }
    
    public void updatePrice(int position){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter new price: RM ");
        String priceString = scanner.nextLine();
        while(!isDouble(priceString) || priceString.trim().isEmpty() || Double.parseDouble(priceString) <= 0 ){
            System.out.print("Please enter a valid format!\nPlease enter new price: RM ");
            priceString = scanner.nextLine();
        }
        double price = Double.parseDouble(priceString);
        lMenu.set(position, new Menu(lMenu.get(position).getFoodCode(),lMenu.get(position).getFoodName(), price, lMenu.get(position).getDescription(), lMenu.get(position).getCalories(), lMenu.get(position).getStatus()));
        System.out.println("\nMenu updated successfully.");
    }
    
    public void updateDescription(int position){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new description: ");
        String description = scanner.nextLine();
        while(description.trim().isEmpty()){
            System.out.print("Blank is not allowed!\nEnter new description: ");
            description = scanner.nextLine();
        }
        lMenu.set(position, new Menu(lMenu.get(position).getFoodCode(),lMenu.get(position).getFoodName(), lMenu.get(position).getPrice(), description, lMenu.get(position).getCalories(), lMenu.get(position).getStatus()));
        System.out.println("\nMenu updated successfully.");
    }
    
    public void updateCalories(int position){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter new calories(kcal): ");
        String caloriesString = scanner.nextLine();
        while(!isInt(caloriesString) || caloriesString.trim().isEmpty() || Integer.parseInt(caloriesString) <= 0 ){
            System.out.print("Please enter a valid format!\nPlease enter new calories(kcal): ");
            caloriesString = scanner.nextLine();
        }
        int calories = Integer.parseInt(caloriesString);
        lMenu.set(position, new Menu(lMenu.get(position).getFoodCode(),lMenu.get(position).getFoodName(), lMenu.get(position).getPrice(), lMenu.get(position).getDescription(), calories, lMenu.get(position).getStatus()));
        System.out.println("\nMenu updated successfully.");
    }
    
    public void updateStatus(int position){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter new status: ");
        String status = scanner.nextLine();
        while(!status.matches("[A-Za-z ]+") || status.trim().isEmpty()){
            System.out.print("Alphabets only!\nPlease enter new status: ");
            status = scanner.nextLine();
        }
        lMenu.set(position, new Menu(lMenu.get(position).getFoodCode(),lMenu.get(position).getFoodName(), lMenu.get(position).getPrice(), lMenu.get(position).getDescription(), lMenu.get(position).getCalories(), status));
        System.out.println("\nMenu updated successfully.");
    }
    
    public boolean findFood(String input){
        int count = 0;
        boolean found = false;
        
            for (int i = 0 ; i < lMenu.size() ; i++){
            if(input.equals(lMenu.get(i).getFoodCode()))
                count++;
        }
        if (count == 1)
            found = true;
       
       return found; 
    }
    
    public boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public boolean isInt(String str){
        try{
            Integer.parseInt(str);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
    
    public void displayMenu(){
        System.out.println("LATEST MENU\n===========");
        System.out.println("Food Code\tFood Name\t\tPrice\t\tDescription\t\tCalories\tStatus");
        System.out.println("=========\t=========\t\t=====\t\t===========\t\t========\t======");
        for (Menu a : lMenu)
            System.out.printf("%-10s\t%-20s\tRM %7.2f\t%-20s\t%4d kcal\t%-10s\n", a.getFoodCode(), a.getFoodName(), a.getPrice(), a.getDescription(), a.getCalories(), a.getStatus());
    }
    
    public static void main(String[] args) {
        MenuUpdating menuUpdate = new MenuUpdating();
        Scanner scanner1 = new Scanner(System.in);
        scanner1.useDelimiter("");
        while(!scanner1.hasNext("1")){                         
            System.out.print("Your choice: ");
            scanner1.nextLine();
        }
        int choice = scanner1.nextInt();
        menuUpdate.updateItemFunction();
    }
    
}
