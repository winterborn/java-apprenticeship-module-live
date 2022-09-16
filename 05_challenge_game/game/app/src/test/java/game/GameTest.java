package game;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class GameTest {
  @Test public void testGetsWordToGuess1() {
    WordSelector mockedSelector = mock(WordSelector.class);
    when(mockedSelector.getRandomWordFromDictionary()).thenReturn("DEVELOPER");

    Game game = new Game(mockedSelector);
    String str = "D________";

    assertEquals("returns str passed through constructor method", game.getWordToGuess(), str);
  }

  @Test public void testGetsWordToGuess2() {
    WordSelector mockedSelector = mock(WordSelector.class);
    when(mockedSelector.getRandomWordFromDictionary()).thenReturn("DEVELOPER");

    Game game = new Game(mockedSelector);

    assertEquals("returns str passed through constructor method", "D________", game.getWordToGuess());
  }

  @Test public void testGetsWordToGuessWithRandomWord() {
    WordSelector mockedSelector = mock(WordSelector.class);
    when(mockedSelector.getRandomWordFromDictionary()).thenReturn("DEVELOPER");

    Game game = new Game(mockedSelector);

    assertEquals("D________", game.getWordToGuess());
  }

  @Test public void testGuessLetterRight() {
    WordSelector mockedSelector = mock(WordSelector.class);
    when(mockedSelector.getRandomWordFromDictionary()).thenReturn("MAKERS");

    Game game = new Game(mockedSelector);

    assertEquals(game.guessLetter('K'), true);
  }

  @Test public void testGuessLetterWrong() {
    WordSelector mockedSelector = mock(WordSelector.class);
    when(mockedSelector.getRandomWordFromDictionary()).thenReturn("MAKERS");

    Game game = new Game(mockedSelector);

    assertEquals(game.guessLetter('O'), false);
}

@Test public void testGuessLetterRightAndDisplayGuessedLetter() {
  WordSelector mockedSelector = mock(WordSelector.class);
  when(mockedSelector.getRandomWordFromDictionary()).thenReturn("MAKERS");

  Game game = new Game(mockedSelector);

  assertEquals(game.guessLetter('K'), true);
  assertEquals(game.getWordToGuess(), "M_K___");
}

@Test public void testGuessLetterWrongAndDisplayWordToGuess() {
  WordSelector mockedSelector = mock(WordSelector.class);
  when(mockedSelector.getRandomWordFromDictionary()).thenReturn("MAKERS");

  Game game = new Game(mockedSelector);

  assertEquals(game.guessLetter('O'), false);
  assertEquals(game.getWordToGuess(), "M_____");
}
}