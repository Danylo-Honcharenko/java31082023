package competition.obstacle;

import competition.Contestant;

public class Wall implements Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }
    @Override
    public void overcome(Contestant contestant) {
        System.out.printf("%s on a %d high wall\n", contestant.jump(), height);
    }

    @Override
    public int getHeight() {
        return height;
    }

}
