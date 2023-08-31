package competition;

public class Human extends Contestant {
    private int runningLimit;
    private int jumpLimit;

    public Human(int runningLimit, int jumpLimit) {
        this.runningLimit = runningLimit;
        this.jumpLimit = jumpLimit;
    }
    @Override
    public String run() {
        return "Human run";
    }

    @Override
    public String jump() {
        return "Human jump";
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
