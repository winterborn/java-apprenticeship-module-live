package game;

public class DebugExercise3 {

    // Broken:
    public Boolean guessLetter(String letter) {
        if (this.word.indexOf(letter) == -1) {
            remainingAttempts--;
            return 0;
        } else {
            guessedLetters.add(letter);
            return 1;
        }
    }

    // Fixed:
    public Boolean guessLetter(Character letter) {
        if (this.str.indexOf(letter) == -1) {
            remainingAttempts --;
            return false;
        } else {
            guessedLetters.add(letter);
            return true;
        }
    }
}
   