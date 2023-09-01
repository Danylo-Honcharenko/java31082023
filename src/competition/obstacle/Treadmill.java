package competition.obstacle;

import competition.Cat;
import competition.Contestant;
import competition.Human;
import competition.Robot;

public class Treadmill extends Obstacle {
    private int length;
    private String obstacleName = "treadmill";

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public boolean overcome(Contestant contestant) {
        System.out.printf("%s on a %d length treadmill\n", contestant.run(), length);
        if (contestant instanceof Human) {
            return length <= contestant.getRunningLimit();
        } else if (contestant instanceof Cat) {
            return length <= contestant.getRunningLimit();
        } else if (contestant instanceof Robot) {
            return length <= contestant.getRunningLimit();
        }
        return false;
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public String getObstacleName() {
        return obstacleName;
    }
}
