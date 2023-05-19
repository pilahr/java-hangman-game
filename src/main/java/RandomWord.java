import java.util.Random;

public class RandomWord extends Main{

    final String[] WORDS = new String[] {"happy", "snake", "letter", "monitor", "network", "banana", "orange", "apple", "fizzy", "jazz", "junk", "fox", "coat", "heart", "person", "ball", "beach"  };
    private String randomWord = generateRandomWord(WORDS);
    private char[] letters = new char[randomWord.length()];

    public String getRandomWord() {
        return randomWord;
    }

    public void setRandomWord(String randomWord) {
        this.randomWord = randomWord;
    }

    public char[] getLetters() {
        return letters;
    }

    public void setLetters(char[] letters) {
        this.letters = letters;
    }

    private static String generateRandomWord(String[] words) {
        int randomNum = new Random().nextInt(words.length);
        String randomWord = words[randomNum].toUpperCase();

        System.out.println(randomWord);
        return randomWord;
    }

    public void hintWord(){
        for (int i = 0; i < randomWord.length(); i++) {
            System.out.print("_ ");
            randomWord(letters);
        }
    }

    private static void randomWord(char[] letters) {
        for (int i = 0; i< letters.length; i++){
            letters[i] = '_';
        }
    }

}
