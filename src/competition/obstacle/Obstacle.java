package competition.obstacle;

import competition.Contestant;

public interface Obstacle {
    void overcome(Contestant contestant);

    default int getLength() {
        return 0;
    }

    default int getHeight() {
        return 0;
    }
}
