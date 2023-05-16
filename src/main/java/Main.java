import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("** Welcome to Hangman Game! **");
        System.out.println();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String playerName = input.nextLine();
        System.out.println("Hello, player " + playerName + " Let's play!!");
        System.out.println();


        List<String> words =
                new ArrayList<>(Arrays.asList("happy", "snake", "communication", "letter", "monitor", "application", "network"));
        Random randomWord = new Random();
        String word = words.get(randomWord.nextInt(words.size()));
        String upperCaseWord = word.toUpperCase();
        System.out.println(upperCaseWord);

        List<Character> playerGuesses = new ArrayList<>();

        for (int i = 0; i < upperCaseWord.length(); i++) {
            if (playerGuesses.contains(upperCaseWord.charAt(i))) {
                System.out.print(upperCaseWord.charAt(i));
            } else {
                System.out.print("_ ");
            }
        }
        System.out.println();
        System.out.println();


        System.out.println("Guess the letter: ");
        String theLetter = input.nextLine();
        System.out.println(theLetter);

    }
}
