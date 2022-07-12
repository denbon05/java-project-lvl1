package hexlet.code;

import java.util.Scanner;

import hexlet.code.interfaces.Game;

public class Engine {
    private static Scanner scanner = new Scanner(System.in);
    private static final int ATTEMPTS_COUNT = 3;

    public static final int QUESTION_IDX = 0;
    public static final int ANSWER_IDX = 1;

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
            String question = gameData[Engine.QUESTION_IDX];
            String correctAnswer = gameData[Engine.ANSWER_IDX];

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
