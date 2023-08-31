package competition;

public class Cat extends Contestant {
    private int runningLimit;
    private int jumpLimit;

    public Cat(int runningLimit, int jumpLimit) {
        this.runningLimit = runningLimit;
        this.jumpLimit = jumpLimit;
    }

    @Override
    public String run() {
        return "Cat run";
    }

    @Override
    public String jump() {
        return "Cat jump";
    }

    @Override
    public int getRunningLimit() {
        return runningLimit;
    }

    @Override
    public int getJumpLimit() {
        return jumpLimit;
    }
}
