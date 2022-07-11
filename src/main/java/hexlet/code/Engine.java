package hexlet.code;

import java.util.Scanner;

import hexlet.code.interfaces.Game;
import hexlet.code.interfaces.GameData;

public class Engine {
    private static Scanner scanner = new Scanner(System.in);
    private static final int ATTEMPTS_COUNT = 3;

    public static void greetingInGame() {
        System.out.println("Welcome to the Brain Games!");
    }

    public static void greetingUser(String userName) {
        System.out.println("Hello, " + userName + "!");
    }

    public static void launchGame(Game game) {
        greetingInGame();
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        greetingUser(userName);

        game.displayRules();

        for (int attemptNum = 1; attemptNum <= ATTEMPTS_COUNT; attemptNum += 1) {
            String[] gameData = game.run();
            String question = gameData[GameData.question.getIdx()];
            String correctAnswer = gameData[GameData.answer.getIdx()];

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
