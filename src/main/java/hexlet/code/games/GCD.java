package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import hexlet.code.interfaces.Game;

public final class GCD implements Game {
    private int getGCD(int num1, int num2) {
        return (num1 % num2) == 0 ? Math.abs(num2) : getGCD(num2, num1 % num2);
    }

    public String getRules() {
        return "Find the greatest common divisor of given numbers.";
    }

    public String[] run() {
        String[] result = new String[2];
        int num1 = Utils.getRandomNumber();
        int num2 = Utils.getRandomNumber();
        result[Engine.QUESTION_IDX] =  num1 + " " + num2;
        result[Engine.ANSWER_IDX] =  String.valueOf(getGCD(num1, num2));

        return result;
    }
}
