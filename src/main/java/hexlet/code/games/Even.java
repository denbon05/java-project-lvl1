package hexlet.code.games;

import java.util.HashMap;

import hexlet.code.Utils;
import hexlet.code.interfaces.Game;
import hexlet.code.interfaces.GameDataKeys;

public final class Even implements Game {
    private String positiveAnswer = "yes";
    private String negativeAnswer = "no";

    private boolean isNumberEven(int num) {
        return num % 2 == 0;
    }

    public void displayRules() {
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
    }

    public HashMap<GameDataKeys, String> run() {
        HashMap<GameDataKeys, String> result = new HashMap<>();

        int num = Utils.getRandomNumber();
        result.put(GameDataKeys.question, String.valueOf(num));

        boolean isEvenNum = this.isNumberEven(num);
        result.put(GameDataKeys.answer, isEvenNum ? positiveAnswer : negativeAnswer);

        return result;
    }
}
