public class GameInitialiser extends Main{

    public void startGame(){
        System.out.println("\n** Welcome to Hangman Game! **\n");

        System.out.print("Enter your name: ");
        String playerName = getInput().nextLine();
        System.out.println("Hello, player " + playerName + "\n\tLet's play!!\n");
    }
}
