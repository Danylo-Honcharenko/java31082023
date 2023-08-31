package competition.obstacle;

import competition.Contestant;

public class Treadmill implements Obstacle {
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public void overcome(Contestant contestant) {
        System.out.printf("%s on a %d length treadmill\n", contestant.run(), length);
    }

    @Override
    public int getLength() {
        return length;
    }
}
