package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.interfaces.Game;

public final class Progression implements Game {
    private static final int MIN_PROGRESSION_LENGTH = 5;
    private static final int MAX_PROGRESSION_LENGTH = 10;
    private static final int MIN_PROGRESSION_STEP = 1;
    private static final int MAX_PROGRESSION_STEP = 5;

    private static final String GAP = "..";
    private static final String SEPARATOR = " ";
    private int correctAnswer;

    public void displayRules() {
        System.out.println("What number is missing in the progression?");
    }

    public String getQuestion() {
        final int progressionLength = Utils.getRandomNumber(MIN_PROGRESSION_LENGTH, MAX_PROGRESSION_LENGTH);
        final int gapIdx = Utils.getRandomNumber(0, progressionLength);
        final String[] progression = new String[progressionLength];
        final int progressionStep = Utils.getRandomNumber(MIN_PROGRESSION_STEP, MAX_PROGRESSION_STEP);
        int progressionNum = Utils.getRandomNumber();

        for (int i = 0; i < progressionLength; i += 1) {
            if (i == gapIdx) {
                progression[i] = GAP;
                correctAnswer = progressionNum;
            } else {
                progression[i] = "" + progressionNum;
            }
            progressionNum += progressionStep;
        }

        return String.join(SEPARATOR, progression);
    }

    public String getCorrectAnswer(String question) {
        return "" + correctAnswer;
    }
}
