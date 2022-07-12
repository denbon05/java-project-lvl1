package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import hexlet.code.interfaces.Game;

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

    public String[] run() {
        String[] result = new String[2];

        int num1 = Utils.getRandomNumber();
        int num2 = Utils.getRandomNumber();
        char operator = this.getRandomOperator();
        result[Engine.QUESTION_IDX] = num1 + SEPARATOR + operator + SEPARATOR + num2;

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
                throw new Error("Operator " + operator + " is not handling!");
        }
        result[Engine.ANSWER_IDX] = answerValue;

        return result;
    }
}
