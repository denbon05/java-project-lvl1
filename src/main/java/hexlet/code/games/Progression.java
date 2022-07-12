package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import hexlet.code.interfaces.Game;

public final class Progression implements Game {
    private static final int MIN_PROGRESSION_LENGTH = 5;
    private static final int MAX_PROGRESSION_LENGTH = 10;
    private static final int MIN_PROGRESSION_STEP = 1;
    private static final int MAX_PROGRESSION_STEP = 5;

    private static final String GAP = "..";

    public void displayRules() {
        System.out.println("What number is missing in the progression?");
    }

    public String[] run() {
        String[] result = new String[2];

        int progressionLength = Utils.getRandomNumber(MIN_PROGRESSION_LENGTH, MAX_PROGRESSION_LENGTH);
        int gapIdx = Utils.getRandomNumber(0, progressionLength);
        String[] progression = new String[progressionLength];
        int progressionStep = Utils.getRandomNumber(MIN_PROGRESSION_STEP, MAX_PROGRESSION_STEP);
        int progressionNum = Utils.getRandomNumber();

        for (int i = 0; i < progressionLength; i += 1) {
            if (i == gapIdx) {
                progression[i] = GAP;
                result[Engine.ANSWER_IDX] =   String.valueOf(progressionNum);
            } else {
                progression[i] = String.valueOf(progressionNum);
            }
            progressionNum += progressionStep;
        }

        result[Engine.QUESTION_IDX] =  String.join(" ", progression);

        return result;
    }
}
