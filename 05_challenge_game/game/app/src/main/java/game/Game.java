package game;

import java.util.ArrayList;

public class Game {

    private String str;
    private ArrayList<Character> guessedLetters = new ArrayList<Character>();
    private Integer remainingAttempts = 10;

    // Constructor Method:
    public Game(WordSelector selector) {
        str = selector.getRandomWordFromDictionary();
    }

    public static void main(String[] args) {
        /*
        Game game = new Game();
        game.getWordToGuess();

        System.out.println("The chosen word is: " + game.getWordToGuess() + "\n"); //prints M______
        System.out.println("You have " + game.remainingAttempts + " attempts remaining.\n");
        System.out.println("TEST_CHECK_STR_IS_RANDOM_AND_MATCHES_GETWORDTOGUESS: " + game.str);
        */
    }

    // getWordToGuess method:
    public String getWordToGuess() {
        StringBuilder sb = new StringBuilder(str);  
        
        for (int i = 0; i < str.length(); i++) {
            if (i > 0) {
                sb.replace(i, i + 1, "_");
            }
        }

        String result = sb.toString();  
        return result;
    }

    public Boolean guessLetter(Character letter) {
        if (this.str.indexOf(letter) != -1) {
            guessedLetters.add(letter);
            return true;
        } else {
            remainingAttempts --;
            return false;
        }
    }    
}
