package competition;

public class Robot extends Contestant {
    private int runningLimit;
    private int jumpLimit;

    public Robot(int runningLimit, int jumpLimit) {
        this.runningLimit = runningLimit;
        this.jumpLimit = jumpLimit;
    }

    @Override
    public String run() {
        return "Robot run";
    }

    @Override
    public String jump() {
        return "Robot jump";
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
