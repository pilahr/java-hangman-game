import java.util.ArrayList;
import java.util.Scanner;

public class PlayerInput {

    private static ArrayList<Character> playerGuesses = new ArrayList<>();


    private static Scanner input = new Scanner(System.in);

    public static Scanner getInput() {
        return input;
    }

    public static void setInput(Scanner input) {
        PlayerInput.input = input;
    }




    public static ArrayList<Character> getPlayerGuesses() {
        return playerGuesses;
    }

    public void setPlayerGuesses(ArrayList<Character> playerGuesses) {
        this.playerGuesses = playerGuesses;
    }
}
