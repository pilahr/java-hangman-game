import java.util.ArrayList;
import java.util.Scanner;

public class LetterGuesser extends RandomWord {

    static PlayerInput guess = new PlayerInput();
    static Lives life = new Lives();


    public static boolean printWordState(String word, ArrayList<Character> playerGuesses){
        System.out.println(word); // to be removed when finish
        int correctCount = 0;
        for (int i = 0; i < word.length(); i++) {

            if (playerGuesses.contains(word.charAt(i))) {
                System.out.print(word.charAt(i)+ " ");
                correctCount++;

            } else {
                System.out.print("_ ");
            }
        }
        System.out.println();
        return (word.length() == correctCount);
    }

    public static void getUserGuess(ArrayList<Character> playerGuesses) {
        System.out.print("Guess the letter: ");
        String theLetterGuess = getInput().nextLine().toUpperCase();
        System.out.println(theLetterGuess);
        playerGuesses.add(theLetterGuess.charAt(0));
    }

//    getPlayerGuess(playerGuesses);
//    printWordState(word, playerGuesses);

//    public static void getWinner(){
//        while (true) {
//            printWordState(secretWord(), PlayerInput.getPlayerGuesses());
//            getUserGuess(PlayerInput.getPlayerGuesses());
//
//            if (printWordState(secretWord(), PlayerInput.getPlayerGuesses())){
//                System.out.println("You win!");
//                break;
//            }
////            System.out.println("Please enter your guess for the word..");
////            if (getInput().nextLine().equals(secretWord())) {
////                System.out.println("You Won!!");
////                break;
////            }
//            else {
//                System.out.println("Nope! try again!");
//                life.loseLife();
//            }
//        }
//    }
    public static void main(String[] args) {

//        while (true) {
//            printWordState(secretWord(), guess.getPlayerGuesses() );
//            getUserGuess(guess.getPlayerGuesses());
//
//            if (printWordState(secretWord(), guess.getPlayerGuesses())){
//                System.out.println("You win!");
//                break;
//            }
//            System.out.println("Please enter your guess for the word..");
//            if (getInput().nextLine().equals(secretWord())) {
//                System.out.println("You Won!!");
//                break;
//            }
//            else {
//                System.out.println("Nope! try again!");
//                life.loseLife();
//            }
//
//        }
    }


}
