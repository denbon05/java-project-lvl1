package hexlet.code.games;

import java.util.HashMap;

import hexlet.code.Utils;
import hexlet.code.interfaces.Game;
import hexlet.code.interfaces.GameDataKeys;

public final class Progression implements Game {
    private static final int MIN_PROGRESSION_LENGTH = 5;
    private static final int MAX_PROGRESSION_LENGTH = 10;
    private static final int MIN_PROGRESSION_STEP = 1;
    private static final int MAX_PROGRESSION_STEP = 5;

    private static final String GAP = "..";

    public void displayRules() {
        System.out.println("What number is missing in the progression?");
    }

    public HashMap<GameDataKeys, String> run() {
        HashMap<GameDataKeys, String> result = new HashMap<>();

        int progressionLength = Utils.getRandomNumber(MIN_PROGRESSION_LENGTH, MAX_PROGRESSION_LENGTH);
        int gapIdx = Utils.getRandomNumber(0, progressionLength);
        String[] progression = new String[progressionLength];
        int progressionStep = Utils.getRandomNumber(MIN_PROGRESSION_STEP, MAX_PROGRESSION_STEP);
        int progressionNum = Utils.getRandomNumber();

        for (int i = 0; i < progressionLength; i += 1) {
            if (i == gapIdx) {
                progression[i] = GAP;
                result.put(GameDataKeys.answer,  String.valueOf(progressionNum));
            } else {
                progression[i] = String.valueOf(progressionNum);
            }
            progressionNum += progressionStep;
        }

        result.put(GameDataKeys.question, String.join(" ", progression));

        return result;
    }
}
