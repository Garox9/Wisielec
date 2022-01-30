import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Hangman {

    private final String word;
    private int mistakes;

    public Hangman(String word) {
        this.word = word;
        mistakes = 0;
    }

    public String getWord() {
        return word;
    }

    public int getMistakes() {
        return mistakes;
    }

    public void setMistakes(int mistakes) {
        this.mistakes = mistakes;
    }

    public List<Integer> positionsOfCharsInWord(char c) {
        List<Integer> positions = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            if (c == word.charAt(i)) {
                positions.add(i);
            }
        }
        return positions;
    }

    public Boolean doesWordContainsChar(Character character) {
        String word = this.word;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == character)
                return true;
        }
        return false;
    }
}
