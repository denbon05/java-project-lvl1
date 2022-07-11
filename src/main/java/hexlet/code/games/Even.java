package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.interfaces.Game;
import hexlet.code.interfaces.GameData;

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
        result[GameData.question.getIdx()] = String.valueOf(num);

        boolean isEvenNum = this.isNumberEven(num);
        result[GameData.answer.getIdx()] = isEvenNum ? positiveAnswer : negativeAnswer;

        return result;
    }
}
