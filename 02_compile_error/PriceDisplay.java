
// Write a new class PriceDisplay with a 
// main method that defines two variables:
// one holding an item name (such as "Coffee machine")
// one holding a non-integer price (such as 15.99)
// Use System.out.printf and the format specifiers (using %) to print a string such as "The price for the item Coffee machine is 15.99"

class PriceDisplay {
    public static void main(String[] args) {
        String itemName = "Coffee Machine";
        Double price = 15.99;
        System.out.printf("The price for the item %s is %.2f \n", itemName, price);
    }
  }