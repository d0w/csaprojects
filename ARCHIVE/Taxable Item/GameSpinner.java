public class GameSpinner {
    private int sectors;
    private int runs;
    private int tempRun;

    public GameSpinner(int x) {
        sectors = x;
    }

    public int spin() {
        int num = (int) (Math.random() * sectors + 1);
        if (tempRun == num) {
            runs++;
        }
        else if (tempRun != num) {
            runs = 0;
        }
        tempRun = num;
        return num;
    }


    public int currentRun() {
        return runs;
    }
}