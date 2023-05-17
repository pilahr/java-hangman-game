import java.util.ArrayList;
import java.util.Scanner;

public class LetterGuesser extends RandomWord {

    int correctCount = 0;
    int wrongCount = 0;

    public int getCorrectCount() {
        return correctCount;
    }

    public void setCorrectCount(int correctCount) {
        this.correctCount = correctCount;
    }

    public void printWordState(String word, ArrayList<Character> playerGuesses){
        System.out.println(word); // to be removed when finish

        for (int i = 0; i < word.length(); i++) {

            if (playerGuesses.contains(word.charAt(i))) {
                System.out.print(word.charAt(i)+ " ");
                correctCount++;
            } else {
                System.out.print("_ ");
            }

        }
        System.out.println();

        System.out.print("Guess the letter: ");

        String theLetterGuess = getInput().nextLine().toUpperCase();

        System.out.println(theLetterGuess);

        getPlayerGuesses().add(theLetterGuess.charAt(0));

        printWordState(word, playerGuesses);

    }







}
