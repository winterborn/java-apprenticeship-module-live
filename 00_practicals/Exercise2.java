// Example 2:

import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    ArrayList<> names = new ArrayList<>();

    names.add("Kyle");
    names.add("Sophie");
    names.add("Graeme");

    nameToFind = "Lisa";

    App app = new App();
    result = app.isInArray(names, nameToFind);

    if (result) {
      System.out.println("The name is in the array. Yay!");
    } else {
      System.out.println("The name couldn't be found in the array — sorry...");
    }
  }

  public isInArray(names, nameToFind) {
    for (String name : names) {
      if (name == nameToFind) {
        return true;
      }
    }

    return false;
  } 
}