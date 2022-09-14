
// Declare a variable called greeting to contain the string "Hello" and one variable called name to contain the name of someone from your group. Concatenate those two variables into a variable result and use System.out.printf to print the string "Hello "

// Declare a new variable age to contain someone's age. Use the three variables greeting, name and age to print a message such as "Hello , you are years old".

class App {
    public static void main(String[] args) {
        String greeting = "Hello";
        String name = "Phil";
        Integer age = 33;

        System.out.printf("%s, %s, you are %d years old. \n", greeting, name, age);
    }
}