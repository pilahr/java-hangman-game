import java.util.*;

public class Main {

    public static void main(String[] args) {

        GameInitialiser start = new GameInitialiser();
        start.startGame();

        RandomWord randomWord = new RandomWord();

        randomWord.hintWord();

        while (Lives.lives > 0) {
            System.out.print("\nLives: ");

            Lives.printLives();
            DrawHangman.drawHangman();

            System.out.println("\n");
            System.out.print("Enter the letter: ");
            String input = PlayerInput.getScanner().nextLine().toUpperCase();

            char letter = input.charAt(0);
            System.out.println();

            boolean isGuessCorrect = false;
            for (int i = 0; i < randomWord.getRandomWord().length(); i++) {
                char l = randomWord.getRandomWord().charAt(i);

                if (l == letter) {
                    randomWord.getLetters()[i] = l;
                    isGuessCorrect = true;
                }
            }

            if (!isGuessCorrect) {
                Lives.lives--;
            }


            boolean isGameFinished = GameFinishChecker.isGameFinished(randomWord.getLetters());


            PopNotUsed.notUsedLetters(letter);


            if (isGameFinished){
                System.out.println("!!** You are the WINNER **!!");
                break;
            }
        }
        GameOver.gameOver(randomWord.getRandomWord(), Lives.lives);
    }

}
