import java.util.Scanner;

// Your job is to return the middle letter of a word. If the word's length is odd, return the middle letter. If the word's length is even, return the middle 2 letters.

// Approach:

// * Get string whose middle character is to be found.
// * Get length of string.
// * Find index of middle character of string.
// * Print middle character of string at middle index.

class MiddleLetter {
    public static void main(String[] args) {

        // Take String input:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");

        // Reads String input:
        String str = scanner.nextLine();   
        System.out.print("You have entered: " + str + "\n");

        // Finding length of String:
        // Float str_length = (float) str.length();
        // System.out.println("The length of the string " + str + " is " + str_length + " characters.");

        // Return statement:
        System.out.println("The middle character(s) in the string: " + str + " = " + middle(str) + "\n");
    }

    public static String middle(String str) {
        int index;
        int length;

        if (str.length() % 2 == 0) {
            index = str.length() / 2 - 1;
            length = 2;
        }
        else {
            index = str.length() / 2;
            length = 1;
        }

        return str.substring(index, index + length);
    }
}