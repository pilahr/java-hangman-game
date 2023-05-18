public class Lives {

    RandomWord word = new RandomWord();


    public void gameOver() {
        int lives = 10;
        if (lives == 0) {
            System.out.println("You lost");
            System.out.println("The word was: " + word.secretWord());
        }
    }
}
