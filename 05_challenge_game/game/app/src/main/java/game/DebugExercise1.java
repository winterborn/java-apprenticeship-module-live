package game;

/**
 * DebugExercise
 */
public class DebugExercise1 {

    String word;

    DebugExercise1(String word) {
        this.word = word;
    }

    public static void main(String[] args) {
        DebugExercise1 debugExercise = new DebugExercise1("word");
        String result = debugExercise.getWordToGuess();
        System.out.println(result);
    }

    public String getWordToGuess() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < this.word.length(); i++) {
            Character currentLetter = word.charAt(0);
            if (i == 0) {
                builder.append(currentLetter);
                // System.out.println(currentLetter); - creates new string with first letter of given word i.e. 'w'
            } else {
                builder.append("_");
                // System.out.println(builder); - appends '_' for each successive character of given word
            }
        }
    String result = builder.toString();
    return result;
    }
    
}


