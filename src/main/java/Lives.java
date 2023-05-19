public class Lives {
    public static int lives = 10;

    public static void printLives() {
        for (int i=0; i<lives; i++) {
            System.out.print("< ");
        }
        System.out.println("\nYou have " + lives + " lives left !!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
