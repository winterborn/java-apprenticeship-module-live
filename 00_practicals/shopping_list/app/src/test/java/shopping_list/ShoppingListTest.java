package shopping_list;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ShoppingListTest {
    @Test public void testShouldGetAnEmptyList() {
        ShoppingList sl = new ShoppingList();
        sl.getList().isEmpty();
        assertTrue("checks array list is empty", sl.getList().isEmpty());
    }

    @Test public void testShouldCheckForAllItems() {
        ShoppingList sl = new ShoppingList();
        sl.addItem("Milk");
        sl.addItem("Tea");
        assertEquals("checks array list length == 2; num of added items", sl.getList().size(), 2);
    }

    @Test public void testShouldAddItemToList() {
        ShoppingList sl = new ShoppingList();
        sl.addItem("Milk");
        sl.addItem("Bread");
        sl.addItem("Eggs");
        sl.addItem("Tea");
        // assertTrue("checks items have been added to list", sl.getList().contains("Milk"));
        assertEquals("checks all items have been added to list", sl.getList().toString(), "[Milk, Bread, Eggs, Tea]");
    }
}
