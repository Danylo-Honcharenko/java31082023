package competition.obstacle;

import competition.Cat;
import competition.Contestant;
import competition.Human;
import competition.Robot;

public class Wall extends Obstacle {
    private int height;
    private String obstacleName = "wall";

    public Wall(int height) {
        this.height = height;
    }
    @Override
    public boolean overcome(Contestant contestant) {
        System.out.printf("%s on a %d high wall\n", contestant.jump(), height);
        if (contestant instanceof Human) {
            return height <= contestant.getJumpLimit();
        } else if (contestant instanceof Cat) {
            return height <= contestant.getJumpLimit();
        } else if (contestant instanceof Robot) {
            return height <= contestant.getJumpLimit();
        }
        return false;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public String getObstacleName() {
        return obstacleName;
    }
}
