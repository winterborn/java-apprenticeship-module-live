package game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class WordSelector {

    public static void main(String[] args) {
        // WordSelector ws = new WordSelector();
        // System.out.println(ws.getRandomWordFromDictionary());
    }

    public static final ArrayList<String> DICTIONARY = new ArrayList<>(Arrays.asList("MAKERS", "CANDIES", "DEVELOPER", "LONDON"));

    public String getRandomWordFromDictionary() {
        Random rand = new Random();
        String result = DICTIONARY.get(rand.nextInt(DICTIONARY.size()));
        return result;
    }
}
