package hexlet.code;

public class Utils {
    private static final int MIN_NUM = 0;
    private static final int MAX_NUM = 100;

    public static int getRandomNumber() {
        return getRandomNumber(MIN_NUM, MAX_NUM);
    }

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
