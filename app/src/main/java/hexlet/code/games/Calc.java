package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.interfaces.Game;

public final class Calc implements Game {
    private static final int NUM1_IDX = 0;
    private static final int NUM2_IDX = 2;
    private static final int OPERATOR_IDX = 1;
    private static final int OPERATOR_CHAR_IDX = 0;

    private static final char PLUS = '+';
    private static final char MINUS = '-';
    private static final char MULTIPLE = '*';
    private final char[] operators = {PLUS, MINUS, MULTIPLE};

    private char getRandomOperator() {
        final int fromIdx = 0;
        final int operatorsCount = this.operators.length;
        final int operatorIdx = (int) ((Math.random() * (operatorsCount - fromIdx) + fromIdx));
        return this.operators[operatorIdx];
    }

    public void displayRules() {
        System.out.println("What is the result of the expression?");
    }

    public String getQuestion() {
        final int num1 = Utils.getRandomNumber();
        final int num2 = Utils.getRandomNumber();
        final char operator = this.getRandomOperator();
        return num1 + " " + operator + " " + num2;
    }

    public String getCorrectAnswer(String question) {
        String[] dividedExpression = question.split(" ");

        final int num1 = Integer.parseInt(dividedExpression[NUM1_IDX]);
        final int num2 = Integer.parseInt(dividedExpression[NUM2_IDX]);
        final char operator = dividedExpression[OPERATOR_IDX].charAt(OPERATOR_CHAR_IDX);

        switch (operator) {
            case PLUS:
                return "" + (num1 + num2);
            case MINUS:
                return "" + (num1 - num2);
            case MULTIPLE:
                return "" + (num1 * num2);
            default:
                return "";
        }
    }
}
