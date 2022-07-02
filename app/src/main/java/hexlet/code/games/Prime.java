package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.interfaces.Game;

public final class Prime implements Game {
    private String positiveAnswer = "yes";
    private String negativeAnswer = "no";

    public void displayRules() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    public String getQuestion() {
        return "" + Utils.getRandomNumber();
    }

    public String getCorrectAnswer(String question) {
        final int num = Integer.parseInt(question);

        if (num < 2) {
            return negativeAnswer;
        }

        for (int n = 2; n < num / 2; n += 1) {
            if (num % n == 0) {
                return negativeAnswer;
            }
        }

        return positiveAnswer;
    }
}
