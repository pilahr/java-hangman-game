import java.util.ArrayList;
import java.util.Scanner;

public class PlayerInput {

    private static Scanner scanner = new Scanner(System.in);

    public static Scanner getScanner() {
        return scanner;
    }

    public static void setScanner(Scanner scanner) {
        PlayerInput.scanner = scanner;
    }
}
