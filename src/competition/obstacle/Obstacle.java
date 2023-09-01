package competition.obstacle;

import competition.Contestant;

public abstract class Obstacle {
    public abstract boolean overcome(Contestant contestant);
    public int getLength() {
        return 0;
    }
    public int getHeight() {
        return 0;
    }
    public abstract String getObstacleName();
}
