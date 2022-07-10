package hexlet.code.games;

import java.util.HashMap;

import hexlet.code.Utils;
import hexlet.code.interfaces.Game;
import hexlet.code.interfaces.GameDataKeys;

public final class GCD implements Game {
    private int getGCD(int num1, int num2) {
        return (num1 % num2) == 0 ? Math.abs(num2) : getGCD(num2, num1 % num2);
    }

    public void displayRules() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    public HashMap<GameDataKeys, String> run() {
        HashMap<GameDataKeys, String> result = new HashMap<>();
        int num1 = Utils.getRandomNumber();
        int num2 = Utils.getRandomNumber();
        result.put(GameDataKeys.question, num1 + " " + num2);
        result.put(GameDataKeys.answer, String.valueOf(getGCD(num1, num2)));

        return result;
    }
}
