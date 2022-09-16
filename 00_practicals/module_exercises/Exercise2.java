// Example 2:

// import java.util.ArrayList;

// public class App {
//   public static void main(String[] args) {
//     ArrayList<> names = new ArrayList<>();

//     names.add("Kyle");
//     names.add("Sophie");
//     names.add("Graeme");

//     nameToFind = "Lisa";

//     App app = new App();
//     result = app.isInArray(names, nameToFind);

//     if (result) {
//       System.out.println("The name is in the array. Yay!");
//     } else {
//       System.out.println("The name couldn't be found in the array — sorry...");
//     }
//   }

//   public isInArray(names, nameToFind) {
//     for (String name : names) {
//       if (name == nameToFind) {
//         return true;
//       }
//     }

//     return false;
//   } 
// }


// Example 2: Fixed missing String nameToFind, Boolean result and boolean isInArray(ArrayList<String>, String nameToFind)

import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<String>();

    names.add("Kyle");
    names.add("Sophie");
    names.add("Graeme");

    String nameToFind = "Lisa";

    App app = new App();
    Boolean result = app.isInArray(names, nameToFind);

    if (result) {
      System.out.println("The name is in the array. Yay!");
    } else {
      System.out.println("The name couldn't be found in the array — sorry...");
    }
  }

  public boolean isInArray(ArrayList<String> names, String nameToFind) {
    for (String name : names) {
      if (name == nameToFind) {
        return true;
      }
    }

    return false;
  } 
}