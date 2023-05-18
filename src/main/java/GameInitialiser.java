public class GameInitialiser extends Main{

    public void startGame(){
        System.out.println("\n** Welcome to Hangman Game! **\n");
        System.out.println("\n--> You can enter only one letter at a time to guess the word.");
        System.out.println("--> You have ten chances before the hangman is hanged (you fail).");
        System.out.println("--> If you guess the word correctly, you win.");

        System.out.print("\nEnter your name: ");
        String playerName = getInput().nextLine();
        System.out.println("Hello, player " + playerName + "\n\tLet's play!!\n");
    }
}
