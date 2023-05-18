import java.util.*;

public class Main {

    public static void main(String[] args) {

        GameInitialiser start = new GameInitialiser();
        start.startGame();

        Scanner scanner = new Scanner(System.in);



        RandomWord randomWord = new RandomWord();

        PopNotUsed notUsed = new PopNotUsed();

        GameOver end = new GameOver();

        randomWord.hintWord();





        int lives = 10;

        while (lives > 0) {
            System.out.print("\nLives: ");

            for (int i=0; i<lives; i++) {
                System.out.print("< ");
            }

            System.out.println("\nYou have " + lives + " lives left !!");
            System.out.println("\n");

            System.out.print("Enter the letter: ");
            String input = scanner.nextLine().toUpperCase();

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
                lives--;
            }


            boolean isGameFinished = isGameFinished(randomWord.getLetters());


            PopNotUsed.notUsedLetters(letter);


            if (isGameFinished){
                System.out.println("You are the WINNER **!!");
                break;
            }
        }
        GameOver.gameOver(randomWord.getRandomWord(), lives);
    }



    private static boolean isGameFinished(char[] letters) {
        boolean isGameFinished = true;
        System.out.print("Word: ");
        for (int i = 0; i< letters.length; i++){
            if (letters[i] == '_') {
                isGameFinished = false;
            }

            System.out.print(letters[i]+ " ");
        }
        System.out.println();
        return isGameFinished;
    }


//        String notUsed = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z";
//
//        String[] words = new String[] {"happy", "snake", "letter", "monitor", "network", "banana", "orange", "apple"};
//
//
//        String randomWord = generateRandomWord(words);
//
//
//        char[] letters = new char[randomWord.length()];


//        for (int i = 0; i < randomWord.length(); i++) {
//            System.out.print("_ ");
//        }
//
//        randomWord(letters);



//        Scanner scanner = new Scanner(System.in);
//
//
//        int lives = 10;
//
//
//
//
//
//        while (lives > 0) {
//            System.out.print("\nLives: ");
//
//            for (int i=0; i<lives; i++) {
//                System.out.print("< ");
//            }
//
//            System.out.println("\nYou have " + lives + " lives left !!");
//            System.out.println("\n");
//
//            System.out.print("Enter the letter: ");
//            String input = scanner.nextLine().toUpperCase();
//
//            char letter = input.charAt(0);
//
//            boolean isGuessCorrect = false;
//            for (int i = 0; i < randomWord.length(); i++) {
//                char l = randomWord.charAt(i);
//
//                if (l == letter) {
//                    letters[i] = l;
//                    isGuessCorrect = true;
//                }
//            }
//
//            if (!isGuessCorrect) {
//                lives--;
//            }
//
//
//            boolean isGameFinished = isGameFinished(letters);
//
//
//            notUsed = notUsed.replace(letter, '.');
//
//            System.out.println("Not used: " + notUsed);
//
//
//            if (isGameFinished){
//                System.out.println("You are the WINNER **!!");
//                break;
//            }
//        }
//        gameOver(randomWord, lives);
//    }
//
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

//    private static String generateRandomWord(String[] words) {
//        int randomNum = new Random().nextInt(words.length);
//        String randomWord = words[randomNum].toUpperCase();
//
//        System.out.println(randomWord);
//        return randomWord;
//    }

//    private static void randomWord(char[] letters) {
//        for (int i = 0; i< letters.length; i++){
//            letters[i] = '_';
//        }
//    }

//    private static void gameOver(String randomWord, int lives) {
//        if (lives == 0) {
//            System.out.println("\nYou lost :(");
//            System.out.println("The word was: " + randomWord);
//        }
//    }





}
