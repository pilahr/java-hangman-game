import java.util.*;

public class Main {

    public static void main(String[] args) {

        GameInitialiser start = new GameInitialiser();
        start.startGame();

        RandomWord randomWord = new RandomWord();

        PopNotUsed notUsed = new PopNotUsed();

        GameOver end = new GameOver();

        PlayerInput scanner = new PlayerInput();

        Lives lives = new Lives();

        randomWord.hintWord();



//        int lives = 10;

        while (Lives.lives > 0) {
            System.out.print("\nLives: ");

            Lives.printLives();

            System.out.print("Enter the letter: ");
            String input = PlayerInput.getScanner().nextLine().toUpperCase();

            char letter = input.charAt(0);

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
                System.out.println("You are the WINNER **!!");
                break;
            }
        }
        GameOver.gameOver(randomWord.getRandomWord(), Lives.lives);
    }

//    private static void printLives() {
//        for (int i=0; i<lives; i++) {
//            System.out.print("< ");
//        }
//
//        System.out.println("\nYou have " + lives + " lives left !!");
//        System.out.println("\n");
//    }


//    private static boolean isGameFinished(char[] letters) {
//        boolean isGameFinished = true;
//        System.out.print("Word: ");
//        for (int i = 0; i< letters.length; i++){
//            if (letters[i] == '_') {
//                isGameFinished = false;
//            }
//
//            System.out.print(letters[i]+ " ");
//        }
//        System.out.println();
//        return isGameFinished;
//    }


}
