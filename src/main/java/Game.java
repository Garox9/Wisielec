import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {

    public Random random = new Random();
    private Scanner scanner = new Scanner(System.in);


    public void mainLoop() {
        String word = String.valueOf(random.nextInt(WordsDatabase.words.length));
        Hangman hangman = new Hangman(word);
        String wordToCheck = generateWordToCheck(word);
        boolean end = false;
        while (end = false){
            printWordToCheck(wordToCheck);
            Character c = getCharFromUser();
            List<Integer> positionOfMatchedChars;
            if (hangman.doesWordContainsChar(c)){
                positionOfMatchedChars = hangman.positionsOfCharsInWord(c);
                wordToCheck = revealTheChars(positionOfMatchedChars, c);
            }
        }
    }

    private String revealTheChars(List<Integer> positionOfMatchedChars, Character character, String wordToCheck) {
        StringBuilder stringBuilder = new StringBuilder(wordToCheck);
        positionOfMatchedChars.stream()
                .forEach(p -> stringBuilder.setCharAt(p, character));
        return stringBuilder.toString();
    }


    private Character getCharFromUser() {
        System.out.println("Podaj Literę:");
        String c = scanner.nextLine();
        char ca = c.charAt(0);
        return ca;
    }

    private void printWordToCheck(String wordToCheck) {
        System.out.println("Hasło do zgadnięcia:");
        System.out.println(wordToCheck);
    }

    private String generateWordToCheck(String word) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            stringBuilder.append('*');
        }
        return stringBuilder.toString();
    }
}
