package game;

import java.util.ArrayList;

public class Game {

    String str;
    private static ArrayList<Character> guessedLetters = new ArrayList<Character>();
    Integer remainingAttempts = 10;

    // Constructor Method:
    public Game(WordSelector selector) {
        str = selector.getRandomWordFromDictionary();
    }

    public static void main(String[] args) {
        WordSelector selector = new WordSelector();
        Game game = new Game(selector);
    
        System.out.println("The chosen word is: " + game.getWordToGuess() + "\n"); //prints M______
        System.out.println("You have " + game.remainingAttempts + " attempts remaining.\n");
        System.out.println("TEST_CHECK_STR_IS_RANDOM_AND_MATCHES_GETWORDTOGUESS: " + game.str);
    }

    // getWordToGuess method:
    public String getWordToGuess() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < this.str.length(); i++) {
            Character currentLetter = str.charAt(i);
            if (i == 0) {
                // first letter is always shown
                sb.append(currentLetter);
            } else {
                // show letter only if it was already guessed
                if (guessedLetters.indexOf(currentLetter) != -1) {
                    sb.append(currentLetter);
                } else {
                    sb.append("_");
                }
            }
        }
        return sb.toString();
    }

    // guessLetter method:
    public Boolean guessLetter(Character letter) {
        if (this.str.indexOf(letter) != -1) {
            guessedLetters.add(letter);
            return true;
        } else {
            remainingAttempts --;
            return false;
        }
    }    

    // isGameLost method:
    public Boolean isGameLost() {
        if (remainingAttempts == 0) {
            System.out.println("You've lost. Try again!");
            return true;
        } else {
            return false;
        }
    }

    // isGameWon method:
    public Boolean isGameWon() {
        // we start to scan the str at index 1,
        // as we want to omit the first letter (it's never guessed by the player!)
        for (int i = 1 ; i < str.length() ; i++) {
            Character letter = str.charAt(i);
            if (guessedLetters.indexOf(letter) == -1) {
                return false;
            }
        }
        return true;
    }
}
