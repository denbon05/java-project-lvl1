package hexlet.code.games;

import java.util.Scanner;

import hexlet.code.interfaces.Game;

public class Even implements Game {
    private static Scanner scanner = new Scanner(System.in);

    private int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    private boolean isNumberEven(int num) {
        return num % 2 == 0;
    }

    public final void displayRules() {
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
    }

    /* (non-Javadoc)
     * Run the Even game
     */
    public final boolean run() {
        final int num = this.getRandomNumber(0, 100);
        final boolean isEvenNum = this.isNumberEven(num);
        final String positiveAnswer = "yes";
        final String negativeAnswer = "no";

        System.out.println("Question: " + num);
        System.out.print("Your answer: ");
        String answer = scanner.next();
        final boolean isAnswerCorrect = (answer.equals(positiveAnswer) && isEvenNum)
                || (answer.equals(negativeAnswer) && !isEvenNum);
        final String correctAnswer = isEvenNum ? positiveAnswer : negativeAnswer;

        if (isAnswerCorrect) {
            System.out.println("Correct");
            return true;
        }

        System.out.println(
                "'" + answer + "'" + "is wrong answer ;(. Correct answer was"
                        + "'" + correctAnswer + "'.");
        return false;
    }
}
