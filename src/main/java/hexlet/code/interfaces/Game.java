package hexlet.code.interfaces;

import java.util.HashMap;

public interface Game {
    void displayRules();

    HashMap<GameDataKeys, String> run();
}
