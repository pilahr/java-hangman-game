import java.util.ArrayList;

public class ShowHint {
    RandomWord word = new RandomWord();
    PlayerInput guess = new PlayerInput();


    public void hint(String word, ArrayList<Character> playerGuesses){
        System.out.println(word); // to be removed when finish

        for (int i = 0; i < word.length(); i++) {

            if (guess.getPlayerGuesses().contains(word.charAt(i))) {
                System.out.print(word.charAt(i)+ " ");

            } else {
                System.out.print("_ ");
            }

        }

    }
}
