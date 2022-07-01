package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static Scanner scanner = new Scanner(System.in);

    public static String promptUserName() {
        System.out.print("May I have your name? ");
        String name = scanner.next();

        return name;
    }

    public static short promptGame(String[] games, final short exitIdx) {
        String exitValue = games[exitIdx];
        short gamesCount = (short) games.length;

        System.out.println("Please enter the game number and press Enter.");
        for (short i = 0; i < gamesCount; i += 1) {
            if (exitIdx == i) {
                continue;
            }
            System.out.println(i + " - " + games[i]);
        }
        System.out.println(exitIdx + " - " + exitValue);

        System.out.print("Your choice: ");
        short gameNumber = scanner.nextShort();
        System.out.println();

        return gameNumber;
    }
}
