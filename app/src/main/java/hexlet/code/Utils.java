package hexlet.code;

public class Utils {
    private static final int MIN_NUM = 0;
    private static final int MAX_NUM = 100;

    public static int getRandomNumber() {
        return (int) ((Math.random() * (MAX_NUM - MIN_NUM)) + MIN_NUM);
    }
}
