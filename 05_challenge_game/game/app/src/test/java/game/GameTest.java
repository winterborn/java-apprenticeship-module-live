package game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {
  @Test public void testGetsWordToGuess() {
    Game game = new Game();
    assertEquals("returns blanked out letters after first letter", "M_____", game.getWordToGuess());
  }

  @Test public void testGetsRemainingAttempts() {
    Game game = new Game();
    assertEquals("gives a number of 10 remaining attempts available", 10, game.getRemainingAttempts());
  }
}