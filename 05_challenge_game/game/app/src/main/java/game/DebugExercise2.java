package game;

import java.util.Random;

public class DebugExercise2 {

    String str = this.getRandomWordFromDictionary();
    int remainingAttempts = 10;
    static final String[] DICTIONARY = {"MAKERS", "CANDIES", "DEVELOPER", "LONDON"};

    // str instance variable Getter method:
    public String getStr() {
    return this.str;
    }

    // remainingAttempts instance variable Getter method:
    public int getRemainingAttempts() {
        return this.remainingAttempts;
    }

    public static void main(String[] args) {
        DebugExercise2 debugExercise2 = new DebugExercise2();

        System.out.println("You have " + debugExercise2.getRemainingAttempts() + " attempts remaining.");
        System.out.println(debugExercise2.getStr());
    }

    // getRandomWordFromDictionary method:
    public String getRandomWordFromDictionary() {
        Random rand = new Random();
        String result = DICTIONARY[rand.nextInt(DICTIONARY.length)];
        return result;
    }
}
