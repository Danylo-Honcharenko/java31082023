import competition.Cat;
import competition.Contestant;
import competition.Human;
import competition.Robot;
import competition.obstacle.Obstacle;
import competition.obstacle.Treadmill;
import competition.obstacle.Wall;
import figures.*;

public class Main {
    public static void main(String[] args) {

        FiguresProperty[] figuresProperties = {
                new Circle(2),
                new Square(5),
                new Triangle(3, 6)
        };

        // overview of elements in an array
        for(FiguresProperty fp: figuresProperties) {
            System.out.printf("Result(%s): %d\n", fp.getTypeFigure(), fp.figureArea());
        }

        // total area of all shapes
        Figure.totalAreaOfAllShapes(figuresProperties);

        System.out.println("\n======================\n");

        Contestant[] contestant = {
                new Cat(10, 7),
                new Human(14, 8),
                new Robot(10, 4)
        };

        Obstacle[] obstacle = {
                new Treadmill(30),
                new Wall(4)
        };

        for (Contestant contestants: contestant) {
            for (Obstacle obstacles: obstacle) {
                obstacles.overcome(contestants);
            }
        }
    }
}