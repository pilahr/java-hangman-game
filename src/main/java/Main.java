import java.util.*;

public class Main {
    private static Scanner input = new Scanner(System.in);

    public static Scanner getInput() {
        return input;
    }
    public static void setInput(Scanner input) {
        Main.input = input;
    }
    public static void main(String[] args) {

        GameInitialiser start = new GameInitialiser();
        start.startGame();

        Lives life = new Lives();
        life.remainingLives();


//        LetterGuesser guess = new LetterGuesser();

//        LetterGuesser.printWordState(RandomWord.secretWord(),PlayerInput.getPlayerGuesses());
//        LetterGuesser.getUserGuess(PlayerInput.getPlayerGuesses());
//        LetterGuesser.getWinner();


        while (true) {
//            LetterGuesser.printWordState(RandomWord.secretWord(), PlayerInput.getPlayerGuesses() );
            LetterGuesser.getUserGuess(PlayerInput.getPlayerGuesses());

            if (LetterGuesser.printWordState(RandomWord.secretWord(), PlayerInput.getPlayerGuesses())){
                System.out.println("You win!");
                break;
            }
//            System.out.println("Please enter your guess for the word..");
//            if (getInput().nextLine().equals(RandomWord.secretWord())) {
//                System.out.println("You Won!!");
//                break;
//            }
            else {
                System.out.println("Nope! try again!");
                life.loseLife();
                life.remainingLives();
            }

        }
//        guess.printWordState(guess.secretWord(), guess.guess.getPlayerGuesses());




    }
}
