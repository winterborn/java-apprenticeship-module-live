package game;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
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

@Test public void testGuessLetterWrongAndDisplayOriginalWord() {
  WordSelector mockedSelector = mock(WordSelector.class);
  when(mockedSelector.getRandomWordFromDictionary()).thenReturn("MAKERS");

  Game game = new Game(mockedSelector);

  assertEquals(game.guessLetter('O'), false);
  assertEquals(game.getWordToGuess(), "M_____");
}


@Test public void testShouldLoseGameIfNoAttemptsLeft() {
  WordSelector mockedSelector = mock(WordSelector.class);
  when(mockedSelector.getRandomWordFromDictionary()).thenReturn("MAKERS");

  Game game = new Game(mockedSelector);

  assertEquals(game.guessLetter('O'), false);
  assertEquals(game.guessLetter('O'), false);
  assertEquals(game.guessLetter('O'), false);
  assertEquals(game.guessLetter('O'), false);
  assertEquals(game.guessLetter('O'), false);
  assertEquals(game.guessLetter('O'), false);
  assertEquals(game.guessLetter('O'), false);
  assertEquals(game.guessLetter('O'), false);
  assertEquals(game.guessLetter('O'), false);
  assertEquals(game.guessLetter('O'), false);

  assertTrue("should lose game with no attempts left", game.isGameLost());
}

@Test public void testShouldWinGameAfterGuessingWord() {
  WordSelector mockedSelector = mock(WordSelector.class);
  when(mockedSelector.getRandomWordFromDictionary()).thenReturn("MAKERS");

  Game game = new Game(mockedSelector);

  assertEquals(game.guessLetter('A'), true);
  assertEquals(game.guessLetter('K'), true);
  assertEquals(game.guessLetter('E'), true);
  assertEquals(game.guessLetter('R'), true);
  assertEquals(game.guessLetter('S'), true);
 
  assertTrue("should win game when word is guessed", game.isGameWon());
}

@Test public void testIsWonWithSpecialWord() {
  WordSelector mockedSelector = mock(WordSelector.class);
  when(mockedSelector.getRandomWordFromDictionary()).thenReturn("COOOL");

  Game game = new Game(mockedSelector);
  game.guessLetter('C');
  game.guessLetter('O');
  game.guessLetter('L');

  assertEquals(game.isGameWon(), true);
}
}