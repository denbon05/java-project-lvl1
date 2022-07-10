package hexlet.code.games;

import java.util.HashMap;

import hexlet.code.Utils;
import hexlet.code.interfaces.Game;
import hexlet.code.interfaces.GameDataKeys;

public final class Calc implements Game {
    private static final char PLUS = '+';
    private static final char MINUS = '-';
    private static final char MULTIPLE = '*';
    private char[] operators = {PLUS, MINUS, MULTIPLE};

    private static final String SEPARATOR = " ";

    private char getRandomOperator() {
        int fromIdx = 0;
        int operatorsCount = operators.length;
        int operatorIdx = Utils.getRandomNumber(fromIdx, operatorsCount);
        return operators[operatorIdx];
    }

    public void displayRules() {
        System.out.println("What is the result of the expression?");
    }

    public HashMap<GameDataKeys, String> run() {
        HashMap<GameDataKeys, String> result = new HashMap<>();

        int num1 = Utils.getRandomNumber();
        int num2 = Utils.getRandomNumber();
        char operator = this.getRandomOperator();
        result.put(GameDataKeys.question, num1 + SEPARATOR + operator + SEPARATOR + num2);

        String answerValue;
        switch (operator) {
            case PLUS:
                answerValue = String.valueOf(num1 + num2);
                break;
            case MINUS:
                answerValue = String.valueOf(num1 - num2);
                break;
            case MULTIPLE:
                answerValue = String.valueOf(num1 * num2);
                break;
            default:
                answerValue = "";
                break;
        }
        result.put(GameDataKeys.answer, answerValue);

        return result;
    }
}
