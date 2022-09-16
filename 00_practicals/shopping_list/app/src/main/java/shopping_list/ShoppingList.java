package shopping_list;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {
    
    // Simple ArrayList for ShoppingList class:
    // static ArrayList<String> shopList = new ArrayList<String>(Arrays.asList());

    // ArrayList holds array of ShoppingItem instances:
    static ArrayList<ShoppingItem> shopList = new ArrayList<ShoppingItem>(Arrays.asList());
    

    public static void main(String[] args) {
        ShoppingList sl = new ShoppingList();
        // Add items to ArrayList and print items within this class:
        // sl.addItem("Bread");
        // sl.addItem("Eggs");
        // sl.addItem("Tea");
        // System.out.println("ArrayList: " + sl.getList());

        // Add ShoppingItem items and use of for-each loop to print each:
        sl.addItem(new ShoppingItem("Coffee", 2.99));
        sl.addItem(new ShoppingItem("Bacon", 3.99));
        sl.addItem(new ShoppingItem("HP Sauce", 1.99));
        
        System.out.println("ArrayList Items:");
        for(ShoppingItem item : shopList) {
            System.out.println(item.getName() + ": " + "£" + item.getPrice());
        }
    }

    public void addItem(ShoppingItem shoppingItem) {
        shopList.add(shoppingItem);
    }

    public ArrayList<ShoppingItem> getList() {
        return shopList;
    }
}
