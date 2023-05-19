public class GameFinishChecker {
    public static boolean isGameFinished(char[] letters) {
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
}
