package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import hexlet.code.interfaces.Game;

public final class Prime implements Game {
    private String positiveAnswer = "yes";
    private String negativeAnswer = "no";

    private String getCorrectAnswer(int num) {
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

    public String getRules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public String[] run() {
        String[] result = new String[2];
        int num = Utils.getRandomNumber();
        result[Engine.QUESTION_IDX] =  String.valueOf(num);
        result[Engine.ANSWER_IDX] = getCorrectAnswer(num);

        return result;
    }
}
