package game;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;

public class WordSelectorTest {
    @Test public void testShouldGetRandomWordFromDictionary() {
        WordSelector wordSelector = new WordSelector();
        ArrayList<String> MOCK_DICTIONARY = new ArrayList<>(Arrays.asList("MAKERS", "CANDIES", "DEVELOPER", "LONDON"));

        assertTrue(MOCK_DICTIONARY.contains(wordSelector.getRandomWordFromDictionary()));
    }
}
