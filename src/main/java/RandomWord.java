import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class RandomWord extends Main{

    private ArrayList<String> words =
            new ArrayList<>(Arrays.asList("happy", "snake", "communication", "letter", "monitor", "application", "network", "banana", "orange", "apple"));
    private ArrayList<Character> playerGuesses = new ArrayList<>();

    private Random randomWord = new Random();
    private String word = words.get(randomWord.nextInt(words.size())).toUpperCase();

    public String getWord() {
        return word;
    }
    public void setWord(String word) {
        this.word = word;
    }
    public ArrayList<Character> getPlayerGuesses() {
        return playerGuesses;
    }
    public void setPlayerGuesses(ArrayList<Character> playerGuesses) {
        this.playerGuesses = playerGuesses;
    }

}
