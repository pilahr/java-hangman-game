import java.util.ArrayList;
import java.util.Scanner;

public class PlayerInput {

    private ArrayList<Character> playerGuesses = new ArrayList<>();


    private Scanner input = new Scanner(System.in);
    public Scanner getInput() {
        return input;
    }
    public void setInput(Scanner input) {
        this.input = input;
    }



    public ArrayList<Character> getPlayerGuesses() {
        return playerGuesses;
    }

    public void setPlayerGuesses(ArrayList<Character> playerGuesses) {
        this.playerGuesses = playerGuesses;
    }
}
