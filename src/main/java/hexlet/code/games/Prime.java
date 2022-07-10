package hexlet.code.games;

import java.util.HashMap;

import hexlet.code.Utils;
import hexlet.code.interfaces.Game;
import hexlet.code.interfaces.GameDataKeys;

public final class Prime implements Game {
    private String positiveAnswer = "yes";
    private String negativeAnswer = "no";

    public void displayRules() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    public HashMap<GameDataKeys, String> run() {
        HashMap<GameDataKeys, String> result = new HashMap<>();
        int num = Utils.getRandomNumber();
        result.put(GameDataKeys.question, String.valueOf(num));

        String answer;
        if (num < 2) {
            answer = negativeAnswer;
        } else {
            answer = positiveAnswer;

            for (int n = 2; n < num / 2; n += 1) {
                if (num % n == 0) {
                    answer = negativeAnswer;
                }
            }
        }
        result.put(GameDataKeys.answer, answer);

        return result;
    }
}
