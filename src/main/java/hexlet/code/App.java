/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hexlet.code;


import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

public class App {
    private static String userName;
    private static int gameNumber;
    private static String[] games = {
        "Exit", "Greet", "Even", "Calc", "GCD", "Progression", "Prime"
    };

    public static void greetingInGame() {
        System.out.println("Welcome to the Brain Games!");
    }

    public static void greetingUser() {
        System.out.println("Hello, " + userName + "!");
    }

    public static void greeting() {
        App.greetingInGame();
        userName = Cli.promptUserName();
        App.greetingUser();
    }

    public static void main(String[] args) {
        final int exitIdx = 0;
        final int greetingIdx = 1;
        final int evenIdx = 2;
        final int calcIdx = 3;
        final int gcdIdx = 4;
        final int progressionIdx = 5;
        final int primeIdx = 6;

        gameNumber = Cli.promptGame(games, exitIdx);

        if (gameNumber == exitIdx) {
            return;
        }

        if (gameNumber == greetingIdx) {
            App.greeting();
            return;
        }

        App.greeting();

        switch (gameNumber) {
            case evenIdx:
                Engine.launchGame(new Even(), userName);
                break;
            case calcIdx:
                Engine.launchGame(new Calc(), userName);
                break;
            case gcdIdx:
                Engine.launchGame(new GCD(), userName);
                break;
            case progressionIdx:
                Engine.launchGame(new Progression(), userName);
                break;
            case primeIdx:
                Engine.launchGame(new Prime(), userName);
                break;
            default:
                System.out.println("There is no such game");
        }
    }
}