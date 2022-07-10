package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static Scanner scanner = new Scanner(System.in);

    public static String promptUserName() {
        System.out.print("May I have your name? ");
        String name = scanner.next();

        return name;
    }
}
