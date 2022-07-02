package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.interfaces.Game;

public final class GCD implements Game {
    private static final int NUM1_IDX = 0;
    private static final int NUM2_IDX = 1;

    private int getGCD(int num1, int num2) {
        return (num1 % num2) == 0 ? Math.abs(num2) : getGCD(num2, num1 % num2);
    }

    public void displayRules() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    public String getQuestion() {
        final int num1 = Utils.getRandomNumber();
        final int num2 = Utils.getRandomNumber();
        return num1 + " " + num2;
    }

    public String getCorrectAnswer(String question) {
        final String[] nums = question.split(" ");
        final int num1 = Integer.parseInt(nums[NUM1_IDX]);
        final int num2 = Integer.parseInt(nums[NUM2_IDX]);
        return "" + getGCD(num1, num2);
    }
}
