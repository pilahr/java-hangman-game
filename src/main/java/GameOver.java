public class GameOver {
    public static void gameOver(String randomWord, int lives) {
        if (lives == 0) {
            System.out.println("\nYou lost :(");
            System.out.println("The word was: " + randomWord);
        }
    }
}
