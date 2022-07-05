package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.interfaces.Game;

public final class Even implements Game {
    private String positiveAnswer = "yes";
    private String negativeAnswer = "no";

    private boolean isNumberEven(int num) {
        return num % 2 == 0;
    }

    public void displayRules() {
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
    }

    public String getQuestion() {
        return "" + Utils.getRandomNumber();
    }

    public String getCorrectAnswer(String question) {
        final boolean isEvenNum = this.isNumberEven(Integer.parseInt(question));
        return isEvenNum ? positiveAnswer : negativeAnswer;
    }
}
