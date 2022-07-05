package hexlet.code.interfaces;

public interface Game {
    void displayRules();

    String getQuestion();

    String getCorrectAnswer(String question);
}
