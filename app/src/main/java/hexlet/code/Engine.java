package hexlet.code;

import java.util.Scanner;
import hexlet.code.interfaces.Game;

public class Engine {
    private static Scanner scanner = new Scanner(System.in);
    private static final int ATTEMPTS_COUNT = 3;

    public static void launchGame(Game game, String userName) {
        game.displayRules();

        for (int attemptNum = 1; attemptNum <= ATTEMPTS_COUNT; attemptNum += 1) {
            final String question = game.getQuestion();
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            final String answer = scanner.next();
            final String correctAnswer = game.getCorrectAnswer(question);

            if (!answer.equals(correctAnswer)) {
                System.out.println(
                        "'" + answer + "' " + "is wrong answer ;(. Correct answer was"
                                + " '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }

            System.out.println("Correct");
        }

        System.out.println("Congratulations, " + userName + "!");
    }
}
