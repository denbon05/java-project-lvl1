package hexlet.code.interfaces;

public enum GameData {
    question(0), answer(1);

    private int idx;

    GameData(int index) {
        this.idx = index;
    }

    public int getIdx() {
        return idx;
    }
}
