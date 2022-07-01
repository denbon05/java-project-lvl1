package hexlet.code.games;

import hexlet.code.interfaces.Game;

public final class Even implements Game {
    private String positiveAnswer = "yes";
    private String negativeAnswer = "no";
    private static final int MIN_NUM = 0;
    private static final int MAX_NUM = 100;

    private int getRandomNumber() {
        return (int) ((Math.random() * (MAX_NUM - MIN_NUM)) + MIN_NUM);
    }

    private boolean isNumberEven(int num) {
        return num % 2 == 0;
    }

    public void displayRules() {
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
    }

    public String getQuestion() {
        return "" + this.getRandomNumber();
    }

    public String getCorrectAnswer(String question) {
        final boolean isEvenNum = this.isNumberEven(Integer.parseInt(question));
        return isEvenNum ? positiveAnswer : negativeAnswer;
    }
}
