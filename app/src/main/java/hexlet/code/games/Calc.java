package hexlet.code.games;

import hexlet.code.interfaces.Game;

public final class Calc implements Game {
    private static final int MIN_NUM = 0;
    private static final int MAX_NUM = 100;
    private static final char PLUS = '+';
    private static final char MINUS = '-';
    private static final char MULTIPLE = '*';
    private final char[] operators = {PLUS, MINUS, MULTIPLE};

    private int getRandomNumber() {
        return (int) ((Math.random() * (MAX_NUM - MIN_NUM)) + MIN_NUM);
    }

    private char getRandomOperator() {
        final int operatorsCount = this.operators.length;
        final int operatorIdx = (int) ((Math.random() * (operatorsCount - MIN_NUM) + MIN_NUM));
        return this.operators[operatorIdx];
    }

    public void displayRules() {
        System.out.println("What is the result of the expression?");
    }

    public String getQuestion() {
        final int a = this.getRandomNumber();
        final int b = this.getRandomNumber();
        final char operator = this.getRandomOperator();
        return a + " " + operator + " " + b;
    }

    public String getCorrectAnswer(String question) {
        final int aIdx = 0;
        final int bIdx = 2;
        final int operatorIdx = 1;
        final int operatorCharIdx = 0;
        String[] dividedExpression = question.split(" ");

        final int a = Integer.parseInt(dividedExpression[aIdx]);
        final int b = Integer.parseInt(dividedExpression[bIdx]);
        final char operator = dividedExpression[operatorIdx].charAt(operatorCharIdx);

        switch (operator) {
            case PLUS:
                return "" + (a + b);
            case MINUS:
                return "" + (a - b);
            case MULTIPLE:
                return "" + (a * b);
            default:
                return "";
        }
    }
}
