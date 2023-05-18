import java.util.*;

public class Main {
    private Scanner input = new Scanner(System.in);
    public Scanner getInput() {
        return input;
    }
    public void setInput(Scanner input) {
        this.input = input;
    }
    public static void main(String[] args) {

        GameInitialiser start = new GameInitialiser();
        start.startGame();


        LetterGuesser guess = new LetterGuesser();
        guess.printWordState(guess.secretWord(), guess.guess.getPlayerGuesses());


    }
}
