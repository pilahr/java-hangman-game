public class DrawHangman extends Lives{

    public static void drawHangman(){

        if(Lives.lives == 10){
            System.out.println("\n\n");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("\t\t\t____________");
        } else if (Lives.lives == 9) {
            System.out.println("\n\n");
            System.out.println("\t\t\t\t|");
            System.out.println("\t\t\t\t|");
            System.out.println("\t\t\t\t|");
            System.out.println("\t\t\t\t|");
            System.out.println("\t\t\t\t|");
            System.out.println("\t\t\t\t|");
            System.out.println("\t\t\t____________");
        } else if (Lives.lives == 8) {
            System.out.println("\n\n");
            System.out.println("\t\t\t\t--------");
            System.out.println("\t\t\t\t|/");
            System.out.println("\t\t\t\t|");
            System.out.println("\t\t\t\t|");
            System.out.println("\t\t\t\t|");
            System.out.println("\t\t\t\t|");
            System.out.println("\t\t\t____________");
        } else if (Lives.lives == 7) {
            System.out.println("\n\n");
            System.out.println("\t\t\t\t--------|");
            System.out.println("\t\t\t\t|/");
            System.out.println("\t\t\t\t|");
            System.out.println("\t\t\t\t|");
            System.out.println("\t\t\t\t|");
            System.out.println("\t\t\t\t|");
            System.out.println("\t\t\t____________");
        } else if (Lives.lives == 6) {
            System.out.println("\n\n");
            System.out.println("\t\t\t\t--------|");
            System.out.println("\t\t\t\t|/     (__)");
            System.out.println("\t\t\t\t|");
            System.out.println("\t\t\t\t|");
            System.out.println("\t\t\t\t|");
            System.out.println("\t\t\t\t|");
            System.out.println("\t\t\t____________");
        } else if (Lives.lives == 5) {
            System.out.println("\n\n");
            System.out.println("\t\t\t\t--------|");
            System.out.println("\t\t\t\t|/     (__)");
            System.out.println("\t\t\t\t|       |");
            System.out.println("\t\t\t\t|       |");
            System.out.println("\t\t\t\t|");
            System.out.println("\t\t\t\t|");
            System.out.println("\t\t\t____________");
        } else if (Lives.lives == 4) {
            System.out.println("\n\n");
            System.out.println("\t\t\t\t--------|");
            System.out.println("\t\t\t\t|/     (__)");
            System.out.println("\t\t\t\t|      \\|");
            System.out.println("\t\t\t\t|       |");
            System.out.println("\t\t\t\t|");
            System.out.println("\t\t\t\t|");
            System.out.println("\t\t\t____________");
        } else if (Lives.lives == 3) {
            System.out.println("\n\n");
            System.out.println("\t\t\t\t--------|");
            System.out.println("\t\t\t\t|/     (__)");
            System.out.println("\t\t\t\t|      \\|/");
            System.out.println("\t\t\t\t|       |");
            System.out.println("\t\t\t\t|");
            System.out.println("\t\t\t\t|");
            System.out.println("\t\t\t____________");
        } else if (Lives.lives == 2) {
            System.out.println("\n\n");
            System.out.println("\t\t\t\t--------|");
            System.out.println("\t\t\t\t|/     (__)");
            System.out.println("\t\t\t\t|      \\|/");
            System.out.println("\t\t\t\t|       |");
            System.out.println("\t\t\t\t|      /");
            System.out.println("\t\t\t\t|");
            System.out.println("\t\t\t____________");
        } else if (Lives.lives == 1) {
            System.out.println("\n\n");
            System.out.println("\t\t\t\t--------|");
            System.out.println("\t\t\t\t|/     (__)");
            System.out.println("\t\t\t\t|      \\|/");
            System.out.println("\t\t\t\t|       |");
            System.out.println("\t\t\t\t|      / \\");
            System.out.println("\t\t\t\t|");
            System.out.println("\t\t\t____________");
        } else {
            System.out.println();
        }
    }
}
