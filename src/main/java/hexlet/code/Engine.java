package hexlet.code;

import java.util.HashMap;
import java.util.Scanner;

import hexlet.code.interfaces.Game;
import hexlet.code.interfaces.GameDataKeys;

public class Engine {
    private static Scanner scanner = new Scanner(System.in);
    private static final int ATTEMPTS_COUNT = 3;
    private static String userName;

    public static void greetingInGame() {
        System.out.println("Welcome to the Brain Games!");
    }

    public static void greetingUser(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void setUserName(String name) {
        Engine.userName = name;
    }

    public static void launchGame(Game game) {
        game.displayRules();

        for (int attemptNum = 1; attemptNum <= ATTEMPTS_COUNT; attemptNum += 1) {
            HashMap<GameDataKeys, String> gameData = game.run();
            String question = gameData.get(GameDataKeys.question);
            String correctAnswer = gameData.get(GameDataKeys.answer);

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String answer = scanner.next();

            if (!answer.equals(correctAnswer)) {
                System.out.println(
                        "'" + answer + "' " + "is wrong answer ;(. Correct answer was"
                                + " '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }

            System.out.println("Correct!");
        }

        System.out.println("Congratulations, " + userName + "!");
    }
}
