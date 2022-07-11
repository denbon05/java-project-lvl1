package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.interfaces.Game;
import hexlet.code.interfaces.GameData;

public final class GCD implements Game {
    private int getGCD(int num1, int num2) {
        return (num1 % num2) == 0 ? Math.abs(num2) : getGCD(num2, num1 % num2);
    }

    public void displayRules() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    public String[] run() {
        String[] result = new String[2];
        int num1 = Utils.getRandomNumber();
        int num2 = Utils.getRandomNumber();
        result[GameData.question.getIdx()] =  num1 + " " + num2;
        result[GameData.answer.getIdx()] =  String.valueOf(getGCD(num1, num2));

        return result;
    }
}
