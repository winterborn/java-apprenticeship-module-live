package shopping_list;

public class ShoppingItem {

    String name;
    Double price;

     // Constructor Method:
     public ShoppingItem(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public static void main(String[] args) {
        ShoppingItem si = new ShoppingItem("HP Sauce", 4.99);
        System.out.println(si.getName() + " " + "£" + si.getPrice());
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}
