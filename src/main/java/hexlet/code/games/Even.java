package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import hexlet.code.interfaces.Game;

public final class Even implements Game {
    private String positiveAnswer = "yes";
    private String negativeAnswer = "no";

    private boolean isNumberEven(int num) {
        return num % 2 == 0;
    }

    public void displayRules() {
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
    }

    public String[] run() {
        String[] result = new String[2];

        int num = Utils.getRandomNumber();
        result[Engine.QUESTION_IDX] = String.valueOf(num);

        boolean isEvenNum = this.isNumberEven(num);
        result[Engine.ANSWER_IDX] = isEvenNum ? positiveAnswer : negativeAnswer;

        return result;
    }
}
