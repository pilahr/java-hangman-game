public class GameInitialiser extends PlayerInput{

    PlayerInput input = new PlayerInput();
    public void startGame(){
        System.out.println("\n** Welcome to Hangman Game! **\n");
        System.out.println("\n--> You can enter only one letter at a time to guess the word.");
        System.out.println("--> You have ten chances before the hangman is hanged (you fail).");
        System.out.println("--> If you guess the word correctly, you win.");

        System.out.print("\nEnter your name: ");
        String playerName = input.getScanner().nextLine();
        System.out.println("Hello, player " + playerName.toUpperCase() + "\n\tLet's play!!\n");
        System.out.println("\n Guess the word below \n");
    }
}
