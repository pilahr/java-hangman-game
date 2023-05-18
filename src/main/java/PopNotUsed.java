public class PopNotUsed {

    static String notUsed = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z";

    public static void notUsedLetters(char letter) {
        notUsed = notUsed.replace(letter, '.');

        System.out.println("Not used: " + notUsed);
    }




}
