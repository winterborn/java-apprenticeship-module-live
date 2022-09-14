package game;

import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;

public class Game {

    String str = this.getRandomWordFromDictionary();
    int remainingAttempts = 10;

    static final ArrayList<String> DICTIONARY = new ArrayList<>(Arrays.asList("MAKERS", "CANDIES", "DEVELOPER", "LONDON"));

    // // Constructor Method:
    // Game(String str) {
    //     this.str = this.getRandomWordFromDictionary();
    // }

    // str instance variable Getter method:
    public String getStr() {
        return this.str;
    }

    // remainingAttempts instance variable Getter method:
    public int getRemainingAttempts() {
        return this.remainingAttempts;
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.getWordToGuess();

        System.out.println("You have " + game.getRemainingAttempts() + " attempts remaining.");
        System.out.println(game.getStr());
    }

    // getRandomWordFromDictionary method:
    public String getRandomWordFromDictionary() {
        Random rand = new Random();
        String result = DICTIONARY.get(rand.nextInt(DICTIONARY.size()));
        return result;
    }

    // getWordToGuess method:
    public String getWordToGuess() {
        StringBuilder sb = new StringBuilder(this.str);  
        
        for (int i = 0; i < this.str.length(); i++) {
            if (i > 0) {
                sb.replace(i, i + 1, "_");
            }
        }

        String result = sb.toString();  
        System.out.println(result); //prints M______
        return result;
    }
}
